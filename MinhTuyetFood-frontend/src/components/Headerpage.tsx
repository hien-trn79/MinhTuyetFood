import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import NavbarItem from "./header-components/NavbarItem";
import type { Account } from "../model/account";
import AccountLogo from "./header-components/AccountLogo";

export default function Headerpage() {
  const [account, setaccount] = useState<Account | null>(null);

  useEffect(() => {
    const isLoggedIn = localStorage.getItem("isLoggedIn");
    const accountEmail = localStorage.getItem("accountEmail");

    const fetchAccountByEmail = async (email: string) => {
      try {
        const response = await fetch(
          "http://localhost:8080/api/accounts/" + email,
        );
        if (response.ok) {
          const accountData = await response.json();
          setaccount(accountData);
        }
      } catch (error) {
        console.error("Error fetching account:", error);
      }
    };

    fetchAccountByEmail(accountEmail as string);
  }, []);

  return (
    <header className="page-header flex items-center justify-between px-8 py-2 ">
      <div className="logo_side">
        <Link to="/">
          LOGO
          <img src="" alt="" className="logo-img" />
        </Link>
      </div>
      <nav className="navbar_side ">
        <ul className="navbar--lists flex items-center gap-4">
          <NavbarItem link="/" text="Home" />
          <NavbarItem link="/menu" text="Menu" />
          <NavbarItem link="/about" text="About Us" />
          <NavbarItem link="/contact" text="Contact" />
          <NavbarItem link="/orders" text="Orders" />

          <div className="account_side">
            {account ? (
              <AccountLogo accountEmail={account.accountEmail}/>
            ) : (
              <button className="bg-white text-green-500 font-bold py-2 px-4 rounded-xl hover:bg-gray-200">
                <Link to="/login">Login</Link>
              </button>
            )}
          </div>
        </ul>
      </nav>
    </header>
  );
}

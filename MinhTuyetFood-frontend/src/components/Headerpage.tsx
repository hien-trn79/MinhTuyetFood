import { useState } from "react";
import { Link } from "react-router-dom";
import NavbarItem from "./header-components/NavbarItem";

export default function Headerpage() {
  const [user, setUser] = useState(null);

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
            {user ? (
              <p>Welcome, User!</p>
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

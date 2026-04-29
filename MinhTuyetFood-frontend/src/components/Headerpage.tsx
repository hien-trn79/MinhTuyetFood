import NavbarItem from "./header-components/NavbarItem";

export default function Headerpage() {
  return (
    <header className="page-header flex items-center justify-between px-8 py-2 bg-green-300">
      <div className="logo_side">
        LOGO
        <img src="" alt="" className="logo-img" />
      </div>
      <nav className="navbar_side ">
        <ul className="navbar--lists flex items-center gap-4">
          <NavbarItem link="/" text="Home" />
          <NavbarItem link="/menu" text="Menu" />
          <NavbarItem link="/about" text="About Us" />
          <NavbarItem link="/contact" text="Contact" />
        </ul>
      </nav>
    </header>
  );
}

interface NavbarItemProps {
  link: string;
  text: string;
}

export default function NavbarItem({ link, text }: NavbarItemProps) {
  return (
    <li className="navbar--item min-w-[120px] text-center px-4 py-2 rounded hover:bg-green-600 transition-colors duration-100 hover:text-white">
      <a
        href={link}
        className="navbar--item_link text-xl font-bold text-gray-800 hover:text-white"
      >
        {text}
      </a>
    </li>
  );
}

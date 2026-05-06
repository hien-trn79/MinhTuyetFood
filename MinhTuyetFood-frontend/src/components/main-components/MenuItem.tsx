import { useRef, useState } from "react";
import TypeBox from "./TypeBox";
interface MenuItemProps {
  id: number;
  name: string;
  description: string;
  price: number;
  imageUrl: string;
}

export default function MenuItem({
  id,
  name,
  description,
  price,
  imageUrl,
}: MenuItemProps) {
  const [showtTypeBox, setShowTypeBox] = useState(false);
  const [selectedFoodId, setSelectedFoodId] = useState<number>(-1);

  const handleSubmit = async (id: number) => {
    try {
      setSelectedFoodId(id);
      const typeBoxElement = document.querySelectorAll(".typebox-list");
      typeBoxElement.forEach((element) => {
        element.classList.add("hidden");
      });
      const selectedMenu = document.getElementById(`menu-item-${id}`);
      selectedMenu?.querySelector(".typebox-list")?.classList.remove("hidden");

      setShowTypeBox(true);
    } catch (error) {
      throw new Error(`Failed to fetch food data for id ${id}: ${error}`);
    }
  };

  return (
    <div
      className="menu-item bg-green-50 p-2 rounded-lg shadow-md relative"
      id={`menu-item-${id}`}
    >
      {showtTypeBox ? (
        <TypeBox setCloseTypeBox={setShowTypeBox} foodId={selectedFoodId} />
      ) : null}
      <img src={imageUrl} alt={name} className="menu-item-image " />
      <div className="menu-item_content px-3 py-2">
        <h2 className="menu-item-name text-xl font-bold mt-2">{name}</h2>
        <p className="menu-item-description mt-3">{description}</p>
        <p className="menu-item-price text-red-600 font-bold text-right text-xl">
          ${price.toFixed(2)}
        </p>
      </div>
      <div className="menu-item_submit" onClick={() => handleSubmit(id)}>
        <button className="submit_menuItem hover:cursor-pointer bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-xl">
          Choose
        </button>
      </div>
    </div>
  );
}

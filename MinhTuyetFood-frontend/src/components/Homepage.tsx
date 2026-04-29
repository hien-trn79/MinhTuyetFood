import MenuItem from "./main-components/MenuItem";
import "../styles/main-component.css";

export default function Homepage() {
  return (
    <div className="homepage">
      <h1 className="font-bold text-3xl p-2">Menu Minh Tuyet Foods</h1>

      <div className="menu">
        {/* Menu items will be displayed here */}
        <MenuItem
          name="Delicious Dish"
          description="A tasty dish made with fresh ingredients."
          price={9.99}
          imageUrl="/food-default.jpg"
        />
        <MenuItem
          name="Delicious Dish"
          description="A tasty dish made with fresh ingredients."
          price={9.99}
          imageUrl="/food-default.jpg"
        />

        <MenuItem
          name="Delicious Dish"
          description="A tasty dish made with fresh ingredients."
          price={9.99}
          imageUrl="/food-default.jpg"
        />
        <MenuItem
          name="Delicious Dish"
          description="A tasty dish made with fresh ingredients."
          price={9.99}
          imageUrl="/food-default.jpg"
        />
      </div>
    </div>
  );
}

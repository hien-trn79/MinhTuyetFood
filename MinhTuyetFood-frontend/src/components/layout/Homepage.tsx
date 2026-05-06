import MenuItem from "../main-components/MenuItem";
import "../../styles/main-component.css";
import { useEffect, useState } from "react";
import type { Food } from "../../model/food";

export default function Homepage() {
  const [foods, setFoods] = useState<Food[] | null>(null);

  useEffect(() => {
    const fetchFoods = async () => {
      try {
        const response = await fetch("http://localhost:8080/api/foods");
        const data: Food[] = await response.json();
        console.log("Fetched foods data:", data);
        setFoods(data);
      } catch (error) {
        console.error("Error fetching foods:", error);
      }
    };
    fetchFoods();
  }, []);

  useEffect(() => {
    if (foods) {
      console.log("Fetched foods:", foods);
    }
  }, [foods]);

  return (
    <div className="homepage">
      <h1 className="font-bold text-3xl p-2">Menu Minh Tuyet Foods</h1>

      {/* <LoginPage /> */}

      <div className="menu">
        {foods ? (
          foods.map((foodItem: Food) => {
            return (
              <MenuItem
                id={foodItem.foodId}
                name={foodItem.foodName}
                description={foodItem.foodDescription || "Delicious food item"}
                price={foodItem.foodPrice}
                imageUrl={foodItem.foodImage || "/food-default.jpg"}
              />
            );
          })
        ) : (
          <p>Loading...</p>
        )}
      </div>
    </div>
  );
}

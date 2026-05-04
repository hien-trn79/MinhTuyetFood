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
  const getFoodById = async (id: number) => {
    try {
      const response = await fetch(`http://localhost:8080/api/foods/${id}`);
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const food = await response.json();
      return food;
    } catch (error) {
      console.error(`Error fetching food with id ${id}:`, error);
      throw error;
    }
  };

  const handleSubmit = async (id: number) => {
    try {
      const foodData = await getFoodById(id);
      console.log("Fetched food data:", foodData);
    } catch (error) {
      throw new Error(`Failed to fetch food data for id ${id}: ${error}`);
    }
  };

  return (
    <div className="menu-item bg-green-50 p-2 rounded-lg shadow-md">
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

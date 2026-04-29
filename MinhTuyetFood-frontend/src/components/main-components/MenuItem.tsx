interface MenuItemProps {
  name: string;
  description: string;
  price: number;
  imageUrl: string;
}

export default function MenuItem({
  name,
  description,
  price,
  imageUrl,
}: MenuItemProps) {
  return (
    <div className="menu-item">
      <img src={imageUrl} alt={name} className="menu-item-image" />
      <h2 className="menu-item-name">{name}</h2>
      <p className="menu-item-description">{description}</p>
      <p className="menu-item-price">${price.toFixed(2)}</p>
    </div>
  );
}

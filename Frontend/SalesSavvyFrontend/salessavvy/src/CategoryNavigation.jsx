import React from "react";

export function CategoryNavigation({ onCategoryClick }) {
    const categories = ['Shirts', 'Pants', 'Accessories', 'Mobiles', 'Mobile Accessories'];

    return (
        <nav className="category-navigation">
            <ul className="category-list">
                {categories.map((category, index) => (
                    <li 
                    key={index}
                    className="category-items"
                    onClick={() => onCategoryClick(category)}
                    >
                        {category}
                    </li>
                ))}
            </ul>
        </nav>
    );
}
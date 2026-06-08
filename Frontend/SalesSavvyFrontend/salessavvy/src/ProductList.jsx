import React from 'react';
// import './assets/styles.css';

export function ProductList({ products, onAddToCart }) {

  if (products.length === 0) {
    return <p className="no-products">No products available.</p>;
  }

  return (
    <div className="product-list">
      <div className="product-grid">
        {products.map((product) => {

          console.log(product);

          return (
            <div key={product.product_id} className="product-card">

              <img
                src={product.images[0]}
                alt={product.name}
                className="product-image"
                loading="lazy"
                onError={(e) => {
                  e.target.src = 'https://via.placeholder.com/150';
                }}
              />

              <div className="product-info">

                <h3 className="product-name">
                  {product.name}
                </h3>

                <p className="product-description">
                  {product.description}
                </p>

                <p className="product-price">
                  ₹{product.price}
                </p>

                <button
                    className="add-to-cart-btn"
                    onClick={() => {
                      // console.log("Clicked Product =", product);
                      // console.log("Product ID =", product.id);
                      onAddToCart(product.product_id);
                    }}
                  >
                    Add to Cart
                </button>

              </div>
            </div>
          );
        })}

      </div>
    </div>
  );
}
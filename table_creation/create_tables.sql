-- Main Entities
CREATE TABLE cutlery (
  id VARCHAR(50) PRIMARY KEY UNIQUE,
  name VARCHAR(50),
  quantity INTEGER
);

CREATE TABLE menu_item (
  id VARCHAR(36) PRIMARY KEY UNIQUE,
  name VARCHAR(50),
  quantity INTEGER,
  price FLOAT,
  category VARCHAR(50)
);

CREATE TABLE orders (
  id VARCHAR(36) PRIMARY KEY UNIQUE,
  date_time TIMESTAMP,
  total_price FLOAT
);

-- Relationship Entities
CREATE TABLE ordered_menu_item (
  order_id VARCHAR(50) REFERENCES orders(id),
  menuitem_id VARCHAR(50) REFERENCES menu_item(id),
  quantity INTEGER
);

CREATE TABLE menu_item_cutlery (
  menu_item_id VARCHAR(36) REFERENCES menu_item(id),
  cutlery_id VARCHAR(36) REFERENCES cutlery(id),
  quantity INTEGER
);

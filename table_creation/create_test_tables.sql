-- Main Entities
CREATE TABLE cutlery_test (
  id VARCHAR(50) PRIMARY KEY UNIQUE,
  name VARCHAR(50),
  quantity INTEGER
);

CREATE TABLE menu_item_test (
  id VARCHAR(36) PRIMARY KEY UNIQUE,
  name VARCHAR(50),
  quantity INTEGER,
  price FLOAT,
  category VARCHAR(50)
);

CREATE TABLE orders_test (
  id VARCHAR(36) PRIMARY KEY UNIQUE,
  date_time TIMESTAMP,
  total_price FLOAT
);

-- Relationship Entities
CREATE TABLE ordered_menu_item_test (
  order_id VARCHAR(50) REFERENCES orders(id),
  menuitem_id VARCHAR(50) REFERENCES menu_item(id),
  quantity INTEGER
);

CREATE TABLE menu_item_cutlery_test (
  menu_item_id VARCHAR(36) REFERENCES menu_item(id),
  cutlery_id VARCHAR(36) REFERENCES cutlery(id),
  quantity INTEGER
);

\copy cutlery_test (id, name, quantity) FROM 'Cutlery.csv' DELIMITER ',' CSV HEADER;
\copy menu_item_test (id, name, quantity, price, category) FROM 'MenuItem.csv' DELIMITER ',' CSV HEADER;
\copy orders_test (id, date_time, total_price) FROM 'Order.csv' DELIMITER ',' CSV HEADER;
\copy menu_item_cutlery_test (menu_item_id, cutlery_id, quantity) FROM 'MenuItemCutlery.csv' DELIMITER ',' CSV HEADER;
\copy ordered_menu_item_test (order_id, menuitem_id, quantity) FROM 'OrderedMenuItem.csv' DELIMITER ',' CSV HEADER;

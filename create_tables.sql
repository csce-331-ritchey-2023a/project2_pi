-- Main Entities
CREATE TABLE Cutlery (
  id VARCHAR(50) PRIMARY KEY UNIQUE,
  name VARCHAR(50),
  quantity INTEGER
);

CREATE TABLE MenuItem (
  id VARCHAR(36) PRIMARY KEY UNIQUE,
  name VARCHAR(50),
  price FLOAT,
  category VARCHAR(50)
);

CREATE TABLE Order (
  id VARCHAR(36) PRIMARY KEY UNIQUE,
  date VARCHAR(50),
  time VARCHAR(50),
  total_price FLOAT
);

-- Relationship Entities
CREATE TABLE OrderedMenuItem (
  order_id VARCHAR(50) REFERENCES Order(id),
  menuitem_id VARCHAR(50) REFERENCES MenuItem(id),
  quantity INTEGER
);

CREATE TABLE MenuItemCutlery (
  menu_item_id VARCHAR(36) REFERENCES MenuItem(id),
  cutlery_id VARCHAR(36) REFERENCES Cutlery(id),
  quantity INTEGER
);


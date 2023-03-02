-- library for our UUIDs
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Main Entities
CREATE TABLE Cutlery (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v1(),
  name VARCHAR(50),
  quantity INTEGER
);

CREATE TABLE MenuItemCutlery (
  menu_item_id UUID REFERENCES MenuItem(id),
  cutlery_id UUID REFERENCES Cutlery(id),
  quantity INTEGER
);

CREATE TABLE MenuItem (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v1(),
  name VARCHAR(50),
  price FLOAT,
  category VARCHAR(50)
);

-- Relationship Entities
CREATE TABLE OrderedMenuItem (
  order_id UUID REFERENCES Order(id),
  menuitem_id UUID REFERENCES MenuItem(id),
  quantity INTEGER
);

CREATE TABLE Order (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v1(),
  date VARCHAR(50),
  time VARCHAR(50),
  total_price FLOAT
);

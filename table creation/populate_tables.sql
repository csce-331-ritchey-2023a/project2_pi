\copy Cutlery (id, name, quantity) FROM 'Cutlery.csv' DELIMITER ',' CSV HEADER;
\copy MenuItemCutlery (menu_item_id, cutlery_id, quantity) FROM 'MenuItemCutlery.csv' DELIMITER ',' CSV HEADER;
\copy MenuItem (id, name, price, category) FROM 'MenuItem.csv' DELIMITER ',' CSV HEADER;
\copy OrderedMenuItem (order_id, menuitem_id, quantity) FROM 'OrderedMenuItem.csv' DELIMITER ',' CSV HEADER;
\copy Order (id, date, time, total_price) FROM 'Order.csv' DELIMITER ',' CSV HEADER;

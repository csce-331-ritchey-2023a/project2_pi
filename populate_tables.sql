\copy cutlery (id, name, quantity) FROM 'Cutlery.csv' DELIMITER ',' CSV HEADER;
\copy menu_item (id, name, quantity, price, category) FROM 'MenuItem.csv' DELIMITER ',' CSV HEADER;
\copy orders (id, date_time, total_price) FROM 'Order.csv' DELIMITER ',' CSV HEADER;
\copy menu_item_cutlery (menu_item_id, cutlery_id, quantity) FROM 'MenuItemCutlery.csv' DELIMITER ',' CSV HEADER;
\copy ordered_menu_item (order_id, menuitem_id, quantity) FROM 'OrderedMenuItem.csv' DELIMITER ',' CSV HEADER;

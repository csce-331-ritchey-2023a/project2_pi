SELECT mi.name, SUM(omi.quantity) as total_quantity
FROM menu_item mi
JOIN ordered_menu_item omi ON mi.id = omi.menuitem_id
GROUP BY mi.id
ORDER BY total_quantity DESC
LIMIT 1;

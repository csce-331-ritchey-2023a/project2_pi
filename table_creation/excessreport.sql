SELECT mi.id, mi.name, mi.quantity
FROM menu_item mi
INNER JOIN ordered_menu_item omi ON mi.id = omi.menuitem_id
INNER JOIN orders o ON omi.order_id = o.id
LEFT JOIN (
    SELECT omi.menuitem_id, SUM(quantity) AS total_sold
    FROM ordered_menu_item omi
    GROUP BY omi.menuitem_id
) AS omi_totals ON mi.id = omi_totals.menuitem_id
WHERE o.date_time >= '2023-01-01 00:00:00' AND omi_totals.total_sold < mi.quantity * 0.1;


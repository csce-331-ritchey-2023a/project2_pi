SELECT DATE_TRUNC('day', o.date_time) as day, SUM(mic.quantity * omi.quantity) as total_sales
FROM orders o
JOIN ordered_menu_item omi ON omi.order_id = o.id
JOIN menu_item mi ON mi.id = omi.menuitem_id
JOIN menu_item_cutlery mic ON mic.menu_item_id = mi.id
JOIN cutlery c ON c.id = mic.cutlery_id
WHERE c.id = '15b4c496-b7ca-11ed-8be6-00155d0752bf'
AND o.date_time >= CURRENT_DATE - INTERVAL '6 months' -- filter data from the last 6 months
GROUP BY day
ORDER BY day ASC;

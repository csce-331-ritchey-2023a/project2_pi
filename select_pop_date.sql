SELECT DATE_TRUNC('day', date_time) AS sales_day, SUM(total_price) AS total_sales
FROM orders
WHERE date_time >= NOW() - INTERVAL '7 days'
GROUP BY sales_day
ORDER BY total_sales DESC
LIMIT 1;

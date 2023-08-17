select s.product_id, p.product_name
from Sales s
     left join Product p
     ON s.product_id = p.product_id
group by s.product_id
having min(sale_date) >= cast('2019-01-01' AS DATE)
   and max(sale_date) <= cast('2019-03-31' AS DATE)

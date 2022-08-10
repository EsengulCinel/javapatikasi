select title,description  from film

select length from film WHERE length>='60' AND length<'75'

select * from film where rental_rate='0.99' and replacement_cost ='12.99' or replacement_cost ='28.99'

select length,rental_rate from film where length < '50' and not (rental_rate = '2.99' or rental_rate ='4.99')

select title,description  from film

select length from film WHERE length>='60' AND length<'75'

select * from film where rental_rate='0.99' and replacement_cost ='12.99' or replacement_cost ='28.99'

select length,rental_rate from film where length < '50' and not (rental_rate = '2.99' or rental_rate ='4.99')

select replacement_cost from film where replacement_cost Between 12.99 and 16.99

select first_name,last_name from actor where first_name IN ('Penelope', 'Nick', 'Ed')

select DISTINCT film_id from film

select count( DISTINCT replacement_cost) FROM film


select COUNT(*) from film where title LIKE 'T%' and rating='G'

select count(*) from city where city LIKE 'R%r'

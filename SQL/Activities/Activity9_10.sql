REM   Script: Activity_9_10
REM   Activity_9_10

select * from customers;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select * from customers;

select a.customer_name,b.salesman_name from customers a, salesman b where a.salesman_id=b.salesman_id;

select a.customer_name,b.salesman_name from customers a INNER JOIN salesman b where a.salesman_id=b.salesman_id;

select a.customer_name,b.salesman_name from customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

select * from orders;

select * from customers;

select * from salesman;

select * from customers;

select * from salesman;

select a.customer_name,a.city,a.grade,a.salesman_id from customers a LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id where a.grade<300 order by a.grade;

select a.customer_name,a.city,a.grade,a.salesman_id,b.salesman_name,b.commission from customers a LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id where a.grade<300 order by a.grade;

select * from salesman;

select * from customers;

select * from salesman;

select * from orders;

select a.customer_name,a.city,b.salesman_id,b.salesman_name,b.salesman_city,b.commission from customers a right inner join salesman b ON a.salesman_id=b.salesman_id where b.commission>12 
 
;

select a.customer_name,a.city,b.salesman_id,b.salesman_name,b.salesman_city,b.commission from customers a RIGHT INNER JOIN salesman b ON a.salesman_id=b.salesman_id where b.commission>12;

select a.customer_name,a.city,b.salesman_id,b.salesman_name,b.salesman_city,b.commission from customers a OUTER JOIN salesman b ON a.salesman_id=b.salesman_id where b.commission>12;

select a.customer_name,a.city,b.salesman_id,b.salesman_name,b.salesman_city,b.commission from customers a INNER JOIN salesman b ON a.salesman_id=b.salesman_id where b.commission>12;

select * from orders;

select * from customers;

select * from salesman;

select * from orders;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,b.city,c.salesman_id,c.salesman_name,c.commission from orders a FULL JOIN customers b,salesman c ON a.customer_id=b.customer_id AND b.salesman_id=c.salesman_id;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,b.city,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b,salesman c ON a.customer_id=b.customer_id AND b.salesman_id=c.salesman_id;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,b.city,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b salesman c ON a.customer_id=b.customer_id AND b.salesman_id=c.salesman_id;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,b.city,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b salesman c ON (a.customer_id=b.customer_id AND b.salesman_id=c.salesman_id);

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,b.city,c.salesman_id,c.salesman_name,c.commission from orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id   
INNER JOIN salesman c ON b.salesman_id=c.salesman_id;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,b.city as "Customer City",c.salesman_id,c.salesman_name,c.commission from orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id   
INNER JOIN salesman c ON b.salesman_id=c.salesman_id;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,c.salesman_id,c.salesman_name,c.commission from orders INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON b.salesman_id=c.salesman_id where a.customer_id='3007';

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON b.salesman_id=c.salesman_id where a.customer_id='3007';

select * from orders;

select * from orders;

select * from customers;

select * from salesman;

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b ON a.customer_id=b.customer_id 
RIGHT OUTER JOIN salesman c ON b.salesman_id=c.salesman_id where a.customer_id='3007';

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b ON a.customer_id=b.customer_id 
LEFT OUTER JOIN salesman c ON b.salesman_id=c.salesman_id where a.customer_id='3007';

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b ON a.customer_id=b.customer_id 
 FULL JOIN salesman c ON b.salesman_id=c.salesman_id where a.customer_id='3007';

select a.order_no,a.purchase_amount,a.order_date,b.customer_id,b.customer_name,c.salesman_id,c.salesman_name,c.commission from orders a INNER JOIN customers b ON a.customer_id=b.customer_id 
 LEFT OUTER JOIN salesman c ON b.salesman_id=c.salesman_id where a.customer_id='3007';

select * from orders where customer_id=3007;

select * from orders;

select * from salesman;

select * from customers;

select * from orders where salesman_id=(select distinct salesman_id where customer_id=3007);

select * from orders where salesman_id=(select distinct(salesman_id) from customers where customer_id=3007);

select * from orders where salesman_id=(select distinct(salesman_id) from customers where customer_id='3007');

select * from orders where  customer_id='3007';

select * from customers;

select * from orders where salesman_id=(select distinct(salesman_id) from orders where customer_id='3007');

select * from orders where salesman_id=(select distinct(salesman_id) from salesman where salesman_city='New York');

select * from salesman;

update salesman set salesman_city='New York' where salesman_id=5006;

select * from orders where salesman_id=(select distinct(\salesman_id from salesman where salesman_city='New York');

select * from orders where salesman_id=(select distinct(salesman_id from salesman where salesman_city='New York');

select * from orders where salesman_id=(select distinct(salesman_id) from salesman where salesman_city='New York');

select * from orders where salesman_id in (select distinct(salesman_id) from salesman where salesman_city='New York');

select * from orders;

select * from customers;

select * from salesman;

select * from customers;

select count(distinct(customer_id)) from customers where grade > (select avg(grade) from customers where city='New York');

select count(*),grade from customers group by customer_id where grade > (select avg(grade) from customers where city='New York');

select count(*) from customers group by customer_id where grade > (select avg(grade) from customers where city='New York');

select grade,count(*) from customers group by customer_id where grade > (select avg(grade) from customers where city='New York');

select grade,count(*) from customers group by customer_id having grade > (select avg(grade) from customers where city='New York');

select grade,count(*) from customers group by grade having grade > (select avg(grade) from customers where city='New York');

select grade,count(*) as "Customer count" from customers group by grade having grade > (select avg(grade) from customers where city='New York');

select * from orders where salesman_id=(select max(commission) from salesman);

select * from salesman;

select * from orders where salesman_id=(select salesman_id from salesman where commission=(select max(commission) from salesman));

select a.*,b.commission from orders a,salesman b where a.salesman_id=(select b.salesman_id from salesman where b.commission=(select max(b.commission) from salesman));

select * from orders,salesman where salesman_id=(select salesman_id from salesman where commission=(select max(commission) from salesman));

select * from orders where salesman_id=(select salesman_id from salesman where commission=(select max(commission) from salesman));

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

select * from orders where salesman_id=(select salesman_id from salesman where commission=(select max(commission) from salesman));


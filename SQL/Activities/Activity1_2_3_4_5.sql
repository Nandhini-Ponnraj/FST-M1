REM   Script: Activity_1_2_3_4_5
REM   SQL activities from 1 to 5

	CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

	CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


DESCRIBE salesman


DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission) values(5001,'JAMES HOOG','New york',15);

select 1 from DUAL;

INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission) values(5001,'JAMES HOOG','New york',15);

select 1 from DUAL;

INSERT ALL  
INTO salesman(5002,'Nail Knite','Paris',13), 
INTO salesman(5003,'Pit Alex','London',11), 
INTO salesman(5004,'McLyon','Paris',14), 
INTO salesman(5005,'Lauson Hen','San Hose',12);

select 1 from DUAL;

INSERT ALL  
INTO salesman values(5002,'Nail Knite','Paris',13), 
INTO salesman values(5003,'Pit Alex','London',11), 
INTO salesman values(5004,'McLyon','Paris',14), 
INTO salesman values(5005,'Lauson Hen','San Hose',12);

select 1 from DUAL;

INSERT ALL  
INTO salesman values(5002,'Nail Knite','Paris',13), 
INTO salesman values(5003,'Pit Alex','London',11), 
INTO salesman values(5004,'McLyon','Paris',14), 
INTO salesman values(5005,'Lauson Hen','San Hose',12) 
select 1 from DUAL;

INSERT ALL  
INTO salesman values(5002,'Nail Knite','Paris',13) 
INTO salesman values(5003,'Pit Alex','London',11) 
INTO salesman values(5004,'McLyon','Paris',14) 
INTO salesman values(5005,'Lauson Hen','San Hose',12) 
select 1 from DUAL;

select * from salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission) values(5001,'JAMES HOOG','New york',15);

INSERT ALL  
INTO salesman values(5002,'Nail Knite','Paris',13) 
INTO salesman values(5003,'Pit Alex','London',11) 
INTO salesman values(5004,'McLyon','Paris',14) 
INTO salesman values(5005,'Lauson Hen','San Hose',12) 
select 1 from DUAL;

select * from salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission) values(5001,'JAMES HOOG','New york',15);

INSERT ALL  
INTO salesman values(5002,'Nail Knite','Paris',13) 
INTO salesman values(5003,'Pit Alex','London',11) 
INTO salesman values(5004,'McLyon','Paris',14) 
INTO salesman values(5005,'Lauson Hen','San Hose',12) 
select 1 from DUAL;

select * from salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

select * from salesman;

DROP TABLE salesman;

DROP TABLE salesman;

CREATE TABLE salesman(salesman_id int,salesman_name varchar2(20),salesman_city varchar2(20),commission int);

DESCRIBE salesman


INSERT INTO salesman(salesman_id,salesman_name,salesman_city,commission) values(5001,'JAMES HOOG','New york',15);

INSERT ALL  
INTO salesman values(5002,'Nail Knite','Paris',13) 
INTO salesman values(5003,'Pit Alex','London',11) 
INTO salesman values(5004,'McLyon','Paris',14) 
INTO salesman values(5005,'Paul Adam','Rome',13) 
INTO salesman values(5005,'Lauson Hen','San Hose',12) 
select 1 from DUAL;

select * from salesman;

select salesman_id,salesman_city from salesman;

select * from salesman where salesman_city='Paris';

select salesman_id,commission from salesman where salesman_name='Paul Adam';

ALTER TABLE salesman 
ADD(Grades int);

update salesman set grades=100;

select * from salesman;

update salesman set grades=200 where salesman_city='Rome';

update salesman set grades=300 where salesman_name='JAMES HOOG';

update salesman set salesman_name='Pierre' where salesman_name='McLyon';

select * from salesman;


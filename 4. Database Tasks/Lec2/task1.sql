
-- NOTE that im working with Postgres not Oracle.

create table Doctor(
	id serial primary key,
	name varchar(50),
	salary integer,
	address varchar(50)
);

insert into doctor (name, salary, address) 
values
	('Name1', 10000, 'Address1'),
	('Name2', 20000, 'Address2'),
	('Name3', 30000, 'Address3'),
	('Name4', 40000, 'Address4'),
	('Name5', 50000, 'Address5'),
	('Name6', 60000, 'Address6'),
	('Name7', 70000, 'Address7'),
	('Name8', 80000, 'Address8'),
	('Name9', 90000, 'Address9'),
	('Name10', 100000, 'Address10');

Update doctor set salary = 20000 where id = 3;

delete from doctor where id = 9;

select id , name || ' ' || salary, address from doctor;

select id, name, salary *2, address from doctor;

-- as i started with 10000 not 1000, anyway it doesn't matter.
select * from doctor where salary = 10000 or salary = 20000 or salary = 30000; 

Alter table doctor rename to PRD_DOCTOR;

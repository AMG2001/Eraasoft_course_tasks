
-- NOTE that im working with Postgres not Oracle.

create table employees(
	EmployeeId integer,
	FirstName VARCHAR(50),
	LastName VARCHAR(50),
	Department VARCHAR(50),
	Salary integer
);

INSERT INTO employees 
VALUES
	(101,'John1','Doe1','HR',20000),
	(102,'John2','Doe2','IT',50000),
	(103,'John3','Doe3','CS',40000),
	(104,'John4','Doe4','IT',10000),
	(105,'John5','Doe5','ZX',30000);

UPDATE employees SET salary = 60000 where EmployeeId = 101;


DELETE FROM Employees where Department = 'HR';

SELECT * from Employees WHERE Department = 'IT';

SELECT EmployeeId, FirstName || ' ' || LastName as FullName, Department, Salary
FROM Employees;


CREATE TABLE manager(
	id NUMBER NOT NULL,
	name varchar2(100),
	age NUMBER,
	birth_date DATE,
	address varchar2(100)
);

ALTER TABLE manager DROP COLUMN address;

ALTER TABLE manager ADD (city_address varchar2(100) , street varchar2(100));

ALTER TABLE manager RENAME COLUMN name TO full_name; 

ALTER TABLE manager READ ONLY;

CREATE TABLE owner AS 
	SELECT id,full_name,birth_date FROM manager;

ALTER TABLE manager  RENAME  TO master ;

DROP TABLE MASTER ;
DROP TABLE  OWNER ;

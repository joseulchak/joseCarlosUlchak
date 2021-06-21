--QUERY
select distinct name from dogs
union
select distinct name from cats


--CREATE TABLE DOGS
create TABLE dogs(
id INTEGER NOT NULL PRIMARY KEY,
name VARCHAR(50) NOT NULL
);

--CREATE TABLE CATS
create TABLE cats(
id INTEGER NOT NULL PRIMARY KEY,
name VARCHAR(50) NOT NULL
);

--INSERT DOGS
insert into dogs
values 
(1, 'toto'),
(2, 'thor'),
(3, 'apolo'),
(4, 'duque'),
(5, 'bolt'),
(6, 'toto');

--INSERT CATS
insert into cats
values
(1, 'mingau'),
(2, 'chico'),
(3, 'lilica'),
(4, 'snow'),
(5, 'bolt');
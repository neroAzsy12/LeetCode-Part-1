-- SQL Schema
CREATE TABLE Person (PersonId int, FirstName varchar(255), LastName varchar(255));
CREATE TABLE Address (AddressId int, PersonId int, City varchar(255), State varchar(255));
TRUNCATE TABLE Person;
INSERT INTO Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
TRUNCATE TABLE Address;
INSERT INTO Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');

-- Solution
SELECT FirstName, LastName, City, State
FROM Person
LEFT JOIN Address
ON Person.PersonId = Address.PersonId;
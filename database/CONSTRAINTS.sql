 DROP DATABASE testdb;
create database testdb;
use testdb;

CREATE TABLE STUDENT (  
S_ID VARCHAR(5) primary key,  
S_NAME VARCHAR (20) NOT NULL,  
AGE INT 
);  

CREATE TABLE course (  
C_ID INT primary key,  
C_NAME VARCHAR (20) NOT NULL,  
-- S_ID INT, datatype incompatible error
-- S_ID VARCHAR(3), data too long for column S_ID
S_ID VARCHAR(5),
FOREIGN KEY(S_ID) REFERENCES STUDENT(S_ID)
); 


insert into student values("10cs1","divya",21);
insert into course values("01","SQL","10cs1");
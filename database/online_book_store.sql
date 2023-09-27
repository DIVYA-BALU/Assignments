create database bookstore;
use bookstore;

create table author(
URL varchar(50) unique,
author_name varchar(20),
address varchar(50) 
);

alter table author add primary key(author_name,address);
create table publisher(
publisher_name varchar(20) primary key,
address varchar(50),
phone integer,
URL varchar(50)
);
create table book(
isbn varchar(10) primary key,
title varchar(20),
book_year int,
price float4,
author_name varchar(20),
address varchar(50) ,
publisher_name varchar(20),
foreign key(publisher_name) references publisher(publisher_name) ,
foreign key(author_name,address) references author(author_name,address) 
);



create table warehouse(
code varchar(10) primary key,
address varchar(50),
phone integer,
isbn varchar(10),
foreign key(isbn) references book(isbn)
);

create table customer(
email varchar(50) primary key,
name varchar(20),
address varchar(50),
phone integer
);

create table shopping_basket(
basket_id varchar(10) primary key,
email varchar(50),
isbn varchar(10),
foreign key(isbn) references book(isbn),
foreign key(email) references customer(email)
);
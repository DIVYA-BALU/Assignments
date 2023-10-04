create database onlinestore;
use onlinestore;

create table author(
author_id varchar(10) primary key,
author_name varchar(20),
address varchar(50) ,
URL varchar(50)
);

create table publisher(
publisher_name varchar(20) primary key,
address varchar(50),
phone varchar(50),
URL varchar(50)
);


create table product(
product_id varchar(10) primary key,
product_name varchar(20),
product_year int,
price float4,
product_type varchar(50),
author_id varchar(20),
publisher_name varchar(20),
foreign key(publisher_name) references publisher(publisher_name) ,
foreign key(author_id) references author(author_id)
);


create table warehouse(
w_code varchar(10) primary key,
address varchar(50),
phone varchar(50)
);

create table stocks(
product_count int,
w_code varchar(10),
product_id varchar(10),
foreign key(w_code) references warehouse(w_code),
foreign key(product_id) references product(product_id)
);


create table customer(
email varchar(50) primary key,
name varchar(20),
address varchar(50),
phone varchar(50)
);

create table cust_order(
order_id varchar(10) primary key,
p_id varchar(10),
basket_id varchar(10),
p_count int,
price float4,
w_code varchar(50),
foreign key(w_code) references stocks(w_code)
);

create table shopping_basket(
basket_id varchar(10) primary key,
total_price float4,
email varchar(50),
order_id varchar(10),
foreign key(email) references customer(email),
foreign key(order_id) references cust_order(order_id)
);


create database shop;
use shop;

create table user
(
    id       int unsigned auto_increment not null unique,
    username varchar(20),
    password varchar(30),
    role     int unsigned                not null
);
insert into user(username, password, role)
values ("long", "12345", 101);
select *
from user;

create table product
(
    id    int unsigned auto_increment not null unique,
    name  varchar(30),
    stock bigint unsigned             not null,
    price bigint unsigned             not null
);
insert into product(name, stock, price)
values ("Bàn", 44, 4000);
insert into product(name, stock, price)
values ("Ghế", 25, 2000);
select *
from product;
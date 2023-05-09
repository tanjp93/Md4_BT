create database demo;
use demo;
create table user(
id int(3) not null auto_increment,
name varchar(120) not null,
email varchar(220) not null,
country varchar(120),
primary key (id)
);
insert into user(name,email,country) values 
("Minh","Minh@rikkei.academy","Việt Nam"),
("Kante","kante@che.uk","Kenia");
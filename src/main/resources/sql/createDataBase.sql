drop database  if exists jsp_practice;
create database jsp_practice;
use jsp_practice;
drop table  if exists tb_brand;
create table  tb_brand(
      id int primary key auto_increment,
      brand_name varchar(20),
      company_name varchar(20),
      ordered int,
      description varchar(100),
      status int
);

insert into tb_brand(id,brand_name,company_name,ordered,description,status)
values (1,'Meta','MetaSoft',20,'So soft..',1),
       (2,'Doo','Doodle',2,'Just Doo it..',0),
       (3,'MaMa','AaLiMaMa',10,'Ur Best Choice..',1);

select * from tb_brand;
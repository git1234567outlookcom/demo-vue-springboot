-- auto-generated definition
create table users
(
  id       int auto_increment
    primary key,
  name     varchar(255) not null,
  age      int          null,
  password varchar(32)  null
);


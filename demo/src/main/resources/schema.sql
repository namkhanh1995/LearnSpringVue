create table users
(
    id integer not null AUTO_INCREMENT,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    emailId varchar(255) not null,
    primary key(id)
);
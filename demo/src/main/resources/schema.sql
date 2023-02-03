create table users
(
    id integer not null AUTO_INCREMENT,
    firstName varchar(255) not null,
    lastName varchar(255) not null,
    emailId varchar(255) not null,
    primary key(id)
);

create table schedules
(
    schedulesId integer not null AUTO_INCREMENT,
    id integer,
    eventName varchar(255),
    firstTimestamp float,
    secondTimestamp float,
    primary key(schedulesId, id)
)
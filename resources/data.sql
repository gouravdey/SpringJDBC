create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

insert into person (id, name, location, birth_date)
values(1, 'Gourav', 'Kolkata', sysdate());
insert into person (id, name, location, birth_date)
values(2, 'James', 'New York', sysdate());
insert into person (id, name, location, birth_date)
values(3, 'Peter', 'Amsterdam', sysdate());
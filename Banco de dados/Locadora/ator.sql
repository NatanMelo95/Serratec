create table public.ator
(
    id serial primary key not null,
    nome char(255)
);
alter table public.ator owner to postgres;

INSERT INTO ator (nome)
VALUES ('Lupita Nyong`o'),
	('Winston Duke'),
	('Mark Wahlberg'),
	('Saoirse Ronan'),
	('Tom Hanks'),
	('Tim Allen'),
	('Adam Sandler'),
	('Kevin James');
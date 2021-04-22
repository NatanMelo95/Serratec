create table public.cliente
(
    id serial primary key not null,
    nome char(150)
);
alter table public.cliente owner to postgres;

INSERT INTO cliente (nome)
VALUES ('Natan Melo'),
	('Gustavo'),
	('Marcelo Filgueira'),
	('Sthephanie Soares'),
	('Jean-Luc Ernest'),
	('Lorenna Caiaffa'),
	('Maria Vitória'),
	('Amanda Luísa');
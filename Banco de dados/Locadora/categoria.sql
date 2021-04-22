create table public.categoria
(
	id serial primary key not null,
	nome char (150)
);
alter table public.categoria owner to postgres;

INSERT INTO categoria (nome)
VALUES ('Comédia'),
	('Animação'),
	('Drama'),
	('Ação'),
	('Comédia dramática'),
	('Terror');
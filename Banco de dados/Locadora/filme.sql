create table public.filme
(
    id serial primary key not null,
	id_categoria int,
    nome char(255),
	constraint fk_id_categoria
    	foreign key (id_categoria)
    	references public.categoria (id)
);
alter table public.filme owner to postgres;

INSERT INTO filme (nome, id_categoria)
VALUES ('Us - Nós', 6),
	('Get out - Corra!', 6),
	('Black Panther - Pantera Negra', 4),
	('Spenser Confidential - Troco em Dobro', 4),
	('The Lovely Bones - Um olhar no paraíso', 3),
	('Lady Bird - Lady Bird: A Hora de Voar', 5),
	('Toy Story', 2),
	('Toy Story 2', 2),
	('Grown Ups - Gente Grande', 1),
	('Grown Ups 2 Gente Grande 2', 1);
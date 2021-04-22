create table public.filme_ator
(
    id_ator int,
    id_filme int,
    constraint fk_id_ator
    	foreign key (id_ator)
    	references public.ator (id),
    constraint fk_id_filme
    	foreign key (id_filme)
    	references public.filme (id)
);
alter table public.filme_ator owner to postgres;
	
INSERT INTO filme_ator (id_filme, id_ator)
VALUES (1, 1),
		(1, 2),
		(2, 1),
		(2, 2),
		(3, 1),
		(3, 2),
		(4, 2),
		(4, 3),
		(5, 3),
		(5, 4),
		(6, 4),
		(7, 5),
		(7, 6),
		(8, 5),
		(8, 6),
		(9, 7),
		(9, 8),
		(10, 7),
		(10, 8);

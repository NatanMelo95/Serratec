create table public.filme_cliente
(
    id_cliente int,
    id_filme int,
    constraint fk_id_cliente
    	foreign key (id_cliente)
    	references public.cliente (id),
    constraint fk_id_filme
    	foreign key (id_filme)
    	references public.filme (id)
);
alter table public.filme_cliente owner to postgres;

INSERT INTO filme_cliente (id_cliente, id_filme)
VALUES (1, 3),
		(2, 9),
		(3, 10),
		(4, 1),
		(4, 6),
		(5, 2),
		(5, 7),
		(6, 5),
		(7, 8),
		(8, 4);
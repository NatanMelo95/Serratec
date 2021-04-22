--Quais filmes cada cliente já alugou:

SELECT 
	filme.nome AS filme,
    cliente.nome AS cliente
FROM filme_cliente
JOIN filme ON filme_cliente.id_filme = filme.id
JOIN cliente ON filme_cliente.id_cliente = cliente.id
order by cliente

--Quais atores estão em um determinado filme:

SELECT 
	filme.nome AS filme,
	ator.nome AS ator
FROM filme_ator
JOIN filme ON filme_ator.id_filme = filme.id
JOIN ator ON filme_ator.id_ator = ator.id

WHERE filme.nome = 'Toy Story' order by filme

--Quais filmes cada ator já participou filmes cada ator já participou:

SELECT 
	filme.nome AS filme,
	ator.nome AS ator
FROM filme_ator
JOIN filme ON filme_ator.id_filme = filme.id
JOIN ator ON filme_ator.id_ator = ator.id

--Quais os filmes de uma determinada categoria:

SELECT 
	filme.nome AS filme,
	categoria.nome AS categoria
FROM filme
JOIN categoria ON filme.id_categoria = categoria.id

--Ou

SELECT 
	filme.nome AS filme,
	categoria.nome AS categoria
FROM filme
JOIN categoria ON filme.id_categoria = categoria.id
WHERE categoria.nome = 'Ação'
Criando coluna desconto
ALTER TABLE produto ADD COLUMN desconto double precision;

Criando coluna valor_desconto
ALTER TABLE produto ADD COLUMN valor_desconto double precision;

Criando coluna valor_com_desconto
ALTER TABLE produto ADD COLUMN valor_com_desconto double precision;

Atribuindo percentual do desconto a coluna desconto
update produto set desconto = 0.05 where categoria like '%Eletro%'
update produto set desconto = 0.15 where categoria like '%Entretenimento%'
update produto set desconto = 0.1 where categoria like '%Casa%'

Atribuindo valor do desconto a coluna valor_desconto
update produto set valor_com_desconto = valor * desconto

Atribuindo valor já descontado a coluna valor_com_desconto
update produto set valor_com_desconto = valor - valor_desconto

Verificando atribuições feitas
select*from produto
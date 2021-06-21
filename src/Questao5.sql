--REPORT
select 
	case 
		when Notas.nota <= 7 then null
		when Notas.nota >= 8 then Alunos.nome
	end,
	Notas.nota,
	Alunos.valor
from Alunos
inner join Notas on (Alunos.valor >= Notas.valor_min and Alunos.valor <= Notas.valor_max)
order by Notas.nota desc, Alunos.nome

--TABLE ALUNOS
create table Alunos (
	id int,
	nome varchar(20),
	valor int
);

--TABLE NOTAS
create table Notas (
	nota int,
	valor_min int,
	valor_max int
);

--INSERT ALUNOS
insert into Alunos
values 
(1, 'Julia', 81),
(2, 'Carol', 68),
(3, 'Maria', 99),
(4, 'Andreia', 78),
(5, 'Jaqueline', 63),
(6, 'Marcela', 88);

--INSERT NOTAS
insert into notas
values
(1,0,9),
(2,10,19),
(3,20,29),
(4,30,39),
(5,40,49),
(6,50,59),
(7,60,69),
(8,70,79),
(9,80,89),
(10,90,100);
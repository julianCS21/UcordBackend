------------------------------
---------POBLAR---------------
------------------------------

-- Decanatura

insert into decanatura (id_decanatura, nombre)
values (1, 'Departamento de matematicas');
insert into decanatura (id_decanatura, nombre)
values (2, 'Departamento de humanidades');
insert into decanatura (id_decanatura, nombre)
values (3, 'Departamento de ciencias');
insert into decanatura (id_decanatura, nombre)
values (4, 'Ingenieria de sistemas');
insert into decanatura (id_decanatura, nombre)
values (5, 'Ingenieria civil');
insert into decanatura (id_decanatura, nombre)
values (6, 'Ingenieria electrica');
insert into decanatura (id_decanatura, nombre)
values (7, 'Ingenieria industrial');
insert into decanatura (id_decanatura, nombre)
values (8, 'Ingenieria electronica');
insert into decanatura (id_decanatura, nombre)
values (9, 'Ingenieria biomedica');
insert into decanatura (id_decanatura, nombre)
values (10, 'Ingenieria ambiental');
insert into decanatura (id_decanatura, nombre)
values (11, 'Ingenieria estadistica');
insert into decanatura (id_decanatura, nombre)
values (12, 'Ingenieria de mecanica');
insert into decanatura (id_decanatura, nombre)
values (13, 'Matematicas');
insert into decanatura (id_decanatura, nombre)
values (14, 'Economia');
insert into decanatura (id_decanatura, nombre)
values (15, 'Administracion de empresas');
insert into decanatura (id_decanatura, nombre)
values (16, 'Otro');

-- Materias
-- Sistemas

-- Sistemas
insert into materia (sigla, nombre, creditos, id_decanatura)
values('INSI', 'Introduccion a la ingenieria de sistemas', 1, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('MMIN', 'Modelos matematicos para informatica', 3, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('AYPR', 'Algoritmos y programacion', 3, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('LCAT', 'Logica calculatoria', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('AYED', 'Algoritmos y estructuras de datos', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('MATD', 'Matematicas discretas', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('CNYT', 'Ciencias naturales y tecnologia', 3, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('MBDA', 'Modelos y bases de datos', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('TPRO', 'Teoria de la programacion', 3, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('POOB', 'Programacion orientada a objetos', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('ACSO', 'Arquitectura computacional', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('TSOR', 'Teoria de sistemas y organizaciones', 3, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('RECO', 'Redes de computadores', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('CVDS', 'Ciclos de vida de desarrollo de software', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('AUPN', 'Automatizacion de procesos de negocio', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('SPTI', 'Seguridad y privacidad de TI', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('ARSW', 'Arquitecturas de software', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('SIML', 'Seminario de insercion laboral', 1, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('IETI', 'Innovacion y emprendimiento', 4, 4);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('AREP', 'Arquitecturas empresariales', 4, 4);

-- Departamento de matematicas

insert into materia (sigla, nombre, creditos, id_decanatura)
values('PREM', 'Precalculo', 4, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('AGEO', 'Analisis geometrico', 4, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('CALD', 'Calculo diferencial', 4, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('ALLI', 'Algebra lineal', 3, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('CALI', 'Calculo integral', 4, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('CALV', 'Calculo vectorial', 4, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('ECDI', 'Ecuaciones diferenciales', 3, 1);

insert into materia (sigla, nombre, creditos, id_decanatura)
values('PRYE', 'Probabilidad y estadistica', 4, 1);
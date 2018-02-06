create database nutricion;
use nutricion;

create table plato (

	id int not null auto_increment,
	nombre varchar(100),
	descripcion varchar(300),
	autor varchar(15),
	primary key(id),
	foreign key (autor) references usuario(username)
);

create table usuario (

	username varchar(15),
	nombre_completo varchar(100),
	password varchas(15),
	primary key (username)
);

create table plato_componente(

	id_plato int,
	id_componente varchar(15),
	primary key (id_plato, usuario),
	foreign key (id_plato) references plato(id),
	foreign key (id_componente) references componente(id)
);
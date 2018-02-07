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

create table plato_ingrediente(

	id_plato int,
	id_ingrediente int,
	primary key (id_plato, id_ingrediente),
	foreign key (id_plato) references plato(id),
	foreign key (id_ingrediente) references ingredientes(id)
);
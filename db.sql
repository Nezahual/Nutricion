create database nutricion;
use nutricion;
create table usuario (

	username varchar(15),
	nombre_completo varchar(100),
	password varchar(15),
	primary key (username)
);

create table plato (

	id int not null auto_increment,
	nombre varchar(100),
	descripcion varchar(300),
	autor varchar(15),
	primary key(id),
	foreign key (autor) references usuario(username)
);


 CREATE TABLE `ingredientes` (
  id int not null auto_increment,
  `descripcion` VARCHAR(60), 
  `agua` DOUBLE NULL DEFAULT 0, 
  `energia` INTEGER DEFAULT 0, 
  `proteinas` DOUBLE NULL DEFAULT 0, 
  `grasas` DOUBLE NULL DEFAULT 0, 
  `carbohidratos` DOUBLE NULL DEFAULT 0, 
  `fibra` DOUBLE NULL DEFAULT 0,
  `azucar` DOUBLE NULL DEFAULT 0, 
  `calcio` INTEGER DEFAULT 0, 
  `hierro` DOUBLE NULL DEFAULT 0, 
  `magnesio` DOUBLE NULL DEFAULT 0, 
  `fosforo` INTEGER DEFAULT 0, 
  `potasio` INTEGER DEFAULT 0, 
  `sodio` INTEGER DEFAULT 0, 
  `vitamina_c` DOUBLE NULL DEFAULT 0, 
  `vitamina_b12` DOUBLE NULL DEFAULT 0, 
  `vitamina_a` INTEGER DEFAULT 0, 
  `vitamina_e` DOUBLE NULL DEFAULT 0, 
  `vitamina_d` DOUBLE NULL DEFAULT 0, 
  `grasas_saturadas` DOUBLE NULL DEFAULT 0, 
  `grasas_mono` DOUBLE NULL DEFAULT 0, 
  `grasas_poli` DOUBLE NULL DEFAULT 0, 
  `colesterol` INTEGER DEFAULT 0,
  primary key(id)
) ENGINE=innoDB DEFAULT CHARSET=utf8 collate utf8_spanish_ci;

create table plato_ingrediente(

	id_plato int,
	id_ingrediente int,
        cantidad int not null defauld 0,
	primary key (id_plato, id_ingrediente),
	foreign key (id_plato) references plato(id) on update cascade on delete cascade,
	foreign key (id_ingrediente) references ingredientes(id) on update cascade on delete no action
);
alter table plato_ingrediente add cantidad int not null after id_ingrediente;

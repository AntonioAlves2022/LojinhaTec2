CREATE TABLE IF NOT EXISTS usuarios(
    id int not null primary key auto_increment,
    nome varchar(50) not null,
    email varchar(255) not null unique,
    senha varchar(32) not null,
    endereco varchar(50) not null,
    cidade varchar(50) not null,
    estado varchar(2) not null
);

CREATE TABLE IF NOT EXISTS categorias(
     id int not null primary key auto_increment,
     nome varchar(100) not null unique
);

CREATE TABLE IF NOT EXISTS produtos(
     id int not null primary key auto_increment,
     nome varchar(100) not null,
     descricao varchar(200),
     preco decimal(10,2) not null,
     estoque decimal(10,2) not null,
     id_categoria int not null
     );


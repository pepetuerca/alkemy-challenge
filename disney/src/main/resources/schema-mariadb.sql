-- drop table if exists producto;
-- drop table if exists compra;
-- drop table if exists descripcion_compra;
-- drop table if exists distribuidor;
-- drop table if exists personaje_pelicula;
-- drop table if exists pelicula;
-- drop table if exists personaje;
-- 
-- 
-- create table personaje (
-- id int primary key auto_increment,
-- nombre varchar(200) not null,
-- historia varchar(3000),
-- imagen varchar (500)
-- );

-- CREATE TABLE `alkemy`.`personaje`( `id` INT NOT NULL AUTO_INCREMENT, `nombre` VARCHAR(200) NOT NULL, `historia` VARCHAR(3000), `imagen` VARCHAR(500), PRIMARY KEY (`id`) ); 

-- insert into personaje
-- (nombre,                   historia,                                      imagen) values
-- ('mickey','es un ratoncito muy divertido','https://purepng.com/public/uploads/large/purepng.com-mickey-mousemickey-mousemickeymouseanimal-cartooncharacterwalt-disneyub-iwerksstudioslarge-yellow-shoered-shortswhite-glovesnetflix-1701528649655lc2wl.png'),
-- ('donald','es un pato muy gruñon','https://purepng.com/public/uploads/medium/purepng.com-donald-duckdonald-duckdonaldduck1934walt-disney-1701528545190mxlm0.png'),
-- ('tio rico','es un pato muy rico','https://i.pinimg.com/originals/64/73/03/64730393d62c3701f9ac6d5ec7daa2fd.gif'),
-- ('goofy','es un perrito simpatico','https://img.discogs.com/gqsucS_M11iAgLgo245uwLxJk0Y=/600x600/smart/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/A-682682-1448943230-1302.jpeg.jpg');


insert into pelicula
(nombre,                   historia,                                      imagen) values
('mickey','es un ratoncito muy divertido','https://purepng.com/public/uploads/large/purepng.com-mickey-mousemickey-mousemickeymouseanimal-cartooncharacterwalt-disneyub-iwerksstudioslarge-yellow-shoered-shortswhite-glovesnetflix-1701528649655lc2wl.png'),
('donald','es un pato muy gruñon','https://purepng.com/public/uploads/medium/purepng.com-donald-duckdonald-duckdonaldduck1934walt-disney-1701528545190mxlm0.png'),
('tio rico','es un pato muy rico','https://i.pinimg.com/originals/64/73/03/64730393d62c3701f9ac6d5ec7daa2fd.gif'),
('goofy','es un perrito simpatico','https://img.discogs.com/gqsucS_M11iAgLgo245uwLxJk0Y=/600x600/smart/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/A-682682-1448943230-1302.jpeg.jpg');



-- create table compra (
-- id int primary key auto_increment,
-- fecha date not null
-- 
-- );

-- alter table producto
-- add column id_compra int,
-- add foreign key(id_compra) references compra(id);

-- create table descripcion_compra(
-- id_producto int(6) not null,
-- cantidad int(6) default null,
-- id_compra int(6) not null,
-- primary key(id_producto,id_compra)
-- );

-- 
-- create table distribuidor (
-- -- id_distribuidor int primary key auto_increment,
-- id int primary key auto_increment,
-- nombre varchar(200) not null,
-- imagen_url varchar (500)
-- );

-- insert into distribuidor
-- (nombre,         imagen_url) values
-- ('berriland','https://lasberries.files.wordpress.com/2019/01/img_20190117_141959.jpg'),
-- ('frutiworld','https://lasberries.files.wordpress.com/2019/01/img_20181123_122729.jpg'),
-- ('lala','https://lasberries.files.wordpress.com/2019/01/img_20190117_141959.jpg');

-- alter table producto
-- add column id_distribuidor int,
-- add foreign key(id_distribuidor) references distribuidor(id_distribuidor);
-- alter table producto
-- add column distribuidor_id int,
-- add foreign key(distribuidor_id) references distribuidor(id);

-- update producto set id_distribuidor = 1 where id_producto in (1,3,5);
-- update producto set id_distribuidor = 2 where id_producto in (2,4);
-- update producto set id_distribuidor = 3 where id_producto in (6);


-- alter table producto 
-- modify id_distribuidor int not null;

-- update producto set distribuidor_id = 1 where id in (1,3,5);
-- update producto set distribuidor_id = 2 where id in (2,4);
-- update producto set distribuidor_id = 3 where id in (6);

-- create table pelicula (
-- id int primary key auto_increment,
-- nombre varchar(200) not null
-- 
-- );
-- 
-- insert into pelicula
-- (nombre) values
-- ('Alicia en el pais de las maravillas'),
-- ('el Tio Rico'),
-- ('Mikey en Florida');
-- 
-- alter table producto
-- add column pelicula_id int,
-- add foreign key(pelicula_id) references pelicula(id);
-- 
-- update producto set pelicula_id = 1 where id in (1,3,5);
-- update producto set pelicula_id = 2 where id in (2,4);
-- update producto set pelicula_id = 3 where id in (6);


  

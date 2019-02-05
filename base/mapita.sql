CREATE TABLE usuario(
idusuario serial NOT NULL,
nombre text NOT NULL,
correo text NOT NULL,
contrasenia text NOT NULL,
fecha_nacimiento date,
CONSTRAINT "PK" PRIMARY KEY (idusuario));

CREATE TABLE marcador(
idmarcador serial NOT NULL,
descripcion text,
longitud double precision,
latitud double precision,
idusuario serial NOT NULL,
CONSTRAINT "PKM" PRIMARY KEY (idmarcador));

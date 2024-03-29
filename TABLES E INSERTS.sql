DROP DATABASE dataluta_db;
CREATE DATABASE dataluta_db;
use dataluta_db;

CREATE TABLE LOCALIDADE(
	CODLOCAL INT NOT NULL,
    NOMEASSENTAMENTO VARCHAR(50) NOT NULL,
    ENDERECO VARCHAR(50) NOT NULL,
    PRIMARY KEY (CODLOCAL)
);
CREATE TABLE USUARIO(
	CODUSUARIO INT AUTO_INCREMENT,
	NOME VARCHAR(100) NOT NULL,
	MUNICIPIO VARCHAR(50) NOT NULL,
	UF VARCHAR(20) NOT NULL,
	NOMEASSENTAMENTO VARCHAR(50),
	CODLOCAL INT NOT NULL,
	EMAIL VARCHAR(50) NOT NULL,
	SENHA VARCHAR(50) NOT NULL,
	PRIMARY KEY(CODUSUARIO),
    CONSTRAINT LOCAL_USUARIO FOREIGN KEY (CODLOCAL)
    REFERENCES LOCALIDADE(CODLOCAL) MATCH FULL ON UPDATE SET NULL ON DELETE SET NULL
);

CREATE TABLE PRODUTO(
	CODPRODUTO INT NOT NULL,
    CATEGORIA VARCHAR(50) NOT NULL,
	TIPOPRODUTO VARCHAR(50) NOT NULL,
	PRIMARY KEY(CODPRODUTO)
);
CREATE TABLE PRODUCAO(
	CODPRODUCAO INT NOT NULL AUTO_INCREMENT,
	DATAINI DATE,
    DATAFIN DATE,
	QUALIDADE VARCHAR(50) NOT NULL,
	QUANTIDADE INT NOT NULL,
	CODPRODUTO_PRODUCAO INT,
	PRIMARY KEY (CODPRODUCAO),
	CONSTRAINT PRODUCAO_PRODUTO FOREIGN KEY (CODPRODUTO_PRODUCAO)
	REFERENCES PRODUTO(CODPRODUTO) MATCH FULL ON UPDATE SET NULL ON DELETE SET NULL 
);

INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(1, "Legume", "Tomate");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(2, "Legume", "Batata");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(3, "Legume", "Cenoura");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(4, "Fruta", "Laranja");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(5, "Fruta", "Maçã");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(6, "Fruta", "Banana");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(7, "Folhagem", "Alface");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(8, "Folhagem", "Rúcula");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(9, "Folhagem", "Couve");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(10, "Carne", "Bovina");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(11, "Carne", "Suína");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(12, "Carne", "Aves");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(13, "Ovo", "Galinha");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(14, "Ovo", "Pato");
INSERT INTO PRODUTO(CODPRODUTO, CATEGORIA, TIPOPRODUTO)
VALUES(15, "Ovo", "Codorna");
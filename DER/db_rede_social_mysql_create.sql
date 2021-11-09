CREATE TABLE `tb_usuario` (
	`id_usuario` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(80) NOT NULL,
	`email` varchar(80) NOT NULL UNIQUE,
	`senha` varchar(80) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

CREATE TABLE `tb_tema` (
	`id_tema` bigint NOT NULL AUTO_INCREMENT,
	`tipo` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`segmento` varchar(255) NOT NULL,
	PRIMARY KEY (`id_tema`)
);

CREATE TABLE `tb_postagem` (
	`id_postagem` bigint NOT NULL AUTO_INCREMENT,
	`titulo` varchar(255) NOT NULL,
	`texto` varchar(255) NOT NULL,
	`imagem` varchar(255),
	`data` TIMESTAMP(255) NOT NULL,
	`fk_usuario` bigint(255) NOT NULL,
	`fk_tema` bigint(255) NOT NULL,
	PRIMARY KEY (`id_postagem`)
);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk0` FOREIGN KEY (`fk_usuario`) REFERENCES `tb_usuario`(`id_usuario`);

ALTER TABLE `tb_postagem` ADD CONSTRAINT `tb_postagem_fk1` FOREIGN KEY (`fk_tema`) REFERENCES `tb_tema`(`id_tema`);





SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema livraria_livrados
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `livraria_livrados` DEFAULT CHARACTER SET utf8mb3;
USE `livraria_livrados`;

-- -----------------------------------------------------
-- Table `livraria_livrados`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `livraria_livrados`.`produto` (
  `id` INT NOT NULL,
  `preco` DECIMAL(6,2) NULL DEFAULT NULL,
  `nome` VARCHAR(90) NULL DEFAULT NULL,
  `descricao` VARCHAR(350) NULL DEFAULT NULL,
  `dataRegistro` DATE NULL DEFAULT NULL,
  `dataLancamento` DATE NULL DEFAULT NULL,
  `genero` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

-- -----------------------------------------------------
-- Table `livraria_livrados`.`livro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `livraria_livrados`.`livro` (
  `Produto_id` INT NOT NULL,
  `isbn13` CHAR(13) NOT NULL,
  `autor` VARCHAR(90) NULL DEFAULT NULL,
  `editora` VARCHAR(90) NULL DEFAULT NULL,
  `sinopse` VARCHAR(350) NULL DEFAULT NULL,
  PRIMARY KEY (`Produto_id`),
  INDEX `fk_Livro_Produto1_idx` (`Produto_id` ASC) VISIBLE,
  CONSTRAINT `fk_Livro_Produto1`
    FOREIGN KEY (`Produto_id`)
    REFERENCES `livraria_livrados`.`produto` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Alterações na tabela de produto
-- -----------------------------------------------------

ALTER TABLE `livraria_livrados`.`produto` 
CHANGE COLUMN `dataRegistro` `dataRegistro` VARCHAR(40) NULL DEFAULT NULL ,
CHANGE COLUMN `dataLancamento` `dataLancamento` VARCHAR(40) NULL DEFAULT NULL ;

-- -----------------------------------------------------
-- Inserções na tabela `livraria_livrados`.`produto`
-- -----------------------------------------------------

INSERT INTO `livraria_livrados`.`produto` (`id`,`preco`,`nome`,`descricao`,`dataRegistro`,`dataLancamento`,`genero`) VALUES (1,20.00,'A Hora da Estrela','Caos, pânico e destruição','2023-03-26','1995-03-30','Romance');
INSERT INTO `livraria_livrados`.`produto` (`id`,`preco`,`nome`,`descricao`,`dataRegistro`,`dataLancamento`,`genero`) VALUES (2,35.40,'Sidarta','Careca budista','2023-03-17','1803-04-02','Religioso');
INSERT INTO `livraria_livrados`.`produto` (`id`,`preco`,`nome`,`descricao`,`dataRegistro`,`dataLancamento`,`genero`) VALUES (3,37.30,'Mão de Jedi','Perdeu tudo!!!!','2023-03-28','1980-05-03','Geek');
INSERT INTO `livraria_livrados`.`produto` (`id`,`preco`,`nome`,`descricao`,`dataRegistro`,`dataLancamento`,`genero`) VALUES (4,48.00,'Dom Casmurro','Capitu não traiu!!!!!!','2023-03-27','1898-11-09','Romance');
INSERT INTO `livraria_livrados`.`produto` (`id`, `preco`, `nome`, `descricao`, `dataRegistro`, `dataLancamento`, `genero`) VALUES ('77', '77', 'Rafael Moreira Mano', 'RAFA777', '2023-03-29', '2023-01-20', 'RAFF');

-- -----------------------------------------------------
-- Inserções na tabela `livraria_livrados`.`livro`
-- -----------------------------------------------------

INSERT INTO `livraria_livrados`.`livro` (`Produto_id`,`isbn13`,`autor`,`editora`,`sinopse`) VALUES (1,'1234567891234','Clarice Lispector','Cerpe','Brasília amarela');
INSERT INTO `livraria_livrados`.`livro` (`Produto_id`,`isbn13`,`autor`,`editora`,`sinopse`) VALUES (2,'9897132981739','Bodidharma','Buddah','Carecas da paz');
INSERT INTO `livraria_livrados`.`livro` (`Produto_id`,`isbn13`,`autor`,`editora`,`sinopse`) VALUES (3,'9874631234132','Yoda Tano','Jorge Luscas','Velozes e furiosos no espaço');
INSERT INTO `livraria_livrados`.`livro` (`Produto_id`,`isbn13`,`autor`,`editora`,`sinopse`) VALUES (4,'3213123211231','Machado de Assis','Quincas Borba','Caba chato, merecia levar gaia');
INSERT INTO `livraria_livrados`.`livro` (`Produto_id`, `isbn13`, `autor`, `editora`, `sinopse`) VALUES ('77', '7777777777777', 'Rafael Moreira dos Anjos', 'Abacaxi', 'Paga o que você me deve');

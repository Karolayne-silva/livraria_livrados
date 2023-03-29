-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema livraria_livrados
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema livraria_livrados
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `livraria_livrados` DEFAULT CHARACTER SET utf8mb3 ;
USE `livraria_livrados` ;

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
-- Table `livraria_livrados`.`cd`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `livraria_livrados`.`cd` (
  `Produto_id` INT NOT NULL,
  `cantor` VARCHAR(90) NULL DEFAULT NULL,
  `produtor` VARCHAR(90) NULL DEFAULT NULL,
  PRIMARY KEY (`Produto_id`),
  CONSTRAINT `fk_CD_Produto1`
    FOREIGN KEY (`Produto_id`)
    REFERENCES `livraria_livrados`.`produto` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `livraria_livrados`.`dvd`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `livraria_livrados`.`dvd` (
  `Produto_id` INT NOT NULL,
  `diretor` VARCHAR(90) NULL DEFAULT NULL,
  PRIMARY KEY (`Produto_id`),
  CONSTRAINT `fk_DVD_Produto1`
    FOREIGN KEY (`Produto_id`)
    REFERENCES `livraria_livrados`.`produto` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `livraria_livrados`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `livraria_livrados`.`venda` (
  `id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `livraria_livrados`.`itemvenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `livraria_livrados`.`itemvenda` (
  `Venda_id` INT NOT NULL,
  `Produto_id` INT NOT NULL,
  `quantidade` INT NOT NULL,
  `dataVenda` DATE NOT NULL,
  `desconto` DECIMAL(4,2) NULL DEFAULT NULL,
  PRIMARY KEY (`Venda_id`, `Produto_id`),
  INDEX `fk_ItemVenda1_idx` (`Produto_id` ASC) INVISIBLE,
  INDEX `fk_ItemVenda_idx` (`Venda_id` ASC) INVISIBLE,
  CONSTRAINT `fk_ItemVenda1`
    FOREIGN KEY (`Produto_id`)
    REFERENCES `livraria_livrados`.`produto` (`id`),
  CONSTRAINT `fk_ItemVenda_Venda`
    FOREIGN KEY (`Venda_id`)
    REFERENCES `livraria_livrados`.`venda` (`id`))
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

ALTER TABLE `livraria_livrados`.`produto` 
CHANGE COLUMN `dataRegistro` `dataRegistro` VARCHAR(40) NULL DEFAULT NULL ,
CHANGE COLUMN `dataLancamento` `dataLancamento` VARCHAR(40) NULL DEFAULT NULL ;

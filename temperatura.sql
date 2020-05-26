DROP TABLE `clima`;
CREATE DATABASE IF NOT EXISTS `clima`;
USE `clima` ;

CREATE TABLE IF NOT EXISTS `clima`.`TEMPERATURA` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `valor` DECIMAL(4,2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SELECT * FROM information_schema.PROCESSLIST;

SELECT * FROM `clima`.`TEMPERATURA`;
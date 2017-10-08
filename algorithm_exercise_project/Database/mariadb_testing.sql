create database mariadb_testing;

use mariadb_testing;

CREATE TABLE `a` (
	`id` INT(11) NOT NULL,
	`value` VARCHAR(20) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;
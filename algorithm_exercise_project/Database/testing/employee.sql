use organization;

drop table employee;

CREATE TABLE `employee` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`last_name` VARCHAR(50) NOT NULL,
	`first_name` VARCHAR(50) NOT NULL,
	`company` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`ID`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
AUTO_INCREMENT=4
;

select * from employee;
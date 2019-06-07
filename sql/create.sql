CREATE DATABASE `mojabaza` /*!40100 DEFAULT CHARACTER SET utf8 */;

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
`role_id` int(11) NOT NULL AUTO_INCREMENT,
`role` varchar(255) DEFAULT NULL,
PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
`user_id` int(11) NOT NULL AUTO_INCREMENT,
`active` int(11) DEFAULT NULL,
`email` varchar(255) NOT NULL,
`last_name` varchar(255) NOT NULL,
`name` varchar(255) NOT NULL,
`password` varchar(255) NOT NULL,
PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
`user_id` int(11) NOT NULL,
`role_id` int(11) NOT NULL,
PRIMARY KEY (`user_id`,`role_id`),
KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
`car_id` int(11) NOT NULL AUTO_INCREMENT,
`make` varchar(40) NOT NULL,
`model` varchar(40) NOT NULL,
`number_plate` varchar(10) NOT NULL,
`current_mileage` int(7) default 0 NOT NULL,
`attentions` varchar(200) default NULL,
PRIMARY KEY (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `mileage`;
CREATE TABLE `mileage` (
`mileage_id` int(11) NOT NULL AUTO_INCREMENT,
`start_place` varchar(40) NOT NULL,
`end_place` varchar(40) NOT NULL,
`start_mileage` int(7) NOT NULL,
`end_mileage` int(7) NOT NULL,
`attentions` varchar(200) default NULL,
`user_id` int(11) NOT NULL,
`car_id` int(11) NOT NULL,
PRIMARY KEY (`mileage_id`),
CONSTRAINT `FK_USER` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
CONSTRAINT `FK_CAR` FOREIGN KEY (`car_id`) REFERENCES `car` (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
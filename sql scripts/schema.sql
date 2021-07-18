DROP SCHEMA IF EXISTS `cruddemo`;
CREATE SCHEMA `cruddemo`;
use `cruddemo`;
DROP TABLE IF EXISTS `user`;
CREATE TABLE  `user` (
   `user_id` varchar(30) NOT NULL,
   `address` varchar(255) NOT NULL,
   `city` varchar(30) NOT NULL,
   `country` varchar(150) NOT NULL,
   `dob` varchar(12) NOT NULL,
   `email` varchar(64) NOT NULL,
   `first_name` varchar(50) NOT NULL,
   `last_name` varchar(50) NOT NULL,
   `password` varchar(15) NOT NULL,
   `phone_number` varchar(30) NOT NULL,
   `state` varchar(30) NOT NULL,
   `zip_code` varchar(50) NOT NULL,
   PRIMARY KEY (`user_id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 DROP TABLE IF EXISTS `country`;
 CREATE TABLE  `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8  ;

 DROP TABLE IF EXISTS `state`;
 
 CREATE TABLE  `state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `country_id` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1  ;

 DROP TABLE IF EXISTS `city`;
CREATE TABLE IF NOT EXISTS `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `state_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1  ;



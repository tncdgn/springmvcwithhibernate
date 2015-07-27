Description:
This sample  project makes insert,update and delete by using spring mvc,hibernate and mysql database.

Heroku link will be added soon.
Technologies used:

Backend:Spring 4.1.1,JDK 1.7,Maven 4.0.0,Hibernate 4.3.5;

Frontend:JQuery;

IDE:Intellij IDEA 14.0.3;

DATABASE:MYSQL;

Function List:

1.Insert Person
2.Update Person
3.Delete Person
To use this application ,create db and table column by using this query

CREATE DATABASE `userdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE `usertable` (
  `contact_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `telephone` varchar(45) NOT NULL,
  PRIMARY KEY (`contact_id`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

Application can be used by entering "http://localhost:8080/user" to your web browser.

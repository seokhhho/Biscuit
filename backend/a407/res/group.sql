CREATE TABLE `group` (
  `gId` int NOT NULL AUTO_INCREMENT,
  `email` varchar(30) NOT NULL,
  `max` int NOT NULL,
  `sdate` datetime NOT NULL,
  `edate` datetime NOT NULL,
  `groupName` varchar(20) NOT NULL,
  `groupDesc` varchar(300) DEFAULT NULL,
  `category` varchar(10) NOT NULL,
  `onoff` int NOT NULL,
  `region` varchar(10) DEFAULT NULL,
  `img` varchar(100) DEFAULT NULL,
  `groupFlag` int NOT NULL DEFAULT '0',
  `cycle` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`gId`),
  UNIQUE KEY `gId_UNIQUE` (`gId`),
  KEY `fk_group_email_idx` (`email`),
  CONSTRAINT `fk_group_email` FOREIGN KEY (`email`) REFERENCES `user` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
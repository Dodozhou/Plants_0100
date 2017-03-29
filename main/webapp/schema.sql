-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: rich_plants
-- ------------------------------------------------------
-- Server version	5.7.13-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baike`
--

DROP TABLE IF EXISTS `baike`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `content` longtext NOT NULL,
  `date` varchar(45) NOT NULL,
  `saw` int(10) NOT NULL DEFAULT '0',
  `zan` int(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baike`
--

LOCK TABLES `baike` WRITE;
/*!40000 ALTER TABLE `baike` DISABLE KEYS */;
/*!40000 ALTER TABLE `baike` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (10);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `material`
--

DROP TABLE IF EXISTS `material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `material` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `category` varchar(45) NOT NULL,
  `description` varchar(300) NOT NULL,
  `imgs` varchar(300) NOT NULL,
  `price` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `material`
--

LOCK TABLES `material` WRITE;
/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` VALUES (1,'白瓷盆','盆器','多形状白瓷盆','/uploads/2017/03/28/20/5c8f6539-be20-4c06-91b1-54a59cc7e372.jpg',50),(2,'白瓷盆','盆器','精致白瓷盆','/uploads/2017/03/28/20/16cb9ae4-f941-4dbf-891e-c9ee1e20867f.jpg',55),(3,'白瓷盆','盆器','精致白瓷盆','/uploads/2017/03/28/20/04e4bc6a-ddfb-4075-9a96-b80e0d2f805b.jpg',45),(4,'白瓷盆','盆器','精致白瓷盆','/uploads/2017/03/28/20/ebb4f89a-8795-40c2-ae0a-ad5339a5ea19.jpg',55),(5,'装饰1','装饰','精品装饰1','/uploads/2017/03/28/20/1b6392a8-a03e-4e46-938a-4d48debb81bd.jpg',40),(6,'装饰2','装饰','精品装饰2','/uploads/2017/03/28/21/812a5cc0-2942-4a6c-99e6-2ac21cf02c02.jpg',26),(7,'装饰1','装饰','精品装饰1','/uploads/2017/03/28/21/09475234-c0d2-48c9-8d82-2287bd71baa1.jpg',56),(8,'装饰2','装饰','精品装饰2','/uploads/2017/03/28/21/88f61ae2-b933-4cdf-b836-1ab1c82cc9eb.jpg',26),(9,'神奇种子','种子','精致的神奇种子','/uploads/2017/03/28/21/6add6ecd-465c-4786-a586-78b8eb4076b6.jpg',16),(10,'神奇种子','种子','精致的神奇种子','/uploads/2017/03/28/21/fc4e3b94-ee19-4bc0-a72e-80631afb0e78.jpg',16),(11,'神奇种子','种子','精致的神奇种子','/uploads/2017/03/28/21/7524f163-48d6-4c9c-8905-0249f29a2253.jpg',16),(12,'神奇种子','种子','精致的神奇种子','/uploads/2017/03/28/21/24dea6df-b9b6-451e-83da-8b6a99c694dd.jpg',16),(13,'虹彩石','土壤','精致的虹彩石','/uploads/2017/03/28/21/6e21dd49-52a8-44a9-9d16-2e73f12a2ce9.jpg',12),(14,'九合一颗粒土','土壤','精致的九合一颗粒土','/uploads/2017/03/28/21/a7004a11-5903-495a-9cde-5ee63ab6d6ba.jpg',13),(15,'陶粒','土壤','精致的陶粒','/uploads/2017/03/28/21/b06a2414-9541-4487-b87b-d5cf02cb1767.jpg',13),(16,'五合一营养土','土壤','精致的五合一营养土','/uploads/2017/03/28/21/81fdc1a2-536a-4b5a-9326-ea316529c4be.jpg',13),(17,'多菌灵','化肥','强效多菌灵','/uploads/2017/03/28/21/1f4b505a-4b45-4899-894c-234f011e8b60.jpg',25),(18,'生根剂','化肥','强效生根剂','/uploads/2017/03/28/21/b7ba06cd-b5ac-4afe-a402-190cb769930f.jpg',25),(19,'灭虫剂','化肥','强效灭虫剂','/uploads/2017/03/28/21/8399d090-16ac-4bac-829d-a460052e6773.jpg',25),(20,'缓释剂','化肥','强效缓释剂','/uploads/2017/03/28/21/be7c210f-0d3a-4364-be64-c3f8487250e0.jpg',25),(21,'园艺工具','工具','精致的园艺工具','/uploads/2017/03/28/22/4d6c1c6f-953e-4d91-ba7b-2400b8218168.jpg',16),(22,'园艺工具','工具','精致的园艺工具','/uploads/2017/03/28/22/88bdcb17-87e5-460e-b3be-a463c6f7fe07.jpg',16),(23,'园艺工具','工具','精致的园艺工具','/uploads/2017/03/28/22/d0148e46-47eb-4de5-84ea-f79f2953b0db.jpg',16),(24,'园艺工具','工具','精致的园艺工具','/uploads/2017/03/28/22/182babdb-59d2-4e69-9b37-569b3c1a4762.jpg',16);
/*!40000 ALTER TABLE `material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `my_plants`
--

DROP TABLE IF EXISTS `my_plants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `my_plants` (
  `date` date NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `owner` int(11) NOT NULL,
  `plant` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `my_users_idx` (`owner`),
  KEY `my_plant_idx` (`plant`),
  CONSTRAINT `my_plant` FOREIGN KEY (`plant`) REFERENCES `plants` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `my_users` FOREIGN KEY (`owner`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `my_plants`
--

LOCK TABLES `my_plants` WRITE;
/*!40000 ALTER TABLE `my_plants` DISABLE KEYS */;
/*!40000 ALTER TABLE `my_plants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `myplants`
--

DROP TABLE IF EXISTS `myplants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `myplants` (
  `id` int(11) NOT NULL,
  `date` date NOT NULL,
  `plant` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKer759he62ff0koaxjqlwg6epi` (`plant`),
  CONSTRAINT `FKer759he62ff0koaxjqlwg6epi` FOREIGN KEY (`plant`) REFERENCES `plants` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `myplants`
--

LOCK TABLES `myplants` WRITE;
/*!40000 ALTER TABLE `myplants` DISABLE KEYS */;
/*!40000 ALTER TABLE `myplants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plants`
--

DROP TABLE IF EXISTS `plants`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plants` (
  `category` varchar(45) NOT NULL,
  `description` varchar(500) NOT NULL,
  `imgs` varchar(300) DEFAULT NULL,
  `plantname` varchar(45) DEFAULT NULL,
  `price` int(5) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plants`
--

LOCK TABLES `plants` WRITE;
/*!40000 ALTER TABLE `plants` DISABLE KEYS */;
INSERT INTO `plants` VALUES ('景天科','风车草属桃之卵','/uploads/2017/03/25/18/7f5465ce-429d-4533-b1b5-fcd546dc7def.jpg','桃之卵',136,20),('景天科','西陌莎，仙女杯属，中文名字由拉丁学名直译而来。小型仙女杯品种，叶片梭型，植株中心生长点呈黄绿色，喜半阴。光照充足的环境下，老叶逐渐显红色，且叶子越老，红色越深。','/uploads/2017/03/25/19/185e8298-a9e1-4f34-a087-da6629b096e5.jpg','西陌莎',150,21),('景天科','拟石莲花属姬葡萄','/uploads/2017/03/25/19/c8261b8f-e693-4f3f-af49-d16c1b643796.jpg','姬葡萄',125,22),('景天科','景天属克雷吉','/uploads/2017/03/25/19/1ebf4779-347a-4ad0-97b5-1c5b24509988.jpg','克雷吉',135,23);
/*!40000 ALTER TABLE `plants` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT 'plants',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'zhouzhou','123','zhouzhou@163.com'),(2,'ææ','1234567','cheng@163.com'),(3,'成成','1234567','chengcheng@163.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-29 14:01:50

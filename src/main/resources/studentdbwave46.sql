-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: studentdbwave46
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `rollno` int DEFAULT NULL,
  `sname` varchar(150) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `marks` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (2,'Ramesh',39,'Bhopal',500),(NULL,'Suresh',39,'Bhopal',500),(5,'Aswin',23,'Kerala',99),(7,'Harsh',21,'UP',43),(11,'Dinesh',99,'karnal',500),(1007,'Ezhilarasan',24,'Dharmapuri',477),(6,'Mahek',21,'Maharashtra',97),(26,'Shivam',21,'lucknow',350),(1,'John',18,'Tuty',80),(8,'Harika',22,'Chennai',100),(3,'Aman',23,'Delhi',90),(7,'Mani',22,'Chennai',464),(10,'Anitha',19,'Bangalore',90),(17,'Ashutosh',100,'Bangalore',444),(22,'Avinash',22,'Chennai',440),(101,'hemangi',25,'nagpur',676),(16,'LOKESH',22,'Chennai',35),(11,'kotresh',25,'bengalur',400),(26,'Sanket',24,'Maharashtra',75),(25,'Hina',24,'Maharashtra',92),(12,'vinay',22,'madhyapradesh',440),(27,'Rishi',21,'chennai',475),(10,'kathir',23,'Theni',80),(30,'kavya',25,'Bhadrachalam',90),(11,'krishna',25,'akluj',70),(1,'Jesu',23,'Thoothukudi',80),(20,'ghanshyam',20,'bihar',80),(NULL,'ghanshyam',20,'bihar',80),(899,'Ravi Kumar',15,'Indore',545),(454,'Aryan Sharma',12,'BHopal',500),(12,'tttt',55,'tttt',450);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
  `id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-31 17:34:24

-- MySQL dump 10.13  Distrib 8.0.19, for macos10.15 (x86_64)
--
-- Host: localhost    Database: DZ3
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `Academy`
--

DROP TABLE IF EXISTS `Academy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Academy` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idTeachers` int NOT NULL,
  `idGroups` int NOT NULL,
  `idFaculties` int NOT NULL,
  `idDepartments` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `Teachers_idx` (`idTeachers`),
  KEY `Groups_idx` (`idGroups`),
  KEY `Faculties_idx` (`idFaculties`),
  KEY `Departments_idx` (`idDepartments`),
  CONSTRAINT `Departments` FOREIGN KEY (`idDepartments`) REFERENCES `Departments` (`id`),
  CONSTRAINT `Faculties` FOREIGN KEY (`idFaculties`) REFERENCES `Faculties` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Groups` FOREIGN KEY (`idGroups`) REFERENCES `Groups` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Teachers` FOREIGN KEY (`idTeachers`) REFERENCES `Teachers` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Academy`
--

LOCK TABLES `Academy` WRITE;
/*!40000 ALTER TABLE `Academy` DISABLE KEYS */;
/*!40000 ALTER TABLE `Academy` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-28 16:08:34

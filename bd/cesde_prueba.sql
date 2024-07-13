/*
SQLyog Community v13.2.1 (64 bit)
MySQL - 10.4.28-MariaDB : Database - cesde_prueba
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cesde_prueba` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `cesde_prueba`;

/*Table structure for table `cesde_cursos` */

DROP TABLE IF EXISTS `cesde_cursos`;

CREATE TABLE `cesde_cursos` (
  `Nom_Curso` varchar(255) NOT NULL,
  `Des_Curso` varchar(255) NOT NULL,
  `Dur_Curso` int(4) NOT NULL,
  `Precio_Curso` decimal(10,0) NOT NULL,
  `Fecha_Ini_Curso` date NOT NULL,
  `Docente_Curso` int(20) NOT NULL,
  KEY `Docente_Curso` (`Docente_Curso`),
  CONSTRAINT `cesde_cursos_ibfk_1` FOREIGN KEY (`Docente_Curso`) REFERENCES `cesde_docentes` (`Nro_Doc_Docente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `cesde_cursos` */

/*Table structure for table `cesde_docentes` */

DROP TABLE IF EXISTS `cesde_docentes`;

CREATE TABLE `cesde_docentes` (
  `Nro_Doc_Docente` int(20) NOT NULL,
  `Nom_Docente` varchar(255) DEFAULT NULL,
  `Email_Docente` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Nro_Doc_Docente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `cesde_docentes` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

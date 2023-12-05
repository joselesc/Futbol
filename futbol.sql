-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-12-2023 a las 03:45:04
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `futbol`
--
CREATE DATABASE IF NOT EXISTS `futbol` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `futbol`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `nombre` varchar(30) NOT NULL,
  `titulares` int(3) NOT NULL,
  `suplentes` int(3) NOT NULL,
  `dt` varchar(50) NOT NULL,
  `puntos` int(3) DEFAULT NULL,
  `partidosJugados` int(3) DEFAULT NULL,
  `ganados` int(3) DEFAULT NULL,
  `empatados` int(3) DEFAULT NULL,
  `perdidos` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`nombre`, `titulares`, `suplentes`, `dt`, `puntos`, `partidosJugados`, `ganados`, `empatados`, `perdidos`) VALUES
('Boca', 11, 10, 'Jorge Almiron', 0, 0, 0, 0, 0),
('Lanus', 11, 8, 'Ricardo Zielinski', 0, 0, 0, 0, 0),
('River', 11, 11, 'Martin Demichelis', 3, 1, 1, 0, 0),
('San Lorenzo', 11, 8, 'Rubén  Insua', 0, 1, 0, 0, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

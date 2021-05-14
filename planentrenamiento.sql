-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2021 a las 15:30:07
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `planentrenamiento`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `id_equipo` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `descripcion` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipoplan`
--

CREATE TABLE `equipoplan` (
  `id_equipoPlan` int(11) NOT NULL,
  `id_equipo` int(11) NOT NULL,
  `id_planEntrenamiento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadomesociclo`
--

CREATE TABLE `estadomesociclo` (
  `id_estadoMesociclo` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadomicrociclo`
--

CREATE TABLE `estadomicrociclo` (
  `id_estadoMicrociclo` int(11) NOT NULL,
  `descripcion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesociclo`
--

CREATE TABLE `mesociclo` (
  `id_mesociclo` int(11) NOT NULL,
  `id_tipo` int(11) NOT NULL,
  `id_estadoMesociclo` int(11) NOT NULL,
  `id_microciclo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `microciclo`
--

CREATE TABLE `microciclo` (
  `id_microciclo` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `id_estadoMicrociclo` int(11) NOT NULL,
  `id_sesionEntrenamiento` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planentretenimiento`
--

CREATE TABLE `planentretenimiento` (
  `id_planEntrenamiento` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `id_mesociclo` int(11) NOT NULL,
  `observaciones` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesionentrenamiento`
--

CREATE TABLE `sesionentrenamiento` (
  `id_sesionEntrenamiento` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `id_tipo` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`id_equipo`);

--
-- Indices de la tabla `equipoplan`
--
ALTER TABLE `equipoplan`
  ADD PRIMARY KEY (`id_equipoPlan`),
  ADD KEY `id_equipo` (`id_equipo`),
  ADD KEY `id_planEntrenamieento` (`id_planEntrenamiento`);

--
-- Indices de la tabla `estadomesociclo`
--
ALTER TABLE `estadomesociclo`
  ADD PRIMARY KEY (`id_estadoMesociclo`);

--
-- Indices de la tabla `estadomicrociclo`
--
ALTER TABLE `estadomicrociclo`
  ADD PRIMARY KEY (`id_estadoMicrociclo`);

--
-- Indices de la tabla `mesociclo`
--
ALTER TABLE `mesociclo`
  ADD PRIMARY KEY (`id_mesociclo`),
  ADD KEY `id_tipo` (`id_tipo`),
  ADD KEY `id_estadoMesociclo` (`id_estadoMesociclo`),
  ADD KEY `id_microciclo` (`id_microciclo`);

--
-- Indices de la tabla `microciclo`
--
ALTER TABLE `microciclo`
  ADD PRIMARY KEY (`id_microciclo`),
  ADD KEY `id_estadoMicrociclo` (`id_estadoMicrociclo`),
  ADD KEY `id_sesionEntrenamiento` (`id_sesionEntrenamiento`);

--
-- Indices de la tabla `planentretenimiento`
--
ALTER TABLE `planentretenimiento`
  ADD PRIMARY KEY (`id_planEntrenamiento`),
  ADD KEY `mesociclo` (`id_mesociclo`);

--
-- Indices de la tabla `sesionentrenamiento`
--
ALTER TABLE `sesionentrenamiento`
  ADD PRIMARY KEY (`id_sesionEntrenamiento`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`id_tipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `id_equipo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `equipoplan`
--
ALTER TABLE `equipoplan`
  MODIFY `id_equipoPlan` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `estadomesociclo`
--
ALTER TABLE `estadomesociclo`
  MODIFY `id_estadoMesociclo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `estadomicrociclo`
--
ALTER TABLE `estadomicrociclo`
  MODIFY `id_estadoMicrociclo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mesociclo`
--
ALTER TABLE `mesociclo`
  MODIFY `id_mesociclo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `microciclo`
--
ALTER TABLE `microciclo`
  MODIFY `id_microciclo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `planentretenimiento`
--
ALTER TABLE `planentretenimiento`
  MODIFY `id_planEntrenamiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `sesionentrenamiento`
--
ALTER TABLE `sesionentrenamiento`
  MODIFY `id_sesionEntrenamiento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo`
--
ALTER TABLE `tipo`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `equipoplan`
--
ALTER TABLE `equipoplan`
  ADD CONSTRAINT `equipoplan_ibfk_1` FOREIGN KEY (`id_equipo`) REFERENCES `equipo` (`id_equipo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `equipoplan_ibfk_2` FOREIGN KEY (`id_planEntrenamiento`) REFERENCES `planentretenimiento` (`id_planEntrenamiento`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `mesociclo`
--
ALTER TABLE `mesociclo`
  ADD CONSTRAINT `mesociclo_ibfk_1` FOREIGN KEY (`id_microciclo`) REFERENCES `microciclo` (`id_microciclo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mesociclo_ibfk_2` FOREIGN KEY (`id_tipo`) REFERENCES `tipo` (`id_tipo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mesociclo_ibfk_3` FOREIGN KEY (`id_estadoMesociclo`) REFERENCES `estadomesociclo` (`id_estadoMesociclo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `microciclo`
--
ALTER TABLE `microciclo`
  ADD CONSTRAINT `microciclo_ibfk_1` FOREIGN KEY (`id_sesionEntrenamiento`) REFERENCES `sesionentrenamiento` (`id_sesionEntrenamiento`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `microciclo_ibfk_2` FOREIGN KEY (`id_estadoMicrociclo`) REFERENCES `estadomicrociclo` (`id_estadoMicrociclo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `planentretenimiento`
--
ALTER TABLE `planentretenimiento`
  ADD CONSTRAINT `planentretenimiento_ibfk_1` FOREIGN KEY (`id_mesociclo`) REFERENCES `mesociclo` (`id_mesociclo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

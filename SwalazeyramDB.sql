-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Feb 13, 2024 at 02:42 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `SwalazeyramDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `Id` int(4) NOT NULL,
  `Name` text NOT NULL,
  `Course` varchar(250) NOT NULL,
  `DOB` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Id`, `Name`, `Course`, `DOB`) VALUES
(12, 'Henry hart', 'BCOM', '2005-04-17'),
(13, 'Jeff bilsky', 'BCOM', '1994-02-14'),
(14, 'Piper Hart', 'BSD', '2013-03-14'),
(15, 'kelly  wasaka', 'BSD', '2013-03-14'),
(16, 'kid cudi', 'BSD', '2013-03-14'),
(17, 'Piper Hart', 'BSD', '2013-03-14'),
(18, 'Piper Hart', 'BSD', '2013-03-14'),
(19, 'Piper Hart', 'BSD', '2013-03-14'),
(20, 'kelly  wasaka', 'BSD', '2013-03-14'),
(21, 'kid cudi', 'BSD', '2013-03-14'),
(22, 'j hart', 'BSD', '2013-03-14'),
(23, 'Piper Hart', 'BSD', '2013-03-14'),
(24, 'kelly  wasaka', 'BSD', '2013-03-14'),
(25, 'kid cudi', 'BSD', '2013-03-14'),
(26, 'j hart', 'BSD', '2013-03-14'),
(27, 'Piper Hart', 'BSD', '2013-03-14');

-- --------------------------------------------------------

--
-- Table structure for table `table1`
--

CREATE TABLE `table1` (
  `Id` int(4) NOT NULL,
  `Name` text NOT NULL,
  `Talent` varchar(200) NOT NULL,
  `DOB` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `userid` int(11) NOT NULL,
  `teacher` text DEFAULT NULL,
  `class` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`userid`, `teacher`, `class`) VALUES
(1, 'Haller', 'GRD4');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `table1`
--
ALTER TABLE `table1`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `table1`
--
ALTER TABLE `table1`
  MODIFY `Id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

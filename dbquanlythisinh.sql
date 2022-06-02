-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2022 at 06:19 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbquanlythisinh`
--

-- --------------------------------------------------------

--
-- Table structure for table `khoi`
--

CREATE TABLE `khoi` (
  `id` int(11) NOT NULL,
  `tenKhoi` varchar(10) CHARACTER SET utf8 NOT NULL,
  `monThi1` varchar(30) CHARACTER SET utf8 NOT NULL,
  `monThi2` varchar(30) CHARACTER SET utf8 NOT NULL,
  `monThi3` varchar(30) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `khoi`
--

INSERT INTO `khoi` (`id`, `tenKhoi`, `monThi1`, `monThi2`, `monThi3`) VALUES
(1, 'Khối A', 'Toán', 'Vật Lý', 'Hoá Học'),
(2, 'Khối B', 'Toán', 'Hoá Học', 'Sinh Học'),
(3, 'Khối C', 'Ngữ Văn', 'Lịch Sử', 'Địa Lý'),
(4, 'Khối D', 'Ngữ Văn', 'Toán', 'Ngoại Ngữ');

-- --------------------------------------------------------

--
-- Table structure for table `thisinh`
--

CREATE TABLE `thisinh` (
  `SBD` int(6) NOT NULL,
  `hoTen` varchar(50) CHARACTER SET utf8 NOT NULL,
  `diaChi` varchar(100) CHARACTER SET utf8 NOT NULL,
  `uuTien` varchar(200) CHARACTER SET utf8 NOT NULL,
  `khoi` varchar(30) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `thisinh`
--

INSERT INTO `thisinh` (`SBD`, `hoTen`, `diaChi`, `uuTien`, `khoi`) VALUES
(2001, 'Long Phạm', 'Nam Định', 'Khu vực thị xã, thành phố trực thuộc tỉnh, các thị xã, huyện ngoại thành của thành phố trực thuộc Trung ương (0.25 điểm)', 'Khối A'),
(201901, 'Manh', 'Hà Nội', 'Thương bệnh binh (2 điểm)', 'Khối B');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `khoi`
--
ALTER TABLE `khoi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `thisinh`
--
ALTER TABLE `thisinh`
  ADD PRIMARY KEY (`SBD`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `khoi`
--
ALTER TABLE `khoi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `thisinh`
--
ALTER TABLE `thisinh`
  MODIFY `SBD` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201913;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 24, 2019 at 03:30 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `guardian`
--

CREATE TABLE `guardian` (
  `nid` bigint(17) NOT NULL,
  `guardian_name` varchar(50) NOT NULL,
  `reg` bigint(17) NOT NULL,
  `mobile_num` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `guardian`
--

INSERT INTO `guardian` (`nid`, `guardian_name`, `reg`, `mobile_num`) VALUES
(19899125909966318, 'Suhada Begum', 2006913709002914, '01732218311'),
(19779125909011398, 'Md. Anwar Hussan', 20039137090029294, '01730480511'),
(19679125909966352, 'Alim Uddin', 20049137090024107, '01781150322'),
(19859125901951232, 'Rubi Begum', 20079123702108549, '01756018550'),
(19729125909966161, 'Fathrun Khanom', 20079123709107380, '01765654578'),
(19779125909011398, 'Md. Anwar Hussan', 20079123709107473, '01730480511'),
(19779123709109987, 'Amir Ali', 20079123709109987, '01716753439'),
(19879125909966299, 'Shafia Begum', 20089123709108061, '01753905824'),
(19889125909014392, 'Rushna Begum', 20089123709108089, '01764052463'),
(19829125909966253, 'Begum', 20089123709108103, '01791457897'),
(19819125909966325, 'Fateha Begum', 20089123709108335, '01747928933'),
(19599125909966210, 'Habibur Rahman', 20089123709108419, '01724489121'),
(19779125909966251, 'Sahanera Begum', 20089123709108446, '01710634243'),
(19769123709108533, 'Hashim', 20089123709108533, '01754592930'),
(19859125909966306, 'Nezam uddin', 20089123709108830, '01788481448'),
(19719125909966201, 'Foridun Nessa', 20089137090024715, '01721155729'),
(19929125907962859, 'Md .Abbas Uddin', 20099123707108410, '01772614786'),
(19829125909966253, 'Begum', 20099123709108102, '01791457897'),
(19819125909014359, 'Md.Husen Ahmed', 20099123709108393, '01747699704'),
(19829125909966255, 'Moyna', 20099123709109008, '01778682353'),
(19879125909966256, 'Tuta Mia', 20099123709109888, '01724016978'),
(19779123709109987, 'Amir Ali', 20099123709109986, '01716753439'),
(19829125909011368, 'Husne Ara', 20109123709100664, '01760932189'),
(19879125909966299, 'Shafia Begum', 20109123709108060, '01753905824'),
(19899125909966315, 'Suhada Begum', 20109123709108207, '01780199893'),
(19599125909966210, 'Habibur Rahman', 20109123709108420, '01724489121'),
(19839125909014363, 'Md. Ali Ahmed', 20119123709105305, '01764280550'),
(19709125909966187, 'Anwara Begum', 20119123709109940, '01760771031'),
(19859125909966389, 'Shamima Begum', 20129123709108245, '01726839611'),
(19769125909966163, 'Hashim', 20129123709108532, '01754592930'),
(19909125909000008, 'Kulsuma Begum', 20129123709109771, '01793450083'),
(19929125909000067, 'Rabiya Begum', 20129123709109774, '01796303819'),
(19679125909966352, 'Alim Uddin', 200691377090024106, '01781150322');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `name` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`name`, `email`, `username`, `password`, `type`) VALUES
('Akhlak', 'akhlak@metrouni.edu.bd', 'ashik', 'ashik', 'Operator'),
('Jakaria', 'jhossain439@gmail.com', 'jakaria', 'jaka', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `permanent_adrs`
--

CREATE TABLE `permanent_adrs` (
  `birth_reg` bigint(17) NOT NULL,
  `village` varchar(30) NOT NULL,
  `post_code` int(11) NOT NULL,
  `upazila` varchar(30) NOT NULL,
  `district` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `permanent_adrs`
--

INSERT INTO `permanent_adrs` (`birth_reg`, `village`, `post_code`, `upazila`, `district`) VALUES
(2006913709002914, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(2008912309108830, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20039137090029294, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20049137090024107, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123702108549, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123709107380, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123709107473, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123709109987, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108061, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108089, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108103, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108335, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108419, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108446, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108533, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108830, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089137090024715, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123707108410, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709108102, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709108393, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709109008, 'Niz Chawra ', 3180, 'Kanaighat', 'Sylhet'),
(20099123709109888, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709109986, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709100664, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709108060, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709108207, 'Niz Chawra ', 3, 'K', 's'),
(20109123709108420, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20119123709105305, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20119123709109940, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'sylhet'),
(20129123709108245, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20129123709108532, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20129123709109771, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20129123709109774, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet');

-- --------------------------------------------------------

--
-- Table structure for table `present_adrs`
--

CREATE TABLE `present_adrs` (
  `reg` bigint(17) NOT NULL,
  `village` varchar(30) NOT NULL,
  `post_code` int(11) NOT NULL,
  `upazila` varchar(20) NOT NULL,
  `district` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `present_adrs`
--

INSERT INTO `present_adrs` (`reg`, `village`, `post_code`, `upazila`, `district`) VALUES
(2006913709002914, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(2008912309108830, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20039137090029294, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20049137090024107, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123702108549, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123709107380, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123709107473, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20079123709109987, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108061, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108089, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108103, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108335, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108419, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108446, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108533, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089123709108830, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20089137090024715, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123707108410, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709108102, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709108393, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709109008, 'Niz Chawra', 3180, 'Kanaighat', 'Sylhet'),
(20099123709109888, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20099123709109986, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709100664, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709108060, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709108207, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20109123709108420, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20119123709105305, 'Niz Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20119123709109940, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'sylhet'),
(20129123709108245, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20129123709108532, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20129123709109771, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet'),
(20129123709109774, 'Nij Chawra Dakkin', 3180, 'Kanaighat', 'Sylhet');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `reg` bigint(17) NOT NULL,
  `student_name` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `birth_date` varchar(20) NOT NULL,
  `class` int(2) NOT NULL,
  `admission_year` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`reg`, `student_name`, `gender`, `birth_date`, `class`, `admission_year`) VALUES
(2006913709002914, 'Jumara Akhtar', 'Female', '03-02-2006', 5, 2013),
(20039137090029294, 'Surma Begum', 'Female', '29-12-2003', 5, 2011),
(20049137090024107, 'Md. Nasir Uddin', 'Male', '15-09-2004', 5, 2014),
(20079123702108549, 'Kuhinur Akther', 'Female', '12-03-2007', 5, 2014),
(20079123709107380, 'Sumana Akther Rumi', 'Female', '14-06-2007', 5, 2014),
(20079123709107473, 'Rima Begum', 'Female', '18-04-2007', 4, 2015),
(20079123709109987, 'Samia Begum', 'Female', '10-08-2007', 3, 2016),
(20089123709108061, 'Parvin Akther', 'Female', '03-12-2008', 3, 2015),
(20089123709108089, 'Lucky Akther Sumi', 'Female', '06-05-2008', 3, 2016),
(20089123709108103, 'Sahan Ahmed', 'Male', '12-09-2008', 3, 2015),
(20089123709108335, 'Mehedi Akther Sima', 'Female', '17-11-2008', 4, 2015),
(20089123709108419, 'Panna Begum', 'Female', '19-06-2008', 3, 2015),
(20089123709108446, 'Sidratun Muntaha Nipa', 'Female', '23-08-2008', 4, 2015),
(20089123709108533, 'Selina', 'Female', '12-03-2008', 4, 2013),
(20089123709108830, 'Mehedi Hasan Suhag', 'Male', '24-09-2008', 4, 2013),
(20089137090024715, 'Md. Masudur Rahman', 'Male', '09-09-2008', 3, 2014),
(20099123707108410, 'Khosruzzaman Babor', 'Male', '10-01-2009', 4, 2015),
(20099123709108102, 'Suhan Ahmed', 'Male', '09-09-2009', 2, 2016),
(20099123709108393, 'Kanij Fahmida Noha', 'Female', '12-12-2009', 3, 2016),
(20099123709109008, 'Ruji Begum', 'Female', '08-08-2009', 3, 2016),
(20099123709109888, 'Tanzila Akther Lima', 'Female', '30-06-2009', 3, 2016),
(20099123709109986, 'Abul Hasnat', 'Male', '23-04-2009', 4, 2015),
(20109123709100664, 'Rumi Begum', 'Female', '0808-2010', 1, 2017),
(20109123709108060, 'Najmin Akther', 'Female', '13-09-2010', 2, 2016),
(20109123709108207, 'Abu Sufian', 'Male', '01-01-2010', 3, 2016),
(20109123709108420, 'Tahmina Begum', 'Female', '19-06-2010', 2, 2016),
(20119123709105305, 'Maha Akther', 'Female', '29-03-2011', 2, 2016),
(20119123709109940, 'Mahfuja Begum', 'Female', '31-08-2011', 1, 2017),
(20129123709108245, 'Marwan', 'Male', '09-12-2012', 0, 2018),
(20129123709108532, 'Najran', 'Female', '07-08-2012', 0, 2018),
(20129123709109771, 'Jakir Uddin', 'Male', '12-05-2012', 0, 2018),
(20129123709109774, 'Abdul Kadir', 'Male', '23-02-2012', 0, 2018);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guardian`
--
ALTER TABLE `guardian`
  ADD PRIMARY KEY (`reg`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `permanent_adrs`
--
ALTER TABLE `permanent_adrs`
  ADD PRIMARY KEY (`birth_reg`);

--
-- Indexes for table `present_adrs`
--
ALTER TABLE `present_adrs`
  ADD PRIMARY KEY (`reg`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`reg`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

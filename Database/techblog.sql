-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2021 at 12:29 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `techblog`
--

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `cid` int(10) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `categories`
--

INSERT INTO `categories` (`cid`, `name`, `description`) VALUES
(1, 'Programming', 'Programming is the process of creating a set of instructions that tell a computer how to perform a task.'),
(7, 'Web Development', 'Web Technology refers to the various tools and techniques that are utilized in the process of communication between different types of devices over the internet.'),
(8, 'Artifical Intelligence & ML', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `liked`
--

CREATE TABLE `liked` (
  `lid` int(10) NOT NULL,
  `pid` int(20) NOT NULL,
  `uid` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `liked`
--

INSERT INTO `liked` (`lid`, `pid`, `uid`) VALUES
(1, 2, 1),
(2, 2, 1),
(3, 2, 2),
(4, 2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `posts`
--

CREATE TABLE `posts` (
  `pId` int(10) NOT NULL,
  `pTitle` varchar(150) NOT NULL,
  `pContent` varchar(999) NOT NULL,
  `pCode` varchar(500) DEFAULT NULL,
  `pPic` varchar(100) DEFAULT NULL,
  `pDate` timestamp NOT NULL DEFAULT current_timestamp(),
  `catId` int(11) NOT NULL,
  `userId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `posts`
--

INSERT INTO `posts` (`pId`, `pTitle`, `pContent`, `pCode`, `pPic`, `pDate`, `catId`, `userId`) VALUES
(1, 'Java Frameworks', 'What is Framework in Java\r\nJava Framework is the body or platform of pre-written codes used by Java developers to develop Java applications or web applications. In other words, Java Framework is a collection of predefined classes and functions that is used to process input, manage hardware devices interacts with system software. It acts like a skeleton that helps the developer to develop an application by writing their own code.\r\n\r\nPopular Java Frameworks\r\nSome of the most popular Java frameworks are:\r\nSpring\r\nHibernate\r\nGrails\r\nPlay\r\nJavaServer Faces (JSF)\r\nGoogle Web Toolkit (GWT)\r\nQuarkus', '', '', '2021-12-15 07:12:34', 1, 1),
(2, 'Most Trending Technolgy', 'AI and ML models and projects are inherently different from traditional software models. When we talk about AI/ML projects, the tools and technologies used and the skillset required is totally different from those used in the development of conventional software projects. AI/ML applications require a language that is stable, secure, flexible, and is equipped with tools that can handle the various unique requirements of such projects. Python has all these qualities, and hence, it has become one of the most favored languages of Data Science professiona', '', 'ai.jpg', '2021-12-15 10:48:49', 8, 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(10) NOT NULL,
  `name` varchar(30) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `gender` varchar(8) NOT NULL,
  `about` varchar(60) DEFAULT NULL,
  `rdate` timestamp NOT NULL DEFAULT current_timestamp(),
  `profile` varchar(100) NOT NULL DEFAULT 'default.png'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `name`, `email`, `password`, `gender`, `about`, `rdate`, `profile`) VALUES
(1, 'Tushar171', 'tusharsaini5678@gmail.com', 'Tushar@123', 'male', 'Blogger\r\n                                                ', '2021-12-15 05:17:23', 'newpic.jpg'),
(2, 'Tyagi121', 'ttyagi191@gmail.com', 'tyagi@123', 'male', 'Developer', '2021-12-15 10:51:21', 'default.png');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `liked`
--
ALTER TABLE `liked`
  ADD PRIMARY KEY (`lid`),
  ADD KEY `pid` (`pid`),
  ADD KEY `uid` (`uid`);

--
-- Indexes for table `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`pId`),
  ADD KEY `Foreign key` (`catId`),
  ADD KEY `userId` (`userId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `name` (`name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `categories`
--
ALTER TABLE `categories`
  MODIFY `cid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `liked`
--
ALTER TABLE `liked`
  MODIFY `lid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `posts`
--
ALTER TABLE `posts`
  MODIFY `pId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `liked`
--
ALTER TABLE `liked`
  ADD CONSTRAINT `liked_ibfk_1` FOREIGN KEY (`pid`) REFERENCES `posts` (`pId`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `liked_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `user` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `posts`
--
ALTER TABLE `posts`
  ADD CONSTRAINT `Foreign key` FOREIGN KEY (`catId`) REFERENCES `categories` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

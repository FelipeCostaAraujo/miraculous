-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 12-Nov-2017 às 22:06
-- Versão do servidor: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empresa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_func` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `cpf` int(11) NOT NULL,
  `dtn` int(8) NOT NULL,
  `idade` int(11) NOT NULL,
  `cargo` varchar(255) NOT NULL,
  `salario` float NOT NULL,
  `projeto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_func`, `nome`, `cpf`, `dtn`, `idade`, `cargo`, `salario`, `projeto`) VALUES
(1, 'Gustavo Dos Santos Vieira', 0, 0, 21, 'Analista', 1440, ''),
(2, 'Everson Vagabunda Barbosa', 0, 0, 20, 'Book Rosa', 0.5, ''),
(3, 'Henrique', 0, 0, 14, 'Viado', 0.5, 'Viade pura'),
(5, 'guas', 2147483647, 30091996, 98, 'aisjdi', 1.2, 'dsad'),
(6, 'ASDFGHJKL', 23, 30091996, 2345, 'SDFGHKJL', 234, 'SDFGHJ');

-- --------------------------------------------------------

--
-- Estrutura da tabela `projeto`
--

CREATE TABLE `projeto` (
  `id_Proj` int(11) NOT NULL,
  `Cnpj` varchar(20) NOT NULL,
  `NomeP` varchar(50) NOT NULL,
  `NomeE` varchar(50) NOT NULL,
  `dataInicio` varchar(20) NOT NULL,
  `dataFim` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `projeto`
--

INSERT INTO `projeto` (`id_Proj`, `Cnpj`, `NomeP`, `NomeE`, `dataInicio`, `dataFim`) VALUES
(7, '1234', 'felipe', 'felipe', '0000-00-00', '20182017'),
(8, '1234', 'felipe', '123f', '0000-00-00', '12072017'),
(9, '1234', 'fleipe', 'fl', '1218', '12082019'),
(10, '1234', 'felipe', 'fl', '0.000661047760535448', '20092017'),
(11, '1234', 'felipe', 'fe124', '0.000661047760535448', '12092017'),
(12, '1234', 'fel', 'fl', '12/10/2017', '12102017'),
(13, '123456', 'felipe', 'fl', '12/12/2012', '12/12/2012'),
(14, '12345', 'felipe', 'asd]', '12/10/2017', '20/10/2018');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_func`);

--
-- Indexes for table `projeto`
--
ALTER TABLE `projeto`
  ADD PRIMARY KEY (`id_Proj`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `projeto`
--
ALTER TABLE `projeto`
  MODIFY `id_Proj` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

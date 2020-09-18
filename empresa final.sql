-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 04-Dez-2017 às 20:21
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
  `cpf` varchar(18) NOT NULL,
  `dtn` varchar(12) NOT NULL,
  `cargo` varchar(255) NOT NULL,
  `salario` float NOT NULL,
  `projeto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id_func`, `nome`, `cpf`, `dtn`, `cargo`, `salario`, `projeto`) VALUES
(5, 'guas', '', '30091996', 'aisjdi', 1.2, 'dsad'),
(6, 'ASDFGHJKL', '', '30091996', 'SDFGHKJL', 234, 'SDFGHJ'),
(8, 'everson', '', '24/24/2424', 'puta', 222, 'book rosa'),
(9, 'gerson', '', '13/10/1988', 'analista', 900, 'charopada em java'),
(10, 'f', '123.123.123-12', '11/11/1111', '1', 1, '1'),
(11, 'f', '123.123.123-12', '11/11/1111', '1', 1, '1');

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
(20, '99.999.999/9999-99', 'felipe1', 'felipe', '11/11/1111', '11/11/1111'),
(24, '  .   .   /    -  ', 'everson', 'felipe', '11/11/1111', '11/11/1111'),
(25, '11.111.111/1111-11', 'miraculous', 'felipe', '11/11/1111', '11/11/1111'),
(30, '12.312.312/3123-11', 'projeto', 'felipe', '22/12/2019', '22/12/2019');

-- --------------------------------------------------------

--
-- Estrutura da tabela `senhap`
--

CREATE TABLE `senhap` (
  `login` varchar(10) NOT NULL,
  `senha` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `senhap`
--

INSERT INTO `senhap` (`login`, `senha`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbempresa`
--

CREATE TABLE `tbempresa` (
  `id_empresa` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Representante` varchar(30) NOT NULL,
  `Telefone` int(11) NOT NULL,
  `Cnpj` varchar(20) NOT NULL,
  `Endereco` varchar(50) NOT NULL,
  `Email` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbempresa`
--

INSERT INTO `tbempresa` (`id_empresa`, `Nome`, `Representante`, `Telefone`, `Cnpj`, `Endereco`, `Email`) VALUES
(11, 'gustavo123', 'gustavo123', 123, '21.231.231/2312-31', '12123123', 'gustavo@123123@@');

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
  ADD PRIMARY KEY (`id_Proj`),
  ADD UNIQUE KEY `NomeP` (`NomeP`);

--
-- Indexes for table `senhap`
--
ALTER TABLE `senhap`
  ADD PRIMARY KEY (`login`),
  ADD UNIQUE KEY `login` (`login`);

--
-- Indexes for table `tbempresa`
--
ALTER TABLE `tbempresa`
  ADD PRIMARY KEY (`id_empresa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `projeto`
--
ALTER TABLE `projeto`
  MODIFY `id_Proj` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `tbempresa`
--
ALTER TABLE `tbempresa`
  MODIFY `id_empresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

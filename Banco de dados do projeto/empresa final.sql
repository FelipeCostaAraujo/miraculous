-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 05-Dez-2017 às 01:57
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.10

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
(13, 'felipe costa araujo', '123.455.666-67', '06/10/1994', 'desenvolvedor', 1100, 'java free'),
(14, 'everson silva barbosa', '123.456.789-99', '24/06/1995', 'Mimimi', 889, 'PHP basico'),
(15, 'Jenifer cristine', '001.234.567-89', '12/08/1998', 'Analista', 1100, 'C Intermediario'),
(16, 'Jonathans Paiva', '444.555.666-77', '01/10/1993', 'Analista', 1100, 'C Intermediario'),
(17, 'Gustavo Viera de souza', '999.999.999-99', '30/09/1996', 'Desenvolvedor', 1100, 'Java Free'),
(18, 'Alfredo Cunha', '666.999.666-69', '06/07/2001', 'Estagiario', 889, 'Poo Java');

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
(31, '12.312.312/3333-31', 'Java free', 'Miraculous', '05/06/2017', '05/12/2017'),
(32, '12.312.312/3333-31', 'Projeto alterar', 'Miraculous', '11/06/2017', '05/12/2017'),
(33, '12.345.678/9999-99', 'PHP basico', 'Miraculous', '12/06/2017', '30/06/2017'),
(34, '12.345.678/9999-99', 'C intermediario', 'Miraculous', '20/10/2017', '19/10/2017'),
(35, '12.345.678/9999-99', 'Poo Java', 'Miraculous', '02/01/2017', '04/12/2017');

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
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbempresa`
--

INSERT INTO `tbempresa` (`id_empresa`, `Nome`, `Representante`, `Telefone`, `Cnpj`, `Endereco`, `Email`) VALUES
(11, 'gustavo123', 'gustavo123', 123, '21.231.231/2312-31', '12123123', 'gustavo@123123@@'),
(12, 'Miraculous', 'Varios', 55555555, '  .   .   /    -  ', 'Miraculandia', 'Miraculous@gmail.com'),
(13, 'Ação comunitaria', 'prefeitura', 12345678, '12.345.567/8999-00', 'rua jardim alfredo n44', 'acaocomunitaria@contato.gov.br');

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
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `projeto`
--
ALTER TABLE `projeto`
  MODIFY `id_Proj` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT for table `tbempresa`
--
ALTER TABLE `tbempresa`
  MODIFY `id_empresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

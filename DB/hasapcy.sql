-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Хост: 127.0.0.1
-- Время создания: Фев 17 2025 г., 11:57
-- Версия сервера: 10.4.24-MariaDB
-- Версия PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `hasapcy`
--

-- --------------------------------------------------------

--
-- Структура таблицы `ammar`
--

CREATE TABLE `ammar` (
  `tb` int(11) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `product_name` varchar(20) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `sany` int(11) DEFAULT NULL,
  `last_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `incoming_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `hasaplasyk`
--

CREATE TABLE `hasaplasyk` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `wezipe` varchar(255) NOT NULL,
  `ayy` varchar(11) NOT NULL,
  `aylygy` double NOT NULL,
  `umumy_aylyk` double NOT NULL,
  `islan_sagat` int(11) NOT NULL,
  `islemeli_sagat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `isgarler`
--

CREATE TABLE `isgarler` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `wezipe` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `login` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `number` varchar(255) NOT NULL,
  `umumyAylyk` double NOT NULL,
  `role` varchar(255) NOT NULL,
  `own_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `kategoriya`
--

CREATE TABLE `kategoriya` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `onumcilik`
--

CREATE TABLE `onumcilik` (
  `id` int(11) NOT NULL,
  `onum_id` int(11) NOT NULL,
  `ady` varchar(255) NOT NULL,
  `kategoriya` varchar(255) NOT NULL,
  `bahasy` double NOT NULL,
  `ondurilensenesi` date NOT NULL,
  `mohleti` varchar(255) NOT NULL,
  `umumymukdary` int(11) NOT NULL,
  `nace_girdejilik_onum` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `onumler`
--

CREATE TABLE `onumler` (
  `id` int(11) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `bahasy` double NOT NULL,
  `info` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `tutumlar`
--

CREATE TABLE `tutumlar` (
  `id` int(11) NOT NULL,
  `isgar_ady` varchar(255) NOT NULL,
  `isgar_familiyasy` varchar(255) NOT NULL,
  `wezipesi` varchar(255) NOT NULL,
  `ady` varchar(255) NOT NULL,
  `bahasy` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Структура таблицы `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `surname` varchar(25) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `user`
--

INSERT INTO `user` (`id`, `name`, `surname`, `login`, `password`, `role`) VALUES
(1, 'Batyr', 'Omurkulow', 'batyok', 'e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855', 'Administrator');

-- --------------------------------------------------------

--
-- Структура таблицы `wezipeler`
--

CREATE TABLE `wezipeler` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `wezipesi` varchar(255) NOT NULL,
  `aylygy` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `ammar`
--
ALTER TABLE `ammar`
  ADD PRIMARY KEY (`tb`),
  ADD KEY `product_id` (`product_id`),
  ADD KEY `category_id` (`category_id`);

--
-- Индексы таблицы `hasaplasyk`
--
ALTER TABLE `hasaplasyk`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `isgarler`
--
ALTER TABLE `isgarler`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `kategoriya`
--
ALTER TABLE `kategoriya`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `onumcilik`
--
ALTER TABLE `onumcilik`
  ADD PRIMARY KEY (`id`),
  ADD KEY `onum_id` (`onum_id`);

--
-- Индексы таблицы `onumler`
--
ALTER TABLE `onumler`
  ADD PRIMARY KEY (`id`),
  ADD KEY `category_id` (`category_id`);

--
-- Индексы таблицы `tutumlar`
--
ALTER TABLE `tutumlar`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `wezipeler`
--
ALTER TABLE `wezipeler`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `ammar`
--
ALTER TABLE `ammar`
  MODIFY `tb` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `hasaplasyk`
--
ALTER TABLE `hasaplasyk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `isgarler`
--
ALTER TABLE `isgarler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `kategoriya`
--
ALTER TABLE `kategoriya`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `onumcilik`
--
ALTER TABLE `onumcilik`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `onumler`
--
ALTER TABLE `onumler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `tutumlar`
--
ALTER TABLE `tutumlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT для таблицы `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT для таблицы `wezipeler`
--
ALTER TABLE `wezipeler`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `ammar`
--
ALTER TABLE `ammar`
  ADD CONSTRAINT `ammar_ibfk_1` FOREIGN KEY (`product_id`) REFERENCES `onumler` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `ammar_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `kategoriya` (`id`) ON DELETE CASCADE;

--
-- Ограничения внешнего ключа таблицы `onumcilik`
--
ALTER TABLE `onumcilik`
  ADD CONSTRAINT `onumcilik_ibfk_1` FOREIGN KEY (`onum_id`) REFERENCES `onumler` (`id`) ON DELETE CASCADE;

--
-- Ограничения внешнего ключа таблицы `onumler`
--
ALTER TABLE `onumler`
  ADD CONSTRAINT `onumler_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `kategoriya` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

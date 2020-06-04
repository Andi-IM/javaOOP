-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 04 Jun 2020 pada 05.53
-- Versi server: 5.7.24
-- Versi PHP: 7.2.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pustaka`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE `anggota` (
  `kodeAnggota` varchar(5) NOT NULL,
  `namaAnggota` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jekel` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`kodeAnggota`, `namaAnggota`, `alamat`, `jekel`) VALUES
('A001', 'Ali', 'padang', 'L');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE `buku` (
  `kodebuku` varchar(5) NOT NULL,
  `judul` varchar(20) NOT NULL,
  `pengarang` varchar(20) NOT NULL,
  `tahun` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`kodebuku`, `judul`, `pengarang`, `tahun`) VALUES
('B001', 'Hikaru Nara', 'Miyoshi Mikoto', '2020');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `kodeAnggota` varchar(10) NOT NULL,
  `kodeBuku` varchar(10) NOT NULL,
  `tglPinjam` date NOT NULL,
  `tglKembali` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`kodeAnggota`, `kodeBuku`, `tglPinjam`, `tglKembali`) VALUES
('a001', 'b001', '2020-05-28', '2020-05-30');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE `pengembalian` (
  `kodeAnggota` varchar(5) NOT NULL,
  `kodeBuku` varchar(5) NOT NULL,
  `tglPinjam` date NOT NULL,
  `tglKembali` date NOT NULL,
  `tglDikembalikan` date NOT NULL,
  `terlambat` int(11) NOT NULL,
  `denda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`kodeAnggota`);

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kodebuku`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`kodeAnggota`);

--
-- Indeks untuk tabel `pengembalian`
--
ALTER TABLE `pengembalian`
  ADD PRIMARY KEY (`kodeAnggota`,`kodeBuku`,`tglPinjam`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

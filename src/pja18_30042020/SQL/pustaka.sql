-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Waktu pembuatan: 15 Jun 2020 pada 06.41
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
('A001', 'Ali', 'padang', 'L'),
('A002', 'Budi', 'Pariaman', 'L'),
('A003', 'Cici', 'Batusangkar', 'P'),
('A004', 'Dinda', 'Batusangkar', 'P'),
('A005', 'Egi', 'Padang Panjang', 'L'),
('A006', 'Fanny', 'Solok', 'L'),
('A007', 'Ganda', 'Solok', 'L'),
('A008', 'Hadi', 'Pasaman', 'L'),
('A009', 'Ismi', 'Jakarta', 'P'),
('A010', 'Jimmy', 'Agam', 'L');

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
('B001', 'Hikaru Nara', 'Miyoshi Mikoto', '2020'),
('B002', 'OOP', 'Richard Feymann', '1995'),
('B003', 'Data Structure', 'Lafore', '1985'),
('B004', 'Data Analysist', 'Rousyan', '2019');

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
('a002', 'b003', '2020-06-11', '2020-06-15'),
('a003', 'b004', '2020-06-04', '2020-06-11'),
('a004', 'b004', '2020-06-01', '2020-06-08');

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
-- Dumping data untuk tabel `pengembalian`
--

INSERT INTO `pengembalian` (`kodeAnggota`, `kodeBuku`, `tglPinjam`, `tglKembali`, `tglDikembalikan`, `terlambat`, `denda`) VALUES
('a001', 'b001', '2020-06-08', '2020-06-11', '2020-06-15', 4, 2000),
('a005', 'b002', '2020-05-31', '2020-06-07', '2020-06-15', 8, 4000),
('a007', 'b003', '2020-06-15', '2020-06-22', '2020-06-15', 0, 0),
('a008', 'b001', '2020-06-01', '2020-06-08', '2020-06-15', 7, 3500),
('a010', 'b003', '2020-05-20', '2020-05-25', '2020-06-15', 2, 10500);

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

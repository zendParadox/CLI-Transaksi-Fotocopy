package com.tutorial;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Function {
    Scanner input = new Scanner(System.in);
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

    double totalBelanjaan, pensil = 3500, pulpen = 2000, penghapus = 4000, notepad = 13000, tipex = 7000, penggaris = 4000, buku = 10000;
    int inputan;
    int qty1, qty2, qty3, qty4, qty5, qty6, qty7;
    String nama, jawab;
    double bayar, kurang, kembalian;
    double totalPensil, totalPulpen, totalPenghapus, totalNotepad, totalTipex, totalPenggaris, totalBuku;
    boolean beli1, beli2, beli3, beli4, beli5, beli6, beli7;
    boolean ket;


    void Tampilan() {
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        do {
            System.out.println("\n==========================================");
            System.out.println("=====Selamat Datang di Rafli Fotocopy=====");
            System.out.println("==========================================");
            System.out.println("1.  |   Pensil     |     Rp. 3.500,-    |");
            System.out.println("2.  |   Pulpen     |     Rp. 2.000,-    |");
            System.out.println("3.  |   Penghapus  |     Rp. 4.000,-    |");
            System.out.println("4.  |   Notepad    |     Rp. 13.000,-   |");
            System.out.println("5.  |   Tipex      |     Rp. 7.000,-    |");
            System.out.println("6.  |   Penggaris  |     Rp. 4.000,-    |");
            System.out.println("7.  |   Buku       |     Rp. 10.000,-   |");
            System.out.print("Masukkan angka yang anda inginkan: ");
            inputan = input.nextInt();

            switch (inputan) {
                case 1:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty1 = input.nextInt();
                    totalPensil = pensil * qty1;
                    nama = "Pensil";
                    beli1 = true;
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty2 = input.nextInt();
                    totalPulpen = pulpen * qty2;
                    nama = "Pulpen";
                    beli2 = true;
                    break;
                case 3:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty3 = input.nextInt();
                    totalPenghapus = penghapus * qty3;
                    nama = "Penghapus";
                    beli3 = true;
                    break;
                case 4:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty4 = input.nextInt();
                    totalNotepad = notepad * qty4;
                    nama = "Notepad";
                    beli4 = true;
                    break;
                case 5:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty5 = input.nextInt();
                    totalTipex = tipex * qty5;
                    nama = "Tipex";
                    beli5 = true;
                    break;
                case 6:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty6 = input.nextInt();
                    totalPenggaris = penggaris * qty6;
                    nama = "Penggaris";
                    beli6 = true;
                    break;
                case 7:
                    System.out.print("Masukkan jumlah yang diinginkan: ");
                    qty7 = input.nextInt();
                    totalBuku = buku * qty7;
                    nama = "Buku";
                    beli7 = true;
                    break;
                default:
                    System.err.print("Inputan yang anda masukkan salah!\n");


            }
            jawab = "tidak";
            System.out.print("\nApa anda ingin menambah barang lagi?(ya/tidak): ");
            jawab = input.next();
        } while (jawab.equalsIgnoreCase("ya"));
    }

    void Invoice() {
        totalBelanjaan = totalPensil + totalPulpen + totalPenghapus + totalNotepad + totalTipex + totalPenggaris + totalBuku;
        bayar = 0;
        System.out.println("Nama: " + nama);
        System.out.println("Daftar produk yang dibeli: ");
        System.out.println(" |        Nama Barang       |     Harga     |  Jumlah Barang  |     Total Harga     |");
        if (beli1) {
            System.out.println(" |        Pensil            | " + kursIndonesia.format(pensil) + "  |        " + qty1 + "        |    " + kursIndonesia.format(totalPensil) + "    |");
        }
        if (beli2) {
            System.out.println(" |        Pulpen            | " + kursIndonesia.format(pulpen) + "  |        " + qty2 + "        |    " + kursIndonesia.format(totalPulpen) + "    |");
        }
        if (beli3) {
            System.out.println(" |        Penghapus         | " + kursIndonesia.format(penghapus) + "  |        " + qty3 + "        |    " + kursIndonesia.format(totalPenghapus) + "    |");
        }
        if (beli4) {
            System.out.println(" |        Notepad           | " + kursIndonesia.format(notepad) + " |        " + qty4 + "        |    " + kursIndonesia.format(totalNotepad) + "    |");
        }
        if (beli5) {
            System.out.println(" |        Tipex             | " + kursIndonesia.format(tipex) + "  |        " + qty5 + "        |    " + kursIndonesia.format(totalTipex) + "    |");
        }
        if (beli6) {
            System.out.println(" |        Penggaris         | " + kursIndonesia.format(penggaris) + "  |        " + qty6 + "        |    " + kursIndonesia.format(totalPenggaris) + "    |");
        }
        if (beli7) {
            System.out.println(" |        Buku              | " + kursIndonesia.format(buku) + " |        " + qty7 + "        |    " + kursIndonesia.format(totalBuku) + "    |");
        }
        System.out.println("=====================================================================================");
        System.out.println("Total belanjaan anda sebesar: " + kursIndonesia.format(totalBelanjaan));
        do {
            ket = false;
            System.out.print("Masukkan pembayaran anda: ");
            bayar = input.nextDouble();

            if (bayar < totalBelanjaan) {
                ket = true;
                kurang = totalBelanjaan - bayar;
                System.out.println("---------------------Peringatan!---------------------");
                System.out.println("Mohon Maaf Uang anda Kurang: " + kursIndonesia.format(kurang));
                System.out.println("-----------------------------------------------------");
            }else {
                ket = false;
                kembalian = bayar - totalBelanjaan;
                System.out.println("Kembalian anda sebesar: " + kursIndonesia.format(kembalian));
            }
        }while (ket);
    }
}

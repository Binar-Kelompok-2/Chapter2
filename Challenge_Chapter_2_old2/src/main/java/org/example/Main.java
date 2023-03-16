package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main extends ReadData {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Tampil();
    }
    private static void Tampil() throws IOException {
        ReadData read = new ReadData();
        read.readCsv();
        MeanMedianModusFrekuensi rumus = new MeanMedianModusFrekuensi();
        CreateFolderAndFile createFolderAndFile = new CreateFolderAndFile();

        System.out.println("----------------------------------------");
        System.out.println("Aplikasi Pengolahan Nilai Siswa");
        System.out.println("----------------------------------------");
        System.out.println("Letakan File csv dengan nama file data_sekloah do direktori");
        System.out.println("Berikut : src/main/resources/CsvFile/data_sekolah.csv"); //dapat ditemukan di project kalian
        System.out.println();
        System.out.println("Pilih Menu : ");
        System.out.println("1. Generate Text Untuk Menampilkan Modus");
        System.out.println("2. Generate Text Untuk Menampilkan Nilai Rata-Rata, Median");
        System.out.println("3. Generate Kedua Text Dalam 1 File");
        System.out.println("0. Exit");
        System.out.print("Pilihan : ");
        int pilihan = sc.nextInt() ;
        rumus.modusRumus();
        rumus.medianRumus();
        rumus.meanRumus();
        switch (pilihan){
            case 1 -> {

                createFolderAndFile.createModus();
                createFolderAndFile.createFrekuensi();
                perulangan();
            }
            case 2 -> {

                createFolderAndFile.createMeanMedian();
                createFolderAndFile.createFrekuensi();
                perulangan();

            }
            case 3 -> {
                createFolderAndFile.createBoth();
                createFolderAndFile.createFrekuensi();
                perulangan();
            }
            case 0 -> System.exit(0);
            default -> {System.out.println("Input Error");
                Tampil();

            }
        }
    }

    private static void perulangan() throws IOException {
        System.out.println("Tekan Y Untuk Kembali Ke Menu Utama");
        System.out.println("Tekan N Untuk Keluar Dari Program");
        String ulang = sc.next();
        if(ulang.toLowerCase().equals("y")){
            dataArrayList.clear();
            jumlah = 0;
            banyak_data = 0;
            satu = 0;
            dua = 0;
            tiga = 0;
            empat = 0;
            lima = 0;
            enam = 0;
            tujuh = 0;
            delapan = 0;
            sembilan = 0;
            sepuluh = 0;
            dibawah_lima = 0;

            /*
            di setting clear semua atau default baru di balikan ke method tampil
            klo tidak nnt datanya malah  terus bertambah
            */

            Tampil();
        }
        else if(ulang.toLowerCase().equals("n")){
            System.out.println("Program Berhenti");
            System.exit(0);
        }
        else {
            System.out.println("Perintah Tidak Di Kenali");
            perulangan();
        }
    }
}
package org.example;

import java.util.Scanner;

public class Main extends ReadData {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Tampil();
    }
    private static void Tampil(){
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
        System.out.println("3. Generate Kedua File");
        System.out.println("0. Exit");
        System.out.print("Pilihan : ");
        int pilihan = sc.nextInt() ;
        switch (pilihan){
            case 1 -> {
                System.out.println("Belum Dibuat");
                perulangan();
            }
            case 2 -> {

                rumus.PrintMean();

                rumus.PrintFrekuensi();
                createFolderAndFile.createMeanMedian();
                createFolderAndFile.createFrekuensi();
                System.out.println(getMean());
                rumus.medianRumus();
                perulangan();

            }
            case 3 -> {
                System.out.println("Belum Dibuat");
                perulangan();
            }
            case 0 -> System.exit(0);
            default -> {System.out.println("Input Error");
                Tampil();
            }
        }
    }

    private static void perulangan(){
        System.out.println("Tekan Y Untuk Kembali Ke Menu Utama");
        System.out.println("Tekan N Untuk Keluar Dari Program");
        String ulang = sc.next();
        if(ulang.toLowerCase().equals("y")){
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
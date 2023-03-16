package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReadData extends Rumus{
    static ArrayList<String[]> dataArrayList = new ArrayList<>();
    static ArrayList list_nilai = new ArrayList();
    protected void readCsv() throws IOException {
        /*
            - \b digunakan untuk menandakan kata yang berdiri sendiri, sehingga hanya mencocokkan angka dan tidak mencocokkan angka di tengah kata.
            - [1-9] mencocokkan angka dari 1 hingga 9.
            - [1-9][0-9] mencocokkan angka dari 10 hingga 99.
            - 100 mencocokkan angka 100.
            - | digunakan untuk memisahkan pola mencocokkan.
        */
        String regex = "\\b([1-9]|[1-9][0-9]|100)\\b";
        try {
            String csvFile = "D:\Kuliah\KM\Chapter2-main\Challenge_Chapter_2\src\main\resources\CsvFile\data_sekolah.csv";
            //membaca setiap line
            String line = "";
            //pemisah
            String csvDelimiter = ";";

            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            //selama ada line yang bisa di baca dan tidak kosong
            while ((line = br.readLine()) != null) {
                //pisah setiap line yang mengandung ;
                String[] data = line.split(csvDelimiter);
                //masukan ke dataArrayList
                dataArrayList.add(data);
                //ulangi hingga datanya habis
            }

            //menampilkan error jika file tidak di temukan
        } catch (IOException e) {
            System.err.println("Cek Lagi Apakah Penamaan Atau Lokasi Benar Ada Di src/main/resources/CsvFile");
            System.err.println("Dan Apakah File Tersebut 'data_sekolah.csv'");
            throw new IOException("File Not Found");

        }

        // dibawah ini untuk print dataArrayList

        // selama inisialisasi string list sebagai row sebanyak dataArraylist
        for (String[] row : dataArrayList) {
            //selama inisialisasi value sebanyak row
            for (String value : row) {
                System.out.print(value + "\t");

                // melakukan pattern di compile sesuai dengan regex
                Pattern pattern = Pattern.compile(regex);
                // maka akan di cocokkan
                // value di cek dengan matcher jika match
                if (pattern.matcher(value).matches()) { // checker dan memasukan hanya angka kedalam list
                    //masukan ke list_nilai
                    list_nilai.add(value);

                }
                // ini untuk memasukan data ke frekuensi karena tidak menemukan cara menggunakan java collection
                if(value.equals("1")){
                    satu++;
                    dibawah_lima++;
                }else if(value.equals("2")){
                    dua++;
                    dibawah_lima++;
                }else if(value.equals("3")){

                    tiga++;
                    dibawah_lima++;
                }else if(value.equals("4")){

                    empat++;
                    dibawah_lima++;
                }else if(value.equals("5")){

                    lima++;
                }else if(value.equals("6")){

                    enam++;
                }else if(value.equals("7")){

                    tujuh++;
                }else if(value.equals("8")){

                    delapan++;
                }else if(value.equals("9")){

                    sembilan++;
                }else if(value.equals("10")){

                    sepuluh++;
                }

            }
            System.out.println();

        }
    }

}

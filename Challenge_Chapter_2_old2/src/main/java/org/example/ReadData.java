package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class ReadData extends Rumus{
    protected static double[] data;
    static ArrayList<String[]> dataArrayList = new ArrayList<>();
    static ArrayList list_nilai = new ArrayList();
    protected void readCsv() throws IOException {

        String regex = "[0-9]";
        try {
            String csvFile = "src/main/resources/CsvFile/data_sekolah.csv";
            String line = "";
            String csvDelimiter = ";";

            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] data = line.split(csvDelimiter);
                dataArrayList.add(data);
            }

        } catch (IOException e) {
            System.err.println("Cek Lagi Apakah Penamaan Atau Lokasi Benar Ada Di src/main/resources/CsvFile");
            System.err.println("Dan Apakah File Tersebut 'data_sekolah.csv'");
            throw new IOException("File Not Found");

        }

        // print the dataArrayList
        for (String[] row : dataArrayList) {
            for (String value : row) {
                System.out.print(value + "\t");
                //pake value
                Pattern pattern = Pattern.compile(regex);
                if (pattern.matcher(value).matches()) { // checker

                    list_nilai.add(value);

                }
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
//        data = new double[dataArrayList.size()];
//        for (int i = 0; i < dataArrayList.size(); i++) {
//            try {
//                data[i] = Double.parseDouble(Arrays.toString(dataArrayList.get(i)));
//            }
//            catch (NumberFormatException e){
//                System.out.println(e);
//                System.out.println("error");
//
//            }
//        }

//        String[] input = {"2.5", "1.2", "3.7", "4.1", "2.0"};
//        double[] data = new double[input.length];
//
//        for (int i = 0; i < input.length; i++) {
//            data[i] = Double.parseDouble(input[i]);
//        }
    }

}

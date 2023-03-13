package org.example;

import java.util.*;


//cara simple nya ya pake cara simple

//di save 1 1 datanya
public class Rumus{
    static int satu = 0, dua = 0, tiga = 0, empat = 0, lima = 0 , enam = 0 , tujuh = 0 ,
            delapan = 0 , sembilan = 0 , sepuluh = 0, dibawah_lima = 0;

    static double banyak_data = 0, jumlah = 0, mean = 0;
    protected void meanRumus(){

//        double sum = 0;
//        for (double value : rd.data) {
//            sum += value;
//        }
//        double mean = sum / rd.data.length;

        //pembatas yang atas blm di benerin
        jumlah = satu * 1 + dua * 2 + tiga * 3 + empat * 4
                + lima * 5 + enam * 6 + tujuh * 7 + delapan * 8 + sembilan * 9 + sepuluh*10;
        banyak_data = satu+dua+tiga+empat+lima+enam+tujuh+delapan+sembilan+sepuluh;
        mean = jumlah/banyak_data;
        setMean(mean);
        System.out.println("Nilai Rata-Rata " + getMean());
    }
    protected void freakuensi(){

        System.out.println("Frekuensi Nilai Dibawah Lima " + dibawah_lima);
        System.out.println("Frekuensi Nilai Lima " + lima);
        System.out.println("Frekuensi Nilai Enam " + enam);
        System.out.println("Frekuensi Nilai Tujuh " + tujuh);
        System.out.println("Frekuensi Nilai Delapan " + delapan);
        System.out.println("Frekuensi Nilai Sembilan " + sembilan);
        System.out.println("Frekuensi Nilai Sepuluh " + sepuluh);
    }

    protected void medianRumus(){

        bubbleSort();
        int n = ReadData.data.length;
        double median;
        if (n % 2 == 0) {
            median = (ReadData.data[n/2-1] + ReadData.data[n/2]) / 2.0;
        } else {
            median = ReadData.data[n/2];
        }

        System.out.println("Median: " + median);

    }

    protected void modusRumus(){
//        int n = ReadData.data.length;
//        double maxValue = 0, maxCount = 0;
//        for (int i = 0; i < n; ++i) {
//            int count = 0;
//            for (int j = 0; j < n; ++j) {
//                if (ReadData.data[j] == ReadData.data[i])
//                    ++count;
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                maxValue = ReadData.data[i];
//            }
//        }
//        System.out.println("Modus: " + maxValue);


    }

    public static double getMean() {
        return mean;
    }

    public static void setMean(double mean) {
        Rumus.mean = mean;
    }

    private void bubbleSort() {
        int n = ReadData.data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ReadData.data[j] > ReadData.data[j + 1]) {
                    double temp = ReadData.data[j];
                    ReadData.data[j] = ReadData.data[j + 1];
                    ReadData.data[j + 1] = temp;
                }
            }
        }
    }

}

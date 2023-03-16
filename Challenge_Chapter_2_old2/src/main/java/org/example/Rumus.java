package org.example;

import java.util.*;


//cara simple nya ya pake cara simple

//di save 1 1 datanya
public class Rumus{
    static int satu = 0, dua = 0, tiga = 0, empat = 0, lima = 0 , enam = 0 , tujuh = 0 ,
            delapan = 0 , sembilan = 0 , sepuluh = 0, dibawah_lima = 0;

    static double banyak_data = 0, jumlah = 0, mean, median, modus;

    public static double getModus() {
        return modus;
    }

    public static void setModus(double modus) {
        Rumus.modus = modus;
    }

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

        double md;

        if (ReadData.list_nilai.size() % 2 == 0) {
            md = Integer.parseInt(String.valueOf(ReadData.list_nilai.get((ReadData.list_nilai.size()-1) / 2)));
        } else {
            double angka1 = (Integer.parseInt(String.valueOf(ReadData.list_nilai.get((ReadData.list_nilai.size()-1) / 2))));
            double angka2 =(Integer.parseInt(String.valueOf(ReadData.list_nilai.get((ReadData.list_nilai.size()-1) / 2-1))));
            md=(angka1+angka2)/2;
        }
        setMedian(md);



    }

    protected void modusRumus(){
        int angkaMax=-1, angkaSisa=-1;
        for (int i =1;i< ReadData.list_nilai.size();i++){
            int number = Integer.parseInt(String.valueOf(ReadData.list_nilai.get(i)));
            //sum +=number;
            int count =0;
            for(int j=0;j< ReadData.list_nilai.size();j++){
                if(ReadData.list_nilai.get(i) == ReadData.list_nilai.get(j)){
                    count++;
                }
                if(count>angkaSisa){
                    angkaMax= Integer.parseInt(String.valueOf(ReadData.list_nilai.get(i)));
                    angkaSisa=count;
                }
            }
        }
        setModus(angkaMax);
        System.out.println("Modus: " + getModus());


    }

    public static double getMean() {
        return mean;
    }

    public static double getMedian() {
        return median;
    }

    public static void setMedian(double median) {
        Rumus.median = median;
    }

    public static void setMean(double mean) {
        Rumus.mean = mean;
    }

}

package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CreateFolderAndFile extends Rumus{


    protected void createModus(){
        // create the directory folder in a custom directory
        String customDirectory = "C:\\";
        String folderName = "Temp_Chapter2";
        File folder = new File(customDirectory + "/" + folderName);
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di: " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di" + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Data Modus.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Modus : " + getModus());
            writer.close();
            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    protected void createMeanMedian(){
        // create the directory folder in a custom directory
        String customDirectory = "C:\\";
        String folderName = "Temp_Chapter2";
        File folder = new File(customDirectory + "/" + folderName);
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di :" + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Data Mean & Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }


        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Mean : "+getMean() + "\n"+"Median :"+getMedian()); //jika seperti ini tidak perlu parsing
            //writer.write(Double.toString(median)); //perlu parsing ke Double.toString
            writer.close();

            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void createBoth() {
        // create the directory folder in a custom directory
        String customDirectory = "C:\\";
        String folderName = "Temp_Chapter2";
        File folder = new File(customDirectory + "/" + folderName);
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di : " + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Data Modus, Mean & Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Modus : "+getModus() +"\n");
            writer.write("Mean : "+getMean() + "\n"+"Median :"+getMedian());
            writer.close();
            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void createFrekuensi(){
        // create the directory folder in a custom directory
        String customDirectory = "C:\\";
        String folderName = "Temp_Chapter2";
        File folder = new File(customDirectory + "/" + folderName);
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("folder dibuat di : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder sudah ada di : " + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Frekuensi.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File dibuat di : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File sudah ada di : " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Nilai \t \t \t \t | Frekensi \n"); //masih error
            writer.write("Jumlah Nilai Dibawah Lima \t |\t" + dibawah_lima +"\n"); //masih error
            writer.write("5 \t \t \t \t \t |\t" + lima +"\n"); //masih error
            writer.write("6 \t \t \t \t \t |\t" + enam +"\n"); //masih error
            writer.write("7 \t \t \t \t \t |\t" + tujuh +"\n"); //masih error
            writer.write("8 \t \t \t \t \t |\t" + delapan +"\n"); //masih error
            writer.write("9 \t \t \t \t \t |\t" + sembilan +"\n"); //masih error
            writer.write("10 \t \t \t \t \t |\t" + sepuluh +"\n"); //masih error
            writer.close();
            System.out.println("Data ditulis kedalam file : " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

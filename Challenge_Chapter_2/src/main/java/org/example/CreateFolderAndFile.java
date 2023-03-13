package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFolderAndFile extends Rumus{

    Rumus rumus = new MeanMedianModusFrekuensi();

    protected void createModus(){
        // create the directory folder in a custom directory
        String customDirectory = "C:\\";
        String folderName = "Temp_Chapter2";
        File folder = new File(customDirectory + "/" + folderName);
        if (!folder.exists()) {
            folder.mkdirs();
            System.out.println("Directory folder created: " + folder.getAbsolutePath());
        } else {
            System.out.println("Directory folder already exists: " + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Data Modus.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Masih Kosong");
            writer.close();
            System.out.println("Data written to file: " + file.getAbsolutePath());
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
            System.out.println("Directory folder created: " + folder.getAbsolutePath());
        } else {
            System.out.println("Directory folder already exists: " + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Data Mean & Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(getMean() + "\n"+"Hallo test"); //jika seperti ini tidak perlu parsing
            writer.write(Double.toString(getMean())); //perlu parsing ke Double.toString
            writer.close();

            System.out.println("Data written to file: " + file.getAbsolutePath());
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
            System.out.println("Directory folder created: " + folder.getAbsolutePath());
        } else {
            System.out.println("Directory folder already exists: " + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Data Modus, Mean & Median.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Masih Kosong");
            writer.close();
            System.out.println("Data written to file: " + file.getAbsolutePath());
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
            System.out.println("Directory folder created: " + folder.getAbsolutePath());
        } else {
            System.out.println("Directory folder already exists: " + folder.getAbsolutePath());
        }

        // create a new file inside the directory folder
        String fileName = "Frekuensi.txt";
        File file = new File(folder.getAbsolutePath() + "/" + fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + file.getAbsolutePath());
        }

        // write some data to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("belum ada"); //masih error
            writer.close();
            System.out.println("Data written to file: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

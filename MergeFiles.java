package com.tech.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {
        String phoneFile = "C:\\Users\\Admin\\Desktop\\FileHandling\\phoneNumbers.txt";
        String nameFile = "C:\\Users\\Admin\\Desktop\\FileHandling\\names.txt";
        String outputFile = "C:\\Users\\Admin\\Desktop\\FileHandling\\mergedData.txt";
   //     String path="C:\\Users\\Admin\\Desktop\\FileHandling\\Hello.txt";
        
//        File file = new File(phoneFile);
//        File file1=new File(nameFile);
//        File file2=new File(path);
//        	System.out.println(file.isFile());
//        	System.out.println(file1.isFile());
//        	System.out.println(file.exists());
//        	System.out.println(file1.exists());
//        	System.out.println(file2.isFile());
//        	System.out.println(file2.exists());

        try (BufferedReader phoneReader = new BufferedReader(new FileReader(phoneFile));
             BufferedReader nameReader = new BufferedReader(new FileReader(nameFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String phoneLine;
            String nameLine;

            while ((phoneLine = phoneReader.readLine()) != null && (nameLine = nameReader.readLine()) != null) {
                writer.write(nameLine + ": " + phoneLine);
                writer.newLine();
            }

            // Handle the case where one file has more lines than the other
            while ((phoneLine = phoneReader.readLine()) != null) {
                writer.write("No Name: " + phoneLine);
                writer.newLine();
            }

            while ((nameLine = nameReader.readLine()) != null) {
                writer.write(nameLine + ": No Phone Number");
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.codewithazam;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        // read a file
        try{
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\File Reader and Writer\\rename.txt"));
            String str;
            while ((str = read.readLine()) != null) {
                System.out.println(str);
            }
            read.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        //Write file
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\File Reader and Writer\\output.txt"));
            write.write("Hey, Wassup buddy? \n");
            write.write("Can you check my repository pls?");
            write.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        //Copy a file
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\Desktop\\File Reader and Writer\\copy-output.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\File Reader and Writer\\output.txt"));
            String s;
            while((s = reader.readLine()) != null){
                writer.write(s + "\n");
            }
            writer.close();
            reader.close();
        }catch (IOException exception){
            exception.getMessage();
        }

    }
}

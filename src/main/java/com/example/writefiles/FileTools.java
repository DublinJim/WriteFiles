package com.example.writefiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTools {

    static void writeFiles() {
        String path = "C:\\Users\\james.keogh\\IdeaProjects\\WriteFiles\\src\\main\\resources\\";
        String filename = "fromApp";
        String ext = ".txt";
        File fileOut = new File(path + filename + ext);
        try {
            FileWriter fileWriter = new FileWriter(fileOut);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Text to send into the file");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

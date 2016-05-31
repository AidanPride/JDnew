package lesson9;

import java.io.*;
import java.nio.file.Files;


public class FileCopy {
    public static void main(String[] args) {
File file = new File("F:/JavaWorkSpace/JD/frame2.txt");
        try {
            copyFile(file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void copyFile(File file) throws IOException{
        File dest = new File(file.getParent() + "/Copy" + file.getName());
        Files.copy(file.toPath() , dest.toPath());
    }

}

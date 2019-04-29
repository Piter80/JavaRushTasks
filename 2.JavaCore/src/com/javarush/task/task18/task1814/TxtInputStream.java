package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    FileInputStream fis;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException,  FileNotFoundException, IOException{
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
        this.fis = new FileInputStream(fileName);
    }

    public static void main(String[] args) {
    }
}


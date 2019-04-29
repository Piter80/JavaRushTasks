package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        FileInputStream fis = null;
        try {
            do {
                fis = new FileInputStream(new BufferedReader((new InputStreamReader(System.in))).readLine());
            } while (fis.available() >= 1000);
            fis.close();
        }
        finally {

            throw new DownloadException();
        }
    }

    public static class DownloadException extends Exception {

    }
}

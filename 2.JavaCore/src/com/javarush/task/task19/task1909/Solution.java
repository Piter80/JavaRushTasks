package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1 = br.readLine();
        String file2 = br.readLine();
        br.close();

        BufferedReader fr = new BufferedReader(new FileReader(file1)) ;
        BufferedWriter fw = new BufferedWriter(new FileWriter(file2)) ;

        String str = "";
        while (fr.ready())
            str += (char) fr.read();
        str = str.replaceAll("\\.", "!");
        fw.write(str);

        fr.close();
        fw.close();



    }
}

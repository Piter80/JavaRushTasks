package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        this.amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        this.amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        this.amigoOutputStream.write(b, off, len);
    }

    /*1. Вывести в консоль фразу "Вы действительно хотите закрыть поток? Д/Н".
            2. Считайте строку.
            3. Если считанная строка равна "Д", то закрыть поток.
            4. Если считанная строка не равна "Д", то не закрывать поток.*/

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
      if (new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase().equals("Д".toLowerCase()))
          amigoOutputStream.close();
    }
}


package com.javarush.task.task14.task1414;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bro = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true){
            String tmp = bro.readLine();
            if (tmp.equals("cartoon") || tmp.equals("thriller") || tmp.equals("soapOpera")) list.add(tmp);
            else {
                list.add(tmp);
                break;
            }
        }

        Movie movie = null;
        try {
            for (String s : list) {
                movie = MovieFactory.getMovie(s);
                System.out.println(movie.getClass().getSimpleName());
            }
        } catch (Exception e) {

        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
}

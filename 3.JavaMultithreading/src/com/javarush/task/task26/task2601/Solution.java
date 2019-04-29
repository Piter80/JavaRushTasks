package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        Integer[] arr = {13, 8, 15, 5, 17};
        Integer[] array = sort(arr);
        //System.out.println(Arrays.toString(array));

    }

    public static Integer[] sort(Integer[] array) {
        int median;
        Arrays.sort(array);
        if(array.length%2 == 0){
            median = (array[(array.length-1)/2]+array[((array.length-1)/2)+1])/2;
        }else {
            median = array[array.length/2];
        }
        //System.out.println(median);
        Arrays.sort(array, Comparator.comparingInt( (Integer o) -> Math.abs(median - o)).thenComparingInt(o -> o));
        return array;

    }
}

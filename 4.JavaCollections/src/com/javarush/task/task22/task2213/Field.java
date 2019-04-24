package com.javarush.task.task22.task2213;

public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void removeFullLines() {

    }

    public Integer getValue(int x, int y) {
        return matrix[x][y];
    }

    public void setValue(int x, int y, int value) {
        this.matrix[x][y] = value;
    }
}

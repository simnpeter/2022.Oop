package oop.labor06.lab6_2;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data){
        this.data = data;
        this.columns = data.length;
        this.rows = data[0].length;
    }

    public Matrix(Matrix matrix){
        this.rows = matrix.getRows();
        this.columns = matrix.getColumns();
        this.data = matrix.data;
    }

    public void fillRandom(double min, double max){
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.data[i][j] = min+rand.nextDouble(max-min);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2){
        if(matrix1.getColumns()!= matrix2.getColumns() || matrix1.getRows()!= matrix2.getRows()){
            System.out.println("Cant add the two matrix");
            return null;
        }
        Matrix newMatrix = new Matrix(matrix1.getRows(), matrix1.getColumns());
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.columns; j++) {
                newMatrix.data[i][j]=matrix1.data[i][j]+matrix2.data[i][j];
            }
        }
        return newMatrix;
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2){
        if (matrix1.getColumns()!=matrix2.getRows()){
            System.out.println("Cant multiply the two matrix");
            return null;
        }
        Matrix newMatrix = new Matrix(matrix1.getRows(), matrix2.getColumns());
        for (int i = 0; i < matrix1.getRows(); i++) {
            for (int j = 0; j < matrix2.getColumns(); j++) {
                for (int k = 0; k < matrix1.getColumns(); k++) {
                    newMatrix.data[i][j] += matrix1.data[i][k]*matrix2.data[k][j];
                }
            }
        }
        return newMatrix;
    }

    public static Matrix transpose(Matrix matrix){
        Matrix newMatrix = new Matrix(matrix.getColumns(), matrix.getRows());
        for (int i = 0; i < newMatrix.getRows(); i++) {
            for (int j = 0; j < newMatrix.getColumns(); j++) {
                newMatrix.data[i][j]=matrix.data[j][i];            }
        }
        return newMatrix;
    }

}

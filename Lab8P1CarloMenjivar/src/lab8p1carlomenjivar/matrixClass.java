/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1carlomenjivar;
import java.util.Random;
/**
 *
 * @author marcellomenjivarmontesdeoca
 */
public class matrixClass {
    
    private int [][] matrix;
    private final Random random = new Random();

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    //hacer un constructor que reciba una matrix
    public void matrixClass(int [][] matrix){
        this.matrix = matrix;
    }
    
    //llena un matrix
    public int [][] llenarMatriz(int x, int y){
        matrix =  new int [x][y];
        int row = matrix.length;
        int column = matrix[0].length;
        //int cont = 0;
        
        for(int i =0; i < column; i++){
            for(int j =0; j < row ; j ++){
                //matrix[j][i] =  cont;
                //cont++;
                matrix[j][i] =  random.nextInt(9);                
            }
        }
        return matrix;
    }
    
    //imprime una matrix
    public void imprimirMatrix(int [][] temp){
        
        int row = temp.length;
        int column = temp[0].length;
        
        for (int i = 0; i < column ; i++){
            for (int j = 0; j < row; j++){
                if(temp[j][i]<10){
                    System.out.print("  " + temp[j][i] + " ");
                }else{
                    System.out.print(" " + temp[j][i] + " ");
                }
                
            }
            System.out.println();
        }
    }
    
    //rotate funtion
    public int [][] rotateMatrix(int [][] matrix){
        int col = matrix.length;
        int row = matrix[0].length;
        int row2 = col;
        int col2 = row;
        
        int [][] temp = new int [col2][row2];
        
        System.out.println("Filas 1: " + row);
        System.out.println("Columnas 1: " + col);
        System.out.println("Filas 2: " + row2);        
        System.out.println("Columnas 2: " + col2);               
        
        int posCol = col2-1;
        int posRow = 0;
        
        
        for(int i =0; i < col; i++){
            posCol =col2-1;
            for(int j =0; j < row ; j ++){
                temp[posCol][posRow] = matrix[i][j];
                posCol--;
            }
            posRow ++;            
        }
        
        return temp;
    }
    
    //chones funcion
    public int [][] chones(int size){
        int [][] chones = new int[size][size];        
        
        return chones;
    }
    
    //flip function
    
    public int [][] flippedH (int [][] matrix){
        int col = matrix.length;
        int row = matrix[0].length;
        int [][] temp =  new int [col][row];
        
        System.out.println(row);
        System.out.println(col);        
        return temp;
    }
}

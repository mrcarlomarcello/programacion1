/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1carlomenjivar;

/**
 *
 * @author marcellomenjivarmontesdeoca
 */
public class executeAlgo {
    
    private final miscellaneous misc = new miscellaneous();
    private final matrixClass matrix = new matrixClass();
    
    public boolean lleno = false;
    
    // Lógica del ejercicio 1
    public void ejercicio1(){
        System.out.println("Ejercicio 1");
        if(!lleno){   
           matrix.matrixClass(matrix.llenarMatriz(5, 10));
           lleno =true;
        }
        matrix.imprimirMatrix(matrix.getMatrix());         
        int [][] temp = matrix.rotateMatrix(matrix.getMatrix());
        matrix.imprimirMatrix(temp);
    }
    
    // Lógica del ejercicio 2
    public void ejercicio2(){
        System.out.println("Ejercicio 2");
        System.out.println("Ingrese un Numero");
        int size = misc.leerEntero();
        
        matrix.imprimirMatrix(matrix.chones(size));
    }
    
    //Lógica del ejercicio 3
    public void ejercicio3(){
        System.out.println("Ejercicio 3");
        
        if(!lleno){   
            matrix.matrixClass(matrix.llenarMatriz(5, 10));
            lleno =true;
        }
        matrix.imprimirMatrix(matrix.flippedH(matrix.getMatrix()));
        
    }
}

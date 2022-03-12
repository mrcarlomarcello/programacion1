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
public class executeAlgo {
    
    private final miscellaneous misc = new miscellaneous();
    private final matrixClass matrix = new matrixClass();
    private final Random random = new Random();
    public boolean lleno = false;
    
    // Lógica del ejercicio 1
    public void ejercicio1(){
        System.out.println("Ejercicio 1");
        if(!lleno){   
           matrix.matrixClass(matrix.llenarMatriz(random.nextInt(1,10),random.nextInt(1,10)));
           lleno =true;
        }
        matrix.imprimirMatrix(matrix.getMatrix());         
        int [][] temp = matrix.rotateMatrix(matrix.getMatrix());
        matrix.imprimirMatrix(temp);
        
        String text = misc.creardeInt(temp);
        misc.dialog(text);
    }
    
    // Lógica del ejercicio 2
    public void ejercicio2(){
        System.out.println("Ejercicio 2");
        
        int size = 0;
        
        while(size%2 ==0 || size < 7){
            System.out.println("Ingrese un Numero mayor a 7 e impar");
            size = misc.leerEntero();
        }
        matrix.chones(size);
        String [][] temp = matrix.getChones();
        matrix.imprimirChones(temp);
        
        String printChones = misc.crearString(temp);
        misc.dialog(printChones);
    }
    
    //Lógica del ejercicio 3
    public void ejercicio3(){
        System.out.println("Ejercicio 3");
        
        if(!lleno){   
            matrix.matrixClass(matrix.llenarMatriz(random.nextInt(1,10),random.nextInt(1,10)));
            lleno =true;
        }
        
        System.out.println("Matrix Normal");
        matrix.imprimirMatrix(matrix.getMatrix());
        
        System.out.println("Matrix Flippeada Vertical");
        matrix.imprimirMatrix(matrix.flippedV(matrix.getMatrix()));
                
        System.out.println("Matrix Normal");
        matrix.imprimirMatrix(matrix.getMatrix());
        
        System.out.println("Matrix Flippeada Horizontal");
        matrix.imprimirMatrix(matrix.flippedH(matrix.getMatrix()));
        
        String text = misc.creardeInt(matrix.flippedH(matrix.getMatrix()));
        
        misc.dialog(text);
        
    }
}

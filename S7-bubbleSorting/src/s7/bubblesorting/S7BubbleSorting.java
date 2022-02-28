/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s7.bubblesorting;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author marcellomenjivarmontesdeoca
 */
public class S7BubbleSorting {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = 100;
        
        int [] arregloDesorden = LlenarEnteros(size, 99);
        int [] arregloOrdenado = new int[arregloDesorden.length];
        imprimirArray(arregloDesorden);
        
        for(int i=0; i<arregloDesorden.length; i++){
            arregloOrdenado = bubbleSort(arregloDesorden);
        }
        imprimirArray(arregloDesorden);
        imprimirArray(arregloOrdenado);
    }
    //Llena un arreglo de int size con numeros de 0-999
    public static int [] LlenarEnteros(int size, int max){
        
        int [] temp = new int[size];        
        for(int i = 0; i < temp.length; i++){
            temp[i] = random.nextInt(max);
        }        
        return temp;
    }
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public static void imprimirArray(int [] temp){
        
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i]>99){
                System.out.print("["+temp[i]+"]");
            }else if(temp[i]>9){
                System.out.print("[ "+temp[i]+"]");
            }else{
                System.out.print("[ "+temp[i]+" ]");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    
    //sort tipo Bubble, pero tiene que correrse N cantidad de veces segun el length del arreglo... VER EL MAIN*
    public static int [] bubbleSort(int [] tempArray){
        
        for(int i = 0; i < tempArray.length; i++){
            int pos = i+1;
            int step = tempArray[pos];
            if(tempArray[i]>=step){
                tempArray[pos]=tempArray[i];
                tempArray[i]=step;
                //imprimirArray(tempArray);
            }
            if(pos==(tempArray.length-1)){i++;}
            
        }
        return tempArray;
    }
    
}

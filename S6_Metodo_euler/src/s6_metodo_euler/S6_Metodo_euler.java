/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s6_metodo_euler;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author megam
 */
public class S6_Metodo_euler {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        
        System.out.print("X = ");
        int x = in.nextInt();
                           
        System.out.print("M = ");
        int m = in.nextInt();
        
        System.out.println(Euler(m, x));
        
        int [] prueba = LlenarEnteros(m);
        
        imprimirArray(prueba);
    }
    //calcula el Euler
    public static double Euler(int m, int x){
        double Sumatoria = 0.0;
        double expo = 0.0;
        double facto = 0.0;
        for (int n = 0; n <= m; n++) {
            expo = Exponential(x,n);           
            facto = Factorial(n);            
            Sumatoria += (expo/facto);
        }      
        
        return Sumatoria;
    }
    //calcula un double de exponencial
    public static double Exponential(int base, int power){
        
        double exponential=1;
         //haremos el for para exponential           
        for(int k = 1; k <=power; k++){ exponential = exponential*base;}
        //
        return exponential;
    }
    
    //retorna un Factorial
    public static double Factorial(int n){
        
        double factorial = n;
        // Haremos el Factorial con un for
         if(n==0||n==1){
              factorial =1;  
            }
         else{
            for(int i = n-1; i>=1; i--){factorial*=i;}                
         }
        /// 
        return factorial;
        
    }    
    
    //Llena un arreglo de int size con numeros de 0-999
    public static int [] LlenarEnteros(int size){
        int [] temp = new int[size];
        
        for(int i = 0; i < temp.length; i++){
            temp[i] = random.nextInt(999);
        }
        
        return temp;
    }
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public static void imprimirArray(int [] temp){
        
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i]>99){
                System.out.println("["+temp[i]+"]");
            }else if(temp[i]>9){
                System.out.println("[ "+temp[i]+"]");
            }else{
                System.out.println("[ "+temp[i]+" ]");
            }
            
        }
    }
    
    //no lo he terminado
    public static int [] arregloPares(int[] arregloEntrada){
        int tamano = 0;
        
        int [] arregloPares = new int[arregloEntrada.length];
        
        return arregloPares;
    }
}

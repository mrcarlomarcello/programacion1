/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s6_metodo_euler;
import java.util.Scanner;
/**
 *
 * @author megam
 */
public class S6_Metodo_euler {
Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.print("X = ");

        int x = in.nextInt
                
                
        System.out.print("M = ");
        int m = in.nextInt();
        
        Sumatoria(m, x);
        
  
    }
    
    public static int Sumatoria(int m, int x){
        double Sumatoria = 0.0;
        
        for (int n = 0; n <= m; n++) {
            int expo = Exponential(n,x);
            
        }
     
        
    }
    
    public static int Exponential(int base, int power){
        
                      
        for(int k = 1; k <=i; k++){ power = power*base;}
                        
        return potencia;
    }
    
    public static int Factorial(){
        
        
        // Haremos el Factorial con un While
                        double factorial2 = base;
                        int g = base - 1;
                            //While SENCILLO para hacer un Factorial
                        while (g>0){
                            factorial2 *= g;
                            g--;
                        }
        ///                
        return factorial;
    }
    
}

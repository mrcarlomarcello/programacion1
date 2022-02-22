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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("X = ");

        int x = in.nextInt();
                
                
        System.out.print("M = ");
        int m = in.nextInt();
        
        System.out.println(Sumatoria(m, x));
        
  
    }
    
    public static double Sumatoria(int m, int x){
        double Sumatoria = 0.0;
        
        for (int n = 0; n <= m; n++) {
            double expo = Exponential(x,n);           
            double facto = Factorial(n);            
            Sumatoria += (expo/facto);
        }
             
        
        return Sumatoria;
    }
    
    public static double Exponential(int base, int power){
        
        double exponential=1;
         //haremos el for para exponential           
        for(int k = 1; k <=power; k++){ exponential = exponential*base;}
        //
        return exponential;
    }
    
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
    
}

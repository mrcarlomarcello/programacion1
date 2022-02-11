/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menumath;
import java.util.Scanner;

/**
 *
 * @author megam
 */
public class MenuMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        //Empezamos por el menu
        System.out.println("|----------------------------------|");
        System.out.println("|     Elige una opcion de 1-3      |");
        System.out.println("|--------presiona 4 para salir-----|");
        System.out.println();
        
        //declaro Variables
        int Menu;
        int Numero;
        
        while(!in.hasNextInt()){
            System.out.println("Introduce un Entero.");
        }        
        Menu = in.nextInt();
        
        switch(Menu){
            case 1:
                
                System.out.println("Option 1 factorial");               
                System.out.println("Ingrese un Numero");
                
                //Ingresamos un Entero
                while(!in.hasNextInt()){
                    System.out.println("Introduce un Entero.");
                }        
                Numero = in.nextInt();
                
                // Haremos el Factorial con un While
                int factorial = Numero;
                int i = Numero - 1;
                
                //While SENCILLO para hacer un Factorial
                while (i>0){
                    factorial *= i;
                    i--;
                }
                System.out.println("Este es el factorial: ");
                System.out.println(factorial);
                
                break;
            
            case 2:
                System.out.println("Option 2");
                break;
            case 3:
                System.out.println("Option 3");
                break;
        }
    }
    
}

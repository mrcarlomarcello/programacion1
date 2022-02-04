/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulos;
import java.util.Scanner;
/**
 *
 * @author megam
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Elige una opcion de 1-5");
        Scanner in = new Scanner(System.in);        
        
        int entrada = in.nextInt();        
        int menu =  entrada;
        System.out.println(entrada);    
        
        int fila;
        int columna;
        
        while(menu != 7){
            System.out.println("Bienvenido, juguemos");
            
            switch(menu){
               
                case 1:
                    System.out.println("Ok, dibujemos una figura rectangular");                    
                    //pedimos ingresar las filas                    
                    System.out.println("Elije la Cantidad de Filas");
                    //ocupa failswitch:
                    fila =  in.nextInt();
                    
                    //pedimos ingresar las columnas
                    System.out.println("Ok, ahora dime cuantas Columnas?");
                    //ocupa failswitch:
                    columna = in.nextInt();
                                                          
                    for(int i=1; i <= fila; i++){
                        for(int j=1; j <= columna; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                                        
                    //break del caso 1
                    break;
                    
                case 2:
                    
                    // Pedimos ingresar el numero de filas
                    System.out.println("Ok, dibujemos un trianguilito:");
                    System.out.println("Cuantas filas quieres?");
                    
                    //ocupa failswitch
                    fila = in.nextInt();
                    
                    for(int i = 1; i<=fila; i++){
                        for(int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    
                    break;
                    
                case 3:
                    
                    //Pedimos el numero de filas
                    System.out.println("Ok Dibujemos el triangulito al revés pues...");
                    System.out.println("Cuantas filas quieres?:");
                    
                    //ocupa failswitch:
                    fila = in.nextInt();
                    
                    for(int i=1; i<= fila; i++){
                        for(int j=fila; j>=i; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }                    
                    
                    break;
                    
                case 4:
                    
                    //Pedimos nuevamente el numero de filas
                    System.out.println("Ok, ahora dibujemos el triangulito del otro lado");
                    System.out.println("Cuantas filas quieres?");
                    
                    //ocupa failswitch:
                    fila = in.nextInt();
                                        
                    for(int i=1; i<= fila; i++){
                        
                        for(int j=fila; j>i ; j--){
                            System.out.print(" ");
                        }
                        for(int j=1; i>=j ; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }                    
                    
                    break;
                    
                case 5:
                    //Pedimos nuevamente el numero de filas
                    System.out.println("Ok, ahora para el gran final, el dibujo al reves ");
                    System.out.println("Cuantas filas quieres?");
                    
                    //ocupa failswitch:
                    fila = in.nextInt();
                    
                    for(int i = 1 ; i <= fila; i++){
                        
                        for(int j=1; i>j ; j++){
                            System.out.print(" ");
                        }                        
                        for(int j =fila; j>=i; j--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    
                    break;
                    
                    case 6:
                    
                        //Pedimos nuevamente el numero de filas
                        System.out.println("Ok, ahora dibujemos el triangulito del otro lado");
                        System.out.println("Cuantas filas quieres?");
                    
                        //ocupa failswitch:
                        fila = in.nextInt();
                                        
                        for(int i=1; i<= fila; i++){
                        
                            for(int j=fila; j>i ; j--){
                                System.out.print(" ");
                            }
                            
                            if( i == 1){
                                System.out.print("  *");
                            }
                            else{
                                
                                for(int k=i+2; k>=2 ; k--){
                                    System.out.print(" *");
                                }                                
                            }
                            
                            System.out.println();
                        }                                                                   
                        break;
            }
            
            System.out.println("Elige una opcion de 1-5, 6 para salir");
            //ocupa failswitch:
            menu = in.nextInt();
        }
        
        
    }
    
}

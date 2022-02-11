/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_carlomenjivar;
import java.util.Scanner;

/**
 *
 * @author megam
 */
public class Lab4p1_CarloMenjivar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hello World!");
        // Introduccion        
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|---Laboratorio 4 --------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");            
            System.out.println("|------------- Ingresa una opcion de 1-3 ---------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|----Carlo Marcello Menjivar Montes de Oca -------------|");
            System.out.println("|-----------------------------------------20551123------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|--------------------------- Exit with 4 !--------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
                    
            //agregando efectos de drama a mi programa
            try{
                    Thread.sleep(1000);
                }catch(InterruptedException ex){
                    System.out.println("Ya se que no deberia de estar poniendo esto...");
                }
            System.out.println("|-------( ajustad sus cintures de seguridad ) ----------|");
            System.out.println("|-------------------------------------------------------|");
            
            //agregando efectos de drama a mi programa
            try{
                Thread.sleep(1500);
                } catch(InterruptedException ex){
                    System.out.println("Ya se que no deberia de estar poniendo esto...");
                }        
            System.out.println("|-------El café que hice estaba bueno-------------------|");                    
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------Ingresa una opcion-----|: ");
            
            //failswitch de enteros
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opción válida");
                in.nextLine();
            }
            int Menu =in.nextInt();
            
            System.out.println("|-------------------Ingresando -------------------------|: ");
            
            //variables para el ejercicio 1
            String cadena;
            String replace;
            
        while(Menu!=4){
            
            switch(Menu){
                case 1:
                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------- Ejercicio 1 fString ---------------------------|");                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-- Escribe una cadena que incluya los caracteres %d ---|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------|: ");                                        
                    in.nextLine();                    
                    cadena = in.nextLine();
                    
                    System.out.println(cadena.length());
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            
            System.out.print("|-------------------Ingresa una opcion-----|: ");
            
            //failswitch de enteros
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opción válida");
                in.nextLine();
            }
            Menu =in.nextInt();
        }
    }
    
}

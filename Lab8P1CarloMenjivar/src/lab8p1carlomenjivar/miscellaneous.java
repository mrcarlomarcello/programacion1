/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1carlomenjivar;
import java.util.Scanner;

/**
 *
 * @author marcellomenjivarmontesdeoca
 */
public class miscellaneous {
    
    public Scanner in = new Scanner(System.in);
    //Imprime mi menu
    public void printTheMenu(){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|----- Laboratorio 8 ------ programacion 1 -------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");            
            System.out.println("|------------- Ingresa una opcion de 1-3 ---------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-----------------------------4 para salir--------------|");
            System.out.println("|-------------------------------------------------------|");
            //agregando efectos de drama a mi programa
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException ex){
                        System.out.println("Igual no deberia de estar poniendo esto... so...");
                    } 
            System.out.println("|----Carlo Marcello Menjivar Montes de Oca -------------|");
            System.out.println("|-----------------------------------------20551123------|");
            System.out.println("|-------------------------------------------------------|");
            //agregando efectos de drama a mi programa
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException ex){
                        System.out.println("Igual no deberia de estar poniendo esto... so...");
                    } 
            System.out.println("|--------------------------- Exit with 4 !--------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|--- Puntos Extra por hacer el flip edition ------------|");
            System.out.println("|--- (quiero mis puntos hey)  --------------------------|");
            System.out.print(  "|-----------------------------|: ");
    }
    
    //Quiero un metodo para leer Enteros...(retorna un entero)
    public int leerEntero(){
        System.out.println("Ingresa un numero: ");
        while(!this.in.hasNextInt()){
            System.out.println("Ingresa un numero real...");
            this.in.nextLine();
        }
        int buscarnumero = in.nextInt();
        in.nextLine();
        return buscarnumero;
    }
    
}

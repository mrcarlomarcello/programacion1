/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2s8carlomenjivar;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author shello101
 */
public class miscellaneous {
    
    private final Scanner in = new Scanner(System.in);
    private final Random random =  new Random();
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public void imprimirArray(int [] temp){
        
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
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public void imprimirChar(int [] temp){
        
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i]>99){
                System.out.print("["+(char)temp[i]+"]");
            }else if(temp[i]>9){
                System.out.print("[ "+(char)temp[i]+"]");
            }else{
                System.out.print("[ "+(char)temp[i]+" ]");
            }
            System.out.print(" ");
        }
        System.out.println();
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
    
    //Llena un arreglo de int size con numeros de 0-999
    public int [] LlenarEnteros(int size, int max){
        
        int [] temp = new int[size];        
        for(int i = 0; i < temp.length; i++){
            temp[i] = this.random.nextInt(max);
        }        
        return temp;
    }
    
}

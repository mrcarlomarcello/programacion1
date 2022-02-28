/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_carlomenjivar20551123;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author shello101
 */
public class Lab6P1_CarloMenjivar20551123 {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu = 0;
        
        while(menu!=4){
            printTheMenu();
            
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opcion de 1-3");
                System.out.println("O puedes salir con 4");
                in.nextLine();
            }
            menu = in.nextInt();
            
            switch(menu){
                
                case 1:
                    System.out.println("Ejercicio 1");
                    int n = 1 + random.nextInt(99);
                    int [] arregloEjercicio1 = LlenarEnteros(n,999);
                    
                    imprimirArray(arregloEjercicio1);
                    n = random.nextInt(1, 9);
                    
                    int [] arregloArreglado = arrayModificado(arregloEjercicio1,n);
                    System.out.println("Multiplos de: "+n);
                    imprimirArray(arregloArreglado);
                    break;
                    
                case 2:
                    System.out.println("Ejercicio 2 - Turing");
                    System.out.println("Ingresa un numero real: ");
                    
                    while(!in.hasNextInt()){
                        System.out.println("Ingresa un numero");
                        in.nextLine();
                    }                    
                    int turingNumber = in.nextInt();
                    
                    //Validacion extra
                    if(turingNumber < 1){
                        System.out.println("Cambiamos tu Numero a 9");
                        turingNumber = 9;
                    }
                                        
                    int [] cadena = LlenarEnteros(turingNumber, 9);
                    
                    System.out.println("Se genero tu plantilla de Token: ");
                    imprimirArray(cadena);
                    
                    System.out.println("Ingresa tu frase secreta: L R X son los comandos.");
                    
                    in.nextLine();
                    String passphrase = in.nextLine();
                    
                    System.out.println("Tu frase secreta es:");
                    System.out.println(passphrase);
                    
                    int [] pin = turingPin(cadena, passphrase);
                    
                    System.out.println("Tu Pin de Seguridad es: ");
                    imprimirArray(pin);
                    
                    break;
                
                case 3:
                    
                    System.out.println("Ejercicio 3");
                    int N = 1 + random.nextInt(99);
                    System.out.println("Vamos a imprimir un arreglo de Size: "+N);
                    int [] arregloEjercicio2 = LlenarEnteros(N,100);
                    imprimirArray(arregloEjercicio2);
                    System.out.println("El promedio de este arreglo es: "+ Promedio(arregloEjercicio2));
                    break;
                case 4:
                    System.out.println("Esto ha sido todo amigos! :) ");
                    break;
                    
            }
             //agregando efectos de drama a mi programa
                    try{
                        Thread.sleep(2500);
                    } catch(InterruptedException ex){
                        System.out.println("Igual no deberia de estar poniendo esto... so...");
                    } 
        }
    }
    
    //Metodo para inprimir Menu modificado para Lab 6
    public static void printTheMenu(){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-----Lab#6 ------ programacion 1 ----------------------|");
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
            System.out.println("|--- 'La adrenalina esta pendiente' --------------------|");
            System.out.print(  "|-------------------------------------|:  ");
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
    
    //ALGORITMO EJERCICIO#1
    public static int [] arrayModificado(int [] arregloOriginal, int n){
        int [] temp = new int[arregloOriginal.length];
        int multiplos = 0;
        for(int i=0; i< arregloOriginal.length; i++){
            if(arregloOriginal[i]%n!=0 && multiplos ==0){
                temp[i]=arregloOriginal[i];
            }else if(arregloOriginal[i]%n==0){
                multiplos++;
                temp[i]=multiplos;
            }else{
                temp[i]=multiplos;
            }
        }
        
        return temp;
    }
    
    //ALGORITMOS PARA EL EJERCICIO #2
    public static  int [] turingPin(int [] temp, String passphrase){
        int apuntador =0;
        int contador = 0;
        //CONTAMOS LAS X
        for(int i=0;i<passphrase.length();i++){
            if(passphrase.charAt(i)=='X'){
                //System.out.print('X');
                contador++;
            }
        }
        
        //Creamos un Array del tamano que contamos de X
        int [] pin = new int[contador];
        //reinicio el contador
        contador =0;
        
        for(int i=0;i<passphrase.length();i++){
            if(passphrase.charAt(i)=='X'){
                //System.out.println(apuntador);
                pin[contador]=temp[apuntador];
                contador+=1;
            }
            if(passphrase.charAt(i)=='R'){
                apuntador+=1;
                //System.out.println(apuntador);
                if(apuntador==temp.length){
                    apuntador=0;
                }
            }
            if(passphrase.charAt(i)=='L'){
                apuntador-=1;
                //System.out.println(apuntador);
                if(apuntador<0){
                    apuntador=temp.length-1;
                }
            }
        }       
        return pin;
    }
    
    //ALGORITMO EJERCICIO#3
    public static double Promedio(int [] temp){
        double promedio = 0.0;
        
        for(int i = 0; i<temp.length; i++){
            promedio +=temp[i];
        }
        promedio = promedio/temp.length;
        return promedio;
    }
}

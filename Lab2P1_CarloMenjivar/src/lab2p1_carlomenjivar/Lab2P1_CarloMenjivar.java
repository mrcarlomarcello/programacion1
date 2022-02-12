/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_carlomenjivar;
import java.util.Scanner;

/**
 *
 * @author megam
 */
public class Lab2P1_CarloMenjivar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Switch de Menu
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        
        String Numero;
        String Multiplicador;
        
        boolean salir = false;
        
        while(salir == false){
            System.out.println("Ingresa un numero Entero de 1-4");
            while(!in.hasNextInt()){
                System.out.println("Ingresa un numero Entero de 1-4");
                in.nextInt();
            }
            int numeroMenu = in.nextInt();
            in.nextLine();
            
            switch(numeroMenu){
                
                case 1:
                    // Vamos a Imprimir el resultado de N*M
                    System.out.println("Vamos a realizar el siguiente ejercicio:");
                    System.out.println("Ejercicio 1");
                    System.out.println("Necesito ingreses el primer numero...");
                    Numero = in.nextLine();
                    System.out.println("Necesito ingreses el Multiplicador numero...");
                    Multiplicador = in.nextLine();
                    System.out.println("Imprimire la multiplicacion de "+Numero+" por "+ Multiplicador);

                    int i = 0;
                    int Multiplicacion = 0;
                    while (i<Integer.parseInt(Multiplicador)){
                        Multiplicacion = Multiplicacion + Integer.parseInt(Numero);
                        i++;
                    }
                    System.out.println("La respuesta es: " + Multiplicacion);
                    break;
                case 2:

                    System.out.println("Vamos a realizar el siguiente ejercicio:");
                    System.out.println("Ejercicio 2");
                    System.out.println("Necesito ingreses la cantidad de Ciclos...");
                    Numero = in.nextLine();

                    int j = 0;
                    int pos1 = 0;
                    int pos2 = 1;
                    int pos3 = 1;
                    int posN = 0;

                    System.out.print( pos1+", ");
                    System.out.print( pos2+", ");
                    System.out.print( pos3+", ");
                    
                    while( j < Integer.parseInt(Numero)){
                        posN = pos3 + pos2 + pos1;
                        pos1 = pos2;
                        pos2 = pos3;
                        pos3 = posN;
                        System.out.print(pos3+", ");
                        j++;
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    
                    System.out.println("Vamos a realizar el siguiente ejercicio:");
                    System.out.println("Ejercicio 3");
                    System.out.println("Necesito ingreses la cantidad de N...");
                    
                    //failswitch para evitar no entren enteros...
                    while(!in.hasNextInt()){
                        System.out.println("Ingrese un numero Entero para la cantidad de N: ");
                        in.nextLine();
                    }
                    int entero = in.nextInt();
                    
                    //variables que ocupo
                    int k = 0;
                    double division;
                    double raiz=0.0;
                    
                    //Algoritmo matematico
                    while (k <= entero){
                        division = (1.0/((4.0*k+2)*(4.0*k+2)));
                        if(k==0){
                            raiz = (1-division)/1;
                        }else{
                            raiz = raiz*((1-division)/1);
                        }                        
                        k++;
                    }
                    System.out.println(1/raiz);
                    
                    break;
                case 4:
                    System.out.println("Por que te quieres salir de mi juego? :'( ");
                    salir = true;
                    break;
            }                
        }    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_carlomenjivar;
import java.util.Scanner;
/**
 *
 * @author shello101
 */
public class Lab3P1_CarloMenjivar {

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
        
        //ocupaba*** failswitch:        
        while(!in.hasNextInt()){
            System.out.println("Ingresa una opcion de 1-4");
            in.nextLine();
        }
        int entrada = in.nextInt();
        
        int menu =  entrada;
        int fila;
        int columna;
        
        while(menu!=4){
            
            System.out.println("|----------------------------------|");
            System.out.println("| ok haremos el lab3p1 de Paulina  |");
            System.out.println("|----------------------------------|");
            
            switch(menu){
                
                case 1:
                    System.out.println("|----------------------------------|");
                    System.out.println("|     Elige una opcion de 1-3      |");
                    System.out.println("|--------presiona 4 para salir-----|");
                    System.out.println();        
        
                    // ailswitch:        
                    while(!in.hasNextInt()){
                        System.out.println("Ingresa una opcion de 1-4");
                        in.nextLine();
                    }
                    entrada = in.nextInt();
                    
                    //variables:
                    double respuesta=0;
                    double n = -1;
                    int cont;
                    double A=-1;
                    double B=1;
                    double C=1; 
                    double exp;
                    double fact;
                    
                    // formula de sumatoria:
                    for(int i=0 ; i<= 100 ; i++){
                        
                        // separe la formula en 3 partes mayores, SUMATORIA de i=0
                        // hasta i=100 para A/B*C
                        //A = (-1)^i
                        for(cont = 0; cont<= i; cont++){
                            A=A*n;
                        }
                        System.out.println(A);
                        //B = (2i+1)!
                        B = (2*i)+1;
                        fact = B;
                        //ciclo para el factorial
                        for(cont=1; cont<=fact; cont++){
                            B = B*cont;
                        }
                        System.out.println(B);
                        
                        // C = X^(2*i+1)
                        exp = ((2*i)+1);                        
                       
                        for(cont =1 ; cont <= exp; cont++){
                            C = C*entrada;
                        }
                        
                        System.out.println(C);
                        
                        //respuesta+=((A/B)*C);
                    }
                    System.out.println(respuesta);
                    System.out.println(A);
                    System.out.println(B);
                    System.out.println(C);
                    
                        
                    System.out.println(respuesta);
                    
                    break;
                case 2:
                    
                    //Pedimos nuevamente el numero de filas
                    System.out.println("|----------------------------------|");
                    System.out.println("| ok haremos el ejercio 2 Paulina  |");
                    System.out.println("|     dibujemos una casa, cuantas  |");
                    System.out.println("|           filas quieres?         |");
                    System.out.println("|         hay un minimo de 4       |");
                    System.out.println("|----------------------------------|");
                    
                    //ocupa failswitch:
                    fila = in.nextInt();                        
                    columna = fila;
                       
                    //for para dibujar el techo
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
                    //for para dibujar la base
                    for(int i=1; i <= fila; i++){
                        for(int j=0; j <= columna; j++){                        
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                        
                    break;
                case 3:
                    //Pedimos nuevamente el numero de filas
                    System.out.println("|----------------------------------|");
                    System.out.println("| ok haremos el ejercio 3 Paulina  |");
                    System.out.println("|                                  |");
                    System.out.println("|       cuantas filas quieres?     |");
                    System.out.println("|         hay un minimo de 4       |");
                    System.out.println("|----------------------------------|");
                    
                    //ocupa failswitch:
                    fila = in.nextInt();                        
                    columna = fila;
                    
                    //Algoritmo para el cuadrado del Ejercicio 4
                    for(int i=1; i <= fila; i++){
                        for(int j=1; j <= columna; j++){                        
                            
                            if(i==1 || j ==1 || i == fila || j == columna){
                                if(i%2==0 || j%2!=0){
                                    System.out.print("J");
                                }
                                else{
                                    System.out.print("A");
                                }
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    
                    break;
            }
            
        }
        
        
    }
    
}

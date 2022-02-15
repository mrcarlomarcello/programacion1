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
        int menu= in.nextInt();
        
        //Variables para el Ejercicio 1
        double A;
        int B;
        double C;
        double sumatoria=0;
        double factorial;
        int Entero;
        //Variables para el Ejercicio 2        
        int fila;
        int columna;        
        //Variables para el Ejercicio3
        
        
        //Variables comunes
        int i;
        int j;
        int g;  
        
        while(menu!=4){
            
            System.out.println("|----------------------------------|");
            System.out.println("| ok haremos el lab3p1             |");
            System.out.println("|----------------------------------|");
            
            switch(menu){
                
                case 1:
                    System.out.println("El Ejercicio 1");
                    
                    //ocupaba*** failswitch:        
                    while(!in.hasNextInt()){
                        System.out.println("Ingresa una opcion de 0-10");
                        in.nextLine();
                    }
                    Entero = in.nextInt();
                    
                    for(i=0; i<=100; i++){
                        
                        A=(-1)^i;
                        
                        B= (2*i+1);
                        
                        C= Entero^(2*i+1);
                        
                        // Haremos el Factorial con un While
                        factorial = B;
                        g = B - 1;

                        //While SENCILLO para hacer un Factorial
                        if(factorial!=0){
                            while (g>0){
                                factorial *= g;
                                g--;
                            }
                        }
                        else{
                            factorial =1;
                        }
                        
                        sumatoria = sumatoria + ((A/factorial)*C);
                    }  
                    System.out.println(sumatoria);
                    
                    break;
                case 2:
                    
                    //Pedimos nuevamente el numero de filas
                    System.out.println("|----------------------------------|");
                    System.out.println("| ok haremos el ejercio 2          |");
                    System.out.println("|     dibujemos una casa, cuantas  |");
                    System.out.println("|           filas quieres?         |");
                    System.out.println("|         hay un minimo de 4       |");
                    System.out.println("|----------------------------------|");
                    
                    //ocupa failswitch:
                    fila = in.nextInt();                        
                    columna = fila;
                       
                    //for para dibujar el techo
                    for(i=1; i<= fila; i++){
                        for(j=fila; j>i ; j--){
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
                    for(i=1; i <= fila; i++){
                        for(j=0; j <= columna; j++){                        
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
                    for( i=1; i <= fila; i++){
                        for(j=1; j <= columna; j++){                        
                            
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
            System.out.println("|----------------------------------|");
            System.out.println("|     Elige una opcion de 1-3      |");
            System.out.println("|--------presiona 4 para salir-----|");
            System.out.println();        

            //ocupaba*** failswitch:        
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opcion de 1-4");
                in.nextLine();
            }
            menu= in.nextInt();
        }
        
        
    }
    
}

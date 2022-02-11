/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_carlomenjivar_20551123;
import java.util.Scanner;
/**
 *
 * @author shello101
 */
public class Lab1P1_CarloMenjivar_20551123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        
        //variable del menu
        int menu =1;
        //Variables del Ejercicio 1
        int Notas=0;
        char NotaL='x';
        //Variables del Ejercicio 2
        int Numero;
        int R;
        int i;
        int j;
        int factorial;
        int factorial2;
        //Variables del Ejercicio 3
        double Sumatoria;
        
        while(menu!=6){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|---Laboratorio 1 --------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");            
            System.out.println("|------------- Ingresa una opcion de 1-3 ---------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|----Carlo Marcello Menjivar Montes de Oca -------------|");
            System.out.println("|-----------------------------------------20551123------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|--------------------------- Exit with 6 !--------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.print(  "|-------------------------------------|:  ");
            
            //failswitch para asegurarnos que solo ingresen enteros
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opcion de 1-3");
                System.out.println("O puedes salir con 6");
                in.nextLine();
            }
            menu = in.nextInt();
            // ESTOY AGREANDO CAMBIOS PARA HACER COMMITS
            
            //jumping la pantalla del ejercicio
            System.out.println();System.out.println();System.out.println();
            
            switch(menu){               
                    
                case 1:
                    //Header del ejercicio 1
                    System.out.println();
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|----------------------------------- ejercicio 1 -------|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-------( ajustad sus cintures de seguridad)------------|");
                    System.out.println("|-------------------------------------------------------|");
                    
                    //agregando efectos de drama a mi programa
                    try{
                        Thread.sleep(1000);
                    } catch(InterruptedException ex){
                        System.out.println("Igual no deberia de estar poniendo esto... so...");
                    }                    
                    System.out.println("|-------Mi adrenalina entro en mocion-------------------|");                    
                    //agregando efectos de drama a mi programa
                    try{
                        Thread.sleep(1500);
                    } catch(InterruptedException ex){
                        System.out.println("Igual no deberia de estar poniendo esto... so...");
                    }
                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|---------------------Ingresa la nota del Alumno X -----|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.print(  "|-------------------------------------|:  ");
                    // fin del efecto de Header 1
                    
                    
                    //failswitch para asegurarnos que solo ingresen numeros entre 0-100
                    while(!in.hasNextInt()){
                        System.out.println("Ingresa un Entero");
                        in.nextLine();
                    }
                    Notas = in.nextInt();
                    
                    System.out.println("Ingresaste "+Notas);
                    
                    
                    //Ejercicio 1 Finalmente
                    
                    if(Notas>100 || Notas<0){
                        System.out.println("Ingresaste mal los valores");
                        NotaL = 'X';
                    }
                    if(Notas<55){
                        NotaL = 'F';
                    }
                    if(Notas>=55 && Notas <=60){
                        NotaL = 'E';
                    }
                    if(Notas>=61 && Notas <= 70){
                        NotaL = 'D';
                    }
                    if(Notas>=71 && Notas <=80){
                        NotaL = 'C';
                    }
                    if(Notas>=81 && Notas <= 90){
                        NotaL = 'B';
                    }
                    if(Notas>=91){
                        NotaL = 'A';                                
                    }
                    //IF Final para imprimir el ejercicio    
                    if(Notas>=61){
                        System.out.println("Aprobo la clase con una calificacion de: "+NotaL);
                    }
                    else{
                        System.out.println("Reprobro la clase con una calificacion de: "+NotaL);
                    }
                    
                    //jumping la pantalla
                    System.out.println();System.out.println();System.out.println();
                    break;
                
                case 2:
                    
                    System.out.println("Ejercicio 2");
                                        
                    System.out.println("Ingrese un Numero N");

                    //Ingresamos un Entero N
                    while(!in.hasNextInt()){
                        System.out.println("Introduce un Entero.");
                    }        
                    Numero = in.nextInt();
                    
                    System.out.println("Ingrese un Numero R");

                    //Ingresamos un Entero R
                    while(!in.hasNextInt()){
                        System.out.println("Introduce un Entero.");
                    }        
                    R = in.nextInt();
                    
                    
                    // Haremos el Factorial con un While
                    factorial = Numero;
                    i = Numero - 1;

                    //While SENCILLO para hacer un Factorial
                    if(factorial!=0){
                        while (i>0){
                            factorial *= i;
                            i--;
                        }
                    }
                    else{
                        factorial =1;
                    }
                        
                    //Factorial de abajo                    
                    factorial2 = Numero-R;
                    j =Numero-R-1;
                    //While SENCILLO para hacer un Factorial
                    if(factorial2 != 0){
                        while (j>0){
                            factorial2 *= j;
                            j--;
                        }
                    }else{
                        factorial2 =1;
                    }                                        
                    
                    int nPr = factorial/factorial2;
                    System.out.println("Este es el factorial: ");
                    System.out.println(nPr);                   
                    break;
                    
                case 3:
                    System.out.println("Ejercicio 3 - La Sumatoria");
                    
                    i=1;
                    Sumatoria=0;
                    
                    System.out.println("Ingrese un Numero N");

                    //Ingresamos un Entero N
                    while(!in.hasNextInt()){
                        System.out.println("Introduce un Entero.");
                    }        
                    Numero = in.nextInt();
                    double top;
                    double down;
                    double result;
                    
                    while(i<=Numero){
                        top = (2*i-1);
                        down = (i*(i+1));
                        result=top/down;                        
                        i++;
                        Sumatoria+=result;
                        System.out.print(Sumatoria+", ");
                    }
                    //JUMPING SCREEN
                    System.out.println();System.out.println();System.out.println();
                    break;                       
            }
            
        }
        System.out.println("Gracias por jugar al Laboratorio 1");
    }
    
}

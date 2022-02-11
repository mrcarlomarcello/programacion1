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
            
            System.out.println("|-------------------Ingresando -------------------------|");
            
            //variables para el ejercicio 1
            String cadena;
            String replace="";
            int Numero;
            
            //Variables del Ejercicio 2
            String stringLargo="";
            String stringCorto="";
            int contadorLargo=0;
            int contadorCorto=0;
            char character;
            boolean cabe = true;
            
            //Variables para el Ejercicio 3
            String numeros="";
            
        while(Menu!=4){
            
            switch(Menu){
                case 1:
                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------- Ejercicio 1 fString ---------------------------|");                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-- Escribe una cadena que incluya los caracteres %d ---|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------|: ");                                        
                    
                    //ingresamos la cadena
                    in.nextLine();                    
                    cadena = in.nextLine();
                    
                    System.out.println("|-- Escribe un Numero %d -------------------------------|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------|: ");
                    
                    while(!in.hasNextInt()){
                        System.out.println("Ingresa una opción válida");
                        in.nextLine();
                    }
                    Numero =in.nextInt();
                    
                    // Este es el Algoritmo del cambio
                    for(int i=0; i<cadena.length(); i++){
                        if( cadena.substring(i, i+1).equals("%") && (i<cadena.length()-1) ){
                            if (cadena.substring(i, i+2).equals("%d")){
                                System.out.println("Bingo!!");
                                replace += Numero;
                                i++;
                            }else{
                                replace += cadena.substring(i, i+1);
                            }
                        }else{
                            replace += cadena.substring(i, i+1);
                        }
                    }
                    //System.out.println(cadena);                    
                    System.out.println(replace);
                    
                    //limpiando variables
                    cadena = "";
                    replace = "";
                    
                    break;
                    
                case 2:
                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------- Ejercicio 2 Sera que cabe? --------------------|");                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-- Escribe una cadena ---------------------------------|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------|: ");                                        
                    
                    //ingresamos la cadena
                    in.nextLine();                    
                    cadena = in.nextLine();
                    
                    System.out.println("|-- Escribe una segunda cadena para comparar -----------|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------|: ");                                        
                    
                    replace = in.nextLine();
                    
                    if(cadena.length() >= replace.length()){
                        stringLargo =cadena;
                        stringCorto =replace;
                    }else{
                        stringLargo = replace;
                        stringCorto = cadena;
                    }
                    
                    //Algoritmo para contar
                    
                    for(int i=0;i<stringCorto.length();i++){
                        
                        character = stringCorto.charAt(i);
                        //System.out.println(character);
                        
                        //vamos a contar cuantas veces aparece ese Character en la variable corta
                        for(int j=0;j<stringCorto.length();j++){
                            
                            if(stringCorto.charAt(j) == character){
                                contadorCorto +=1;
                            }
                        }
                        //vamos a contar cuantas veces aparece ese Character en la variable Larga
                        for(int k=0; k<stringLargo.length(); k++){
                            
                            if(stringLargo.charAt(k) == character){
                                contadorLargo +=1;
                            }
                        }
                        
                        //System.out.println("La letra "+ character+" aparece "+contadorCorto+" en la palabra corta");
                        //System.out.println("La letra "+ character+" aparece "+contadorLargo+" en la palabra Larga");
                        
                        if(contadorCorto>contadorLargo){
                            cabe = false;
                        }
                        contadorCorto=0;
                        contadorLargo=0;
                    }
                    
                    
                    if(cabe == true){
                        System.out.println("Si se puede armar "+ stringCorto+ " con "+stringLargo);
                    }else{
                        System.out.println("No se puede armar "+ stringCorto+ " con "+stringLargo);
                    }                                       
                    
                    //limpiando variables
                    cabe = true;
                    cadena = "";
                    replace = "";
                    contadorCorto =0;
                    contadorLargo = 0;
                    break;
                    
                case 3:
                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|------- Ejercicio 3 Ordenando -------------------------|");                    
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|-- Escribe una cadena que incluya letras y numeros ----|");
                    System.out.println("|-------------------------------------------------------|");
                    System.out.print("|------|: "); 
                    
                    in.nextLine();
                    cadena = in.nextLine();
                    
                    System.out.println(cadena);
                    
                    
                    // Este es el Algoritmo del cambio
                    for(int i=0; i<cadena.length(); i++){
                        if( cadena.substring(i, i+1).equals("1") || cadena.substring(i, i+1).equals("2") || cadena.substring(i, i+1).equals("3") ||
                            cadena.substring(i, i+1).equals("4") || cadena.substring(i, i+1).equals("5") || cadena.substring(i, i+1).equals("6") ||
                            cadena.substring(i, i+1).equals("7") || cadena.substring(i, i+1).equals("8") || cadena.substring(i, i+1).equals("9") ||
                            cadena.substring(i, i+1).equals("0") ){
                            
                            numeros += cadena.substring(i, i+1);
                        }else{
                            replace += cadena.substring(i, i+1);
                        }
                    }
                    
                    cadena = numeros + replace;
                    System.out.println(cadena);
                    cadena = "";
                    replace = "";
                    numeros = "";
                    break;
            }
            
            System.out.print("|---------------  Ingresa una opcion de 1-3 ... 4 para salir-----|: ");
            
            //failswitch de enteros
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opción válida");
                in.nextLine();
            }
            Menu =in.nextInt();
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas_carlomenjivar20551123;
import java.util.Scanner;

/**
 *
 * @author megam
 */
public class Cadenas_CarloMenjivar20551123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        //Empezamos por el menu
        System.out.println("|----------------------------------|");
        System.out.println("|     Elige una opcion de 1-5      |");
        System.out.println("|--------presiona 6 para salir-----|");
        System.out.println();        
        
        //ocupaba*** failswitch:        
        while(!in.hasNextInt()){
            System.out.println("Ingresa una opcion de 1-5");
            in.nextLine();
        }
        int entrada = in.nextInt();
        
        int menu =  entrada;
        
        String cadena1; 
        String cadena2;
        
        while(menu!=6){
            
            System.out.println("|----------------------------------|");
            System.out.println("| ok haremos la Tarea S4T1         |");
            System.out.println("|----------------------------------|");
            
            switch(menu){
                
                case 1:
                    System.out.println("Ejercicio 1");
                    
                    System.out.println("Cadena 1");
                    cadena1 = in.next();
                    
                    System.out.println("Cadena 2");
                    cadena2 = in.next();
                    
                    System.out.println(cadena1);
                    System.out.println(cadena2);
                    cadena1 = cadena1.toLowerCase();
                    cadena2 = cadena2.toLowerCase();
                    
                    if(cadena1.contains(cadena2)){
                        System.out.println("La palabra "+cadena1+" contiene la palabra "+cadena2);
                    }
                    else{
                        System.out.println("La palabra "+cadena1+" NO contiene la palabra "+cadena2);
                    }
                    
                    int countA=0;                 
                    int countE=0;
                    int countI=0;
                    int countO=0;
                    int countU=0;
                    
                    for (int i=0; i< cadena2.length(); i++){
                        switch(cadena2.charAt(i)){
                            case 'a':
                                countA++;
                                break;
                            case 'e':
                                countE++;
                                break;
                            case 'i':
                                countI++;
                                break;
                            case 'o':
                                countO++;
                                break;
                            case 'u':
                                countU++;
                                break;
                        }
                    }
                    System.out.println("La frase tiene las siguientes Vocales:");
                    System.out.println("A: "+ countA);
                    System.out.println("E: "+ countE);
                    System.out.println("I: "+ countI);
                    System.out.println("O: "+ countO);
                    System.out.println("U: "+ countU);
                    break;
                    
                case 2:
                    boolean containsWord = false;
                    
                    System.out.println("Ejercicio 2");
                    
                    System.out.println("Cadena 1");
                    cadena1 = in.next();
                    
                    System.out.println("Cadena 2");
                    cadena2 = in.next();
                    
                    System.out.println(cadena1);
                    System.out.println(cadena2);
                    cadena1 = cadena1.toLowerCase();
                    cadena2 = cadena2.toLowerCase();
                    
                    String segmentoCadena1="";
                    
                    for(int i=0;((i+cadena2.length())<=(cadena1.length())); i++){
                        
                        segmentoCadena1= cadena1.substring(i, (i+cadena2.length()));
                        
                       if(segmentoCadena1.equals(cadena2)){
                           System.out.println("La palabra "+cadena1+" SI contiene la palabra "+cadena2);                           
                           containsWord = true;
                       }
                    }
                    
                    if(containsWord == false){
                        System.out.println("La palabra "+cadena1+" NO contiene la palabra "+cadena2);
                    }
                    else{
                        containsWord = false;
                    }

                    System.out.println("Fin de Ejercicio 2.");
                    break;
                case 3:
                    System.out.println("Ejercicio 3");
                    break;
                case 4:
                    System.out.println("Ejercicio 4");
                    break;
                case 5:
                    System.out.println("Ejercicio 5");
                    break;
            }
            
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opcion de 1-5");
                in.nextLine();
             }
            menu = in.nextInt();
                                
        }
        
        
    }
    
}
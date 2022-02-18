/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_carlomenjivar;
import java.util.Scanner;

/**
 *
 * @author megam
 */
public class Examen1P1_CarloMenjivar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int menu = 1;
        
        while(menu!=4){
            
            printTheMenu();
            
            while(!in.hasNextInt()){
                System.out.println("Ingresa una opcion de 1-3");
                System.out.println("O puedes salir con 4");
                in.nextLine();
            }
            menu = in.nextInt();
            
            in.nextLine();
            
            switch(menu){
                
                case 1:
                    System.out.println("Ejercicio 1");
                    System.out.println("Ingresa una cadena");
                    
                    String palabra1 = in.nextLine();
                    System.out.println("Listo, Ingresa una segunda cadena");
                    String palabra2 = in.nextLine();
                    
                    if(palabra1.length() == palabra2.length()){
                        equalsIgnoreCase2(palabra1, palabra2);
                    }else{
                        System.out.println("No son Iguales.");
                    }
                    
                    break;
                
                case 2:
                    System.out.println("Ejercicio 2");
                    System.out.println("Ingresa una cadena");
                    
                    String parametro1 = in.nextLine();
                    
                    int numeros = ordenamientoPractico(parametro1.toLowerCase());
                    
                    System.out.println(numeros);
                    break;
                    
                case 3:
                    System.out.println("Ejercicio 3");
                    
                    int numero =3;
                    
                    while(numero<4){
                        System.out.println("Ingrese un numero mayor o igual a 4");
                        while(!in.hasNextInt()){
                            System.out.println("Tiene que ser mayor a 4");
                            in.nextLine();
                        }
                        numero = in.nextInt();
                    }                                
                    in.nextLine();
                    System.out.println("Ingrese un Caracter");
                    char A = in.nextLine().charAt(0);
                    System.out.println("Ingrese un Segundo Caracter");
                    char B = in.nextLine().charAt(0);                    
                    System.out.println("Ingrese un Tercer Caracter");
                    char C = in.nextLine().charAt(0);
                    principeDePersia(numero, A, B, C);
                    
                    break;
            }
        }
        System.out.println("GRACIAS POR PARTICIPAR");
    }
    
    public static void equalsIgnoreCase2(String arg1, String arg2){
                boolean sonIguales = true;
                int compara;
                
                for(int i=0; i < arg1.length(); i++){
                    compara = arg1.charAt(i) - arg2.charAt(i);
                    //System.out.println(compara);
                    if(compara == 0 || compara == 32 || compara == -32){
                        sonIguales = true;
                    }else{
                        sonIguales = false;
                        break;
                    }                    
                }
                if(sonIguales){
                    System.out.println("Son Iguales.");
                }else{
                    System.out.println("No son Iguales.");
                }                
    }
    
    public static void printTheMenu(){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|---Examen I  Lab. programacion 1 ----------------------|");
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
            System.out.println("|-------------------------------------------------------|");
            System.out.print(  "|-------------------------------------|:  ");
    }
    
    public static int ordenamientoPractico(String parametro){
        String palabraTemporal="";
        String palabraNueva="";
        int contador = 0;
 
        
        System.out.println("Vamos a ordernar: "+parametro);
        //quito los espacios
        for(int i = 0; i < parametro.length(); i++){
            //System.out.println(parametro.charAt(i));
            if(parametro.charAt(i)==32){                
            }
            //if(parametro.charAt(i)=='0' || parametro.charAt(i)=='1' || parametro.charAt(i)=='2' || parametro.charAt(i)=='3' || parametro.charAt(i)=='4' || parametro.charAt(i)=='5' || parametro.charAt(i)=='6' || parametro.charAt(i)=='7' || parametro.charAt(i)=='8' || parametro.charAt(i)=='9'){
            else if(parametro.charAt(i)>=48 && parametro.charAt(i)<=57){    
                //System.out.println(parametro.charAt(i));
                contador+=1;
            }
            else{
                palabraTemporal+=parametro.charAt(i);
            }
        }
        for(int j=97; j <= 122; j++){
            for(int k =0; k < palabraTemporal.length(); k++){
                if(palabraTemporal.charAt(k)==j){
                    palabraNueva += palabraTemporal.charAt(k);
                }
            }
        }
        System.out.println(palabraNueva);
        return contador;
    }
    
    public static void principeDePersia(int n, char a, char b, char c){
        char col1, col2, col3;
        for(int i=1; i<=n;i++){
            if(i ==1 || i== n){
                col1 = a;
                col2 = b;
                col3 = a;
            }else{
                col1 = b;
                col2 = c;
                col3 = b;
            }
            for(int j=1; j<=n; j++){
                System.out.print(col1);
            }
            for(int j=1; j<=n; j++){
                System.out.print(col2);
            }
            for(int j=1; j<=n; j++){
                System.out.print(col3);
            }
            System.out.println();
        }
    }
}

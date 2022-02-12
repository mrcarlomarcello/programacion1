/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s4_ciclofor_figuras_carlomenjivar20551123;
import java.util.Scanner;
/**
 *
 * @author megam
 */
public class S4_ciclofor_figuras_CarloMenjivar20551123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa cualquier palabra o frase:");
        String graficos = in.nextLine();
        
        System.out.println("Ok, ahora dibujemos el grafico");                           
        
        int counter = graficos.length();
        boolean atInicio = true;
        char inicio = graficos.charAt(0);
        char findestring = graficos.charAt(graficos.length()-1);
        
        for(int i=1; i<= (graficos.length()+1)*2; i++){
            
            if(atInicio){
                System.out.print(inicio);
            }else{
                System.out.print(findestring);
            }
            counter--;
            if(counter==0){
                counter = graficos.length();
                atInicio= !atInicio;
            }
        }
        System.out.println();
        
        for(int i=1; i<= graficos.length()-1; i++){
            counter = graficos.length()-i-1;
            
            for(int j=graficos.length(); j>i ; j--){
                if(atInicio){
                    System.out.print(inicio);
                }else{
                    System.out.print(findestring);
                }
                counter--;
                if(counter==0){
                    counter = graficos.length()-i-1;
                    atInicio= !atInicio;
                }
            }
                            
            if( i == 1){
                
                System.out.print("    ");
            }
            else{                                
                for(int k=i+2; k>=2 ; k--){
                    System.out.print("  ");
                }                                
            }
            for(int j=graficos.length(); j>i ; j--){
                if(atInicio){
                    System.out.print(inicio);
                }else{
                    System.out.print(findestring);
                }
                counter--;
                if(counter==0){
                    counter = graficos.length()-i-1;
                    atInicio= !atInicio;
                }
            }
            
            System.out.println();        
        }
    }    
    
}

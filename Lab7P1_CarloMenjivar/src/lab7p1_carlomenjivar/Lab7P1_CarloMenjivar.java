/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_carlomenjivar;
// Author @shello

public class Lab7P1_CarloMenjivar {
    
    
    static executeAlgo execute = new executeAlgo();
    static miscClass misc = new miscClass();    
    static int menu = 0;    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(menu!=4){
            
            misc.printTheMenu();            
            menu = misc.leerEntero();
            
            switch(menu){
                    case 1 -> {                                            
                        execute.ejercicioUno();
                }
                    case 2 -> {                        
                        execute.ejercicioDos();
                }
                    case 3 -> {                        
                        execute.ejercicioTres();
                }
            }            
        }
        
    }
    
}

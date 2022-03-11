
package lab8p1carlomenjivar;

/**
 *
 * @author shello
 */
public class Lab8P1CarloMenjivar {
    
    static int menu =0;
    static executeAlgo execute = new executeAlgo();
    static miscellaneous misc =  new miscellaneous();
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        while(menu != 4){
            
            misc.printTheMenu();
            menu = misc.leerEntero();
            
            switch(menu){
                case 1 -> {
                    execute.ejercicio1();
                }
                
                case 2 -> {
                    execute.ejercicio2();
                }
                
                case 3 -> {
                    execute.ejercicio3();
                }
            }
            
            
        }
    }
    
}

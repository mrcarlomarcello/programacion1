
package repo1p1_carlomenjivar;
//author @shello101
public class Repo1P1_CarloMenjivar {
    
    static miscClass misc = new miscClass();
    static executeAlgorithm execute = new executeAlgorithm();    
    static int menu=0;
    
    public static void main(String[] args) {
        
        while(menu!=4){
            
            misc.printTheMenu();
            menu = misc.leerEntero();
            
            switch(menu){                
                case 1 -> {
                    execute.ejercicio1();
                    break;
                }
                case 2 -> {
                    execute.ejercicio2();
                    break;
                }
                case 3 -> {
                    execute.ejercicio3();
                    break;
                }
            }
        }
        
    }
    
}

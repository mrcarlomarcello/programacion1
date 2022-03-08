
package s8_matrices;


public class S8_matrices {
    
    static miscellaneous misc = new miscellaneous();
    static executeAlgo execute = new executeAlgo();
    static int menu =0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(menu!=7){
            
            misc.printTheMenu();
            menu = misc.dialogLeerEntero();
            
            switch(menu){
                case 1:
                    execute.ejercicio1();
                    break;
                case 2:
                    execute.ejercicio2();
                    break;
                case 3:
                    execute.ejercicio3();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
    
}


package lab9p1_carlomenjivar;

public class Lab9P1_CarloMenjivar {

    public static executeAlgo execute =  new executeAlgo();
    public static miscellaneous misc = new miscellaneous();
    
    public static void main(String[] args) {
        // TODO code application logic here
        int menu = 0;
        
        while(menu != 3){
            
            menu = misc.leerEntero("Ingrese un Numero: ");
            misc.printTheMenu();            
            
            switch(menu){                
                case 1:
                    execute.ejercicio1();
                    break;                
                case 2:
                    execute.ejercicio2();
                    break;
            }
        }
        System.out.println("Gracias por el Ultimo Lab (: ");
    }
    
}

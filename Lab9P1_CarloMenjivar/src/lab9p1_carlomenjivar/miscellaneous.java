
package lab9p1_carlomenjivar;
import java.util.Scanner;


public class miscellaneous {
        
    public Scanner in = new Scanner(System.in);
    
    //Imprime mi menu
    public void printTheMenu(){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|----- Laboratorio 9 ------ programacion 1 -------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-------------------------------------------------------|");            
            System.out.println("|------------- Ingresa una opcion de 1-2 ---------------|");
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-----------------------------3 para salir--------------|");
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
            System.out.println("|--- ( insert a joke here ) ----------------------------|");
            System.out.println("|-----------------------------|: ");
    }
    
    //Quiero un metodo para leer Enteros...(retorna un entero)
    public int leerEntero(String temp){
        System.out.println(temp);
        while(!this.in.hasNextInt()){
            System.out.println("Ingresa un numero real...");
            this.in.nextLine();
        }
        int buscarnumero = in.nextInt();
        in.nextLine();
        return buscarnumero;
    }
    
    public String leerCadena(String temp){
        System.out.println(temp);
        String cadena = in.nextLine();
        return cadena;
    }
    
}

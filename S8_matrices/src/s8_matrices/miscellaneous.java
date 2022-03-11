
package s8_matrices;
import javax.swing.JOptionPane;
//import java.util.Scanner;
        
public class miscellaneous {
    
   //private final Scanner in = new Scanner(System.in);        
    //Imprime mi menu
    public void printTheMenu(){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-----Semana 8 ------ programacion 1 -------------------|");
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
            System.out.println("|--- Arreglos con matrices's Edition -------------------|");
            System.out.print(  "|-----------------------------|: ");
    }
    
    //Quiero un metodo para leer Enteros...(retorna un entero)
    public int dialogLeerEntero(){
        
        //System.out.println("Ingresa un numero: ");
        //while(!this.in.hasNextInt()){
        //    System.out.println("Ingresa un numero real...");
        //    this.in.nextLine();
        //}
        //int buscarnumero = in.nextInt();
        int buscarnumero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Número: "));
        
   
        return buscarnumero;
    }
    
    public void dialogSandwhich( String Sandwich){
        JOptionPane.showConfirmDialog(null, Sandwich);
    }
    
    
}


package lab7p1_carlomenjivar;
import java.util.Scanner;
import java.util.Random;

public class miscClass {
    
    private final Scanner in = new Scanner(System.in);
    public Random random = new Random();
    
    //Metodo para inprimir Menu modificado para Lab 6
    public void printTheMenu(){
            //Imprimimos un menu llamativo y bonito
            System.out.println("|-------------------------------------------------------|");
            System.out.println("|-----Lab#7 ------ programacion 1 ----------------------|");
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
            System.out.println("|--- 'Henry Cavill's edition ---------------------------|");
            System.out.print(  "|-----------------------------|: ");
    }
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public void imprimirArray(int [] temp){
        
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i]>99){
                System.out.print("["+temp[i]+"]");
            }else if(temp[i]>9){
                System.out.print("[ "+temp[i]+"]");
            }else{
                System.out.print("[ "+temp[i]+" ]");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    
    //Quiero un metodo para leer Enteros...(retorna un entero)
    public int leerEntero(){
        System.out.println("Ingresa un numero: ");
        while(!this.in.hasNextInt()){
            System.out.println("Ingresa un numero real...");
            this.in.nextLine();
        }
        int buscarnumero = in.nextInt();
        return buscarnumero;
    }
    
    //Quiero un metodo para leer Cadenas...(retorna una cadena)
    public String leerCadena(){
        System.out.println("Ingresa una cadena: ");              
        String tempstring = in.nextLine();               
        return tempstring;
    }
    
    //Quiero un metodo para leer caracteres
    public char leerChar(){
        System.out.println("Ingresa un character de separacion: (* , &  @ | # ... etc )");        
        char caracter = in.nextLine().charAt(0);
                
        return caracter;
    }
    
    //Llena un arreglo de int size con numeros de 0-999
    public int [] LlenarEnteros(int size, int max){
        
        int [] temp = new int[size];        
        for(int i = 0; i < temp.length; i++){
            temp[i] = this.random.nextInt(max);
        }        
        return temp;
    }
}

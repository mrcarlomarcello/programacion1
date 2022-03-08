
package prueba2s8carlomenjivar;


public class Prueba2S8CarloMenjivar {

    static int menu = 0;
    static miscellaneous misc = new miscellaneous();
    static numeros num = new numeros();
    static caracteres caracter = new caracteres();
    
    public static void main(String[] args) {
        
        while(menu!=3){
            System.out.println("Ingrese 1 o 2, 3 para salir.");
            menu = misc.leerEntero();
            
            switch(menu){
                case 1 -> {
                    num.numeros(10);                    
                    int [] temp = num.bubbleSort(num.getArregloEnteros());                 
                    //BUBBLE implementation
                    for(int i=0; i<temp.length; i++){
                        temp = num.bubbleSort(temp);
                    }
                    misc.imprimirArray(temp);
                    break;
                }
                case 2 -> {
                    break;
                }
            }
        }
    }
    
}

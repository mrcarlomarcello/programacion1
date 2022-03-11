
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
            System.out.println();
            
            switch(menu){
                case 1:
                    // Crear una matriz global
                    execute.ejercicio1();
                    break;
                case 2:
                    //suma de filas
                    execute.ejercicio2();
                    break;
                case 3:
                    //suma columnas
                    execute.ejercicio3();
                    break;
                case 4:
                    //encontrar un numero
                    break;
                case 5:
                    //recibe una matriz desordenada y lo pasa a arreglo, lo ordena y lo pasa a matriz
                    break;
                case 6:
                    //matriz de caracteres
                    break;
            }
        }
    }
    
}

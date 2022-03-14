
package s8_matrices;


public class S8_matrices {
    
    static miscellaneous misc = new miscellaneous();
    static executeAlgo execute = new executeAlgo();
    static int menu =0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(menu!=10){
            
            misc.printTheMenu();
            menu = misc.dialogLeerEntero();
            System.out.println();
            
            switch(menu){
                case 1:
                    // Crear una matriz global desordenada
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
                    execute.ejercicio4();
                    //encontrar un numero
                    break;
                case 5:
                    execute.ejercicio5();
                    //recibe una matriz desordenada y lo pasa a arreglo, lo ordena y lo pasa a matriz
                    break;
                case 6:
                    //matriz de caracteres
                    break;
                case 7:
                    //Sandwich
                    execute.ejercicio7();
                    break;
                case 8:
                    //Crea una matriz Ordenada
                    execute.ejercicio8();
            }
        }
    }
    
}

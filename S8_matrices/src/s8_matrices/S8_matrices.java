
package s8_matrices;


public class S8_matrices {
    
    static miscellaneous misc = new miscellaneous();
    static executeAlgo execute = new executeAlgo();
    static int menu =0;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(menu!=11){
            
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
                    //encontrar un numero
                    execute.ejercicio4();                    
                    break;
                case 5:
                    //recibe una matriz desordenada y lo pasa a arreglo, lo ordena y lo pasa a matriz
                    execute.ejercicio5();                    
                    break;
                case 6:
                    //matriz de caracteres
                    execute.ejercicio6();
                    break;
                case 7:
                    //Sandwich
                    execute.ejercicio7();
                    break;
                case 8:
                    //Crea una matriz Ordenada
                    execute.ejercicio8();
                    break;
                case 9:
                    //sopa de letras
                    execute.ejercicio9();
                    break;
                case 10:
                    //arraylist
                    execute.ejercicio10();
                    break;
            }
        }
    }
    
}

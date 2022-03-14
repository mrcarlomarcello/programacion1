
package s8_matrices;


public class executeAlgo {
    static final mate mate = new mate();
    static final miscellaneous misc = new miscellaneous();
    public int [][] matrix;
    
    //crea una matriz desordenada
    public void ejercicio1(){
        mate.matrix(10, 9);
        this.matrix = mate.llenarMatrix(mate.getMatrix());
        mate.imprimirMatrix(this.matrix);
    }
    
    //suma filas
    public void ejercicio2(){
        System.out.println("Ejercicio 2");
        this.matrix = mate.getMatrix();
        mate.imprimirMatrix(mate.sumaFilas(this.matrix));
    }
    
    //suma columnas
    public void ejercicio3(){
        System.out.println("Ejercicio 3");
        this.matrix = mate.getMatrix();
        mate.imprimirMatrix(mate.sumaColumns(this.matrix));
    }
    
    //cambia caracteres según un número que encuentre
    public void ejercicio4(){
        System.out.println("Ejercicio 4 - Buscaremos el '5'");
        this.matrix = mate.getMatrix();
        mate.encontrarNumero(this.matrix, 5);
    }
    
    //Imprime funcion de X
    public void ejercicio5(){
        System.out.println("Ejercicio 5 - Funciones");
        mate.yfunciondex(this.matrix);
    }
    
    //Imprime un sandwhich
    public void ejercicio7(){
        
        System.out.println("Ejercicio 1 - Ingresa un numero igual o mayor a 7");
        
        int border = 0;
        while(border<7){
            border = misc.dialogLeerEntero();
        }
        
        //allí vaaaa
        System.out.println(border);
        mate.sandwich(border);
        
        String Sandwhich = mate.sandwich2(border);
        
        misc.dialogSandwhich(Sandwhich);
        
    }
    
    //crea una matriz ordenada
    public void ejercicio8(){
        mate.matrix(10,10);
        this.matrix = mate.llenarMatrizOrdenada(mate.getMatrix());
        mate.imprimirMatrix(this.matrix);
    }
    
    //Sopa de Letras
    public void ejercicio9(){
        
    }       
}

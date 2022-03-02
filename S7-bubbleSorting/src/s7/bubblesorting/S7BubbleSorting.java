
package s7.bubblesorting;

//@author marcellomenjivarmontesdeoca
 
public class S7BubbleSorting {        
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        metodos_arreglos method = new metodos_arreglos();

        //Creamos los arreglos Random
        int size = 100;
        int max = 99;
        int [] arregloDesorden = method.LlenarEnteros(size, max);
        int [] arregloOrdenado = new int[arregloDesorden.length];
        method.imprimirArray(arregloDesorden);
        
        
        //BUBBLE implementation
        for(int i=0; i<arregloDesorden.length; i++){
            arregloOrdenado = method.bubbleSort(arregloDesorden);
        }
        //pruebas
        System.out.println("Esta es la impresión de la variable el arreglo original after sorting");
        method.imprimirArray(arregloDesorden);
        System.out.println("Esta esta es la impresión de la segunda variable 'temp' que es la que debería de cambiar");
        method.imprimirArray(arregloOrdenado);
        
        // AGREGANDO SEARCHINDEX
        System.out.println("Ingresa un numero real: ");
        //Mi método para leer enteros            
        int buscarNumero = method.leerEntero();
        //Mi método para busqueda lineal, me retorba -1 si no encuentra el index
        int index = method.searchIndex(arregloOrdenado, buscarNumero);
        
        if(index != -1){
            System.out.println("Encontramos el index con nuestro metodo linear: " + index);
            System.out.println("El arreglo["+index+"]: "+arregloOrdenado[index]);
        }else{
            System.out.println("No encontramos tu número...");
        }
        // Binary search O Busqueda Binaria
        //boolean found = binarySearch(arregloOrdenado, buscarNumero);
        //System.out.println(found);        
    }            
}

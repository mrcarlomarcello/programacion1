
package lab7p1_carlomenjivar;

public class executeAlgo {
    
    private final miscClass misc = new miscClass();
    private final numero num = new numero();
    private String cadena;
    private char caracter;
    private int size;
    private int [] temp;
    int sumatoria;
    //Pasos del Ejercicio 1
    public void ejercicioUno(){        
         //variables de logica
        this.cadena = misc.leerCadena();                
        this.caracter = misc.leerChar();
        
        // El Unico System print de esta clase
        System.out.println("Ejercicio 1");               
         
        cadenas ejercicio1 = new cadenas();
        ejercicio1.cadenas(cadena, caracter);
        String [] Respuesta = ejercicio1.turingSearch(cadena, caracter);
        
        //imprime la respuesta del ejercicio 1
        ejercicio1.imprimirRespuestaEjercicio1(Respuesta);
        
    }
    //Pasos del Ejercicio 2
    public void ejercicioDos(){
        
        System.out.println("Ejercicio 2 - Ingrese el tamaño del arreglo: ");        
        this.size = misc.leerEntero();        
        //constructor solicitado del ejercicio
        this.num.numero(size);       
        this.temp = num.getNumero();        
        //Imprime el arreglo creado
        this.misc.imprimirArray(temp);
        //respuesta del ejercicio 2
        this.misc.imprimirArray(num.primos());        
    }    
    //Pasos del Ejercicio 3
    public void ejercicioTres(){
        
        System.out.println("Ejercicio 3 - Ingrese el tamaño del arreglo: ");
        this.size = misc.leerEntero();        
        
        //constructor solicitado del ejercicio
        this.num.numero(size);       
        this.temp = num.getNumero();        
        
        //Imprime el arreglo creado
        this.misc.imprimirArray(this.temp);
                
        this.num.Sumatoria(this.temp);                
        
    }
}

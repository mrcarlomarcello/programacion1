
package repo1p1_carlomenjivar;

public class executeAlgorithm {
    
    private final miscClass misc = new miscClass();
    private final mate mate = new mate();
    
    //Algoritmo del ejercicio 1 pie
    public void ejercicio1(){
        System.out.println("Ejercicio 1 - escriba un limite:");
        int M = misc.leerEntero();
        double pie = 0;
        double top;
        double down;
        double result;
        for(int i = 0; i<= M; i++){
            top = mate.exponencial((-1), i);
            down = ((2*i)+1);
            result = top/(double)down;
            pie = pie + result;
        }
        System.out.println(pie);        
    }
    
    //Algoritmo del ejercicio 2
    public void ejercicio2(){
        System.out.println("Ejercicio 2 - Ingresa un numero igual o mayor a 7");
        
        int border = 0;
        while(border<7){
            border = misc.leerEntero();
        }
        
        mate.sandwich(border);
        
    }
    
    //Algoritmo del ejercicio 3
    public void ejercicio3(){
        System.out.println("Ejercicio 3 -  Ingresa una cadena con comandos -w y -p");
        String comando = misc.leerCadena();
        
        for(int i =0; i < (comando.length()-1); i++){
            if(comando.substring(i, i+2).equals("-p")){
                System.out.println("Got it");
            }
        }
        
        for(int i =0; i < (comando.length()-1); i++){
            if(comando.substring(i, i+2).equals("-w")){
                System.out.println("Got it");
            }
        }
    }
    
}

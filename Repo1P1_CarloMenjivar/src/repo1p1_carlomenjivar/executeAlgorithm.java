
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
            result =top/down;
            pie += result;
        }
        System.out.println(pie);        
    }
    //Algoritmo del ejercicio 2
    public void ejercicio2(){
        System.out.println("Ejercicio 2");
    }
    //Algoritmo del ejercicio 3
    public void ejercicio3(){
        System.out.println("Ejercicio 3"); 
    }
}


package s8_matrices;


public class executeAlgo {
    static final mate mate = new mate();
    static final miscellaneous misc = new miscellaneous();
    
    public void ejercicio1(){
        
        System.out.println("Ejercicio 2 - Ingresa un numero igual o mayor a 7");
        
        int border = 0;
        while(border<7){
            border = misc.dialogLeerEntero();
        }
        //allí vaaaa
        System.out.println(border);
        mate.sandwich(border);
        
        System.out.println("Ejercicio 1");
    }
    
    public void ejercicio2(){
        System.out.println("Ejercicio 2");
    }
    
    public void ejercicio3(){
        System.out.println("Ejercicio 3");
    }
}

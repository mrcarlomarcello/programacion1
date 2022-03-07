
package repo1p1_carlomenjivar;

public class executeAlgorithm {
    
    private final miscClass misc = new miscClass();
    private final mate mate = new mate();
    
    //Algoritmo del ejercicio 1 pie
    public void ejercicio1(){
        
        System.out.println("Ejercicio 1 - escriba un limite:");
        int M = misc.leerEntero();
        double pie = 0.0;
        double top;
        double down;
        double result;
        
        for(int i = 0; i<= M; i++){
            top = mate.exponencial((-1.0), i);
            down = (2.0*i)+1.0;
            result = top/down;
            pie +=  result;
        }
        
        System.out.println("pie es: " + pie); 
        
        //System.out.println("Mi exponencial de 9^3 para revisar :"+ mate.exponencial(9.0, 3));
    }
    
    //Algoritmo del ejercicio 2
    public void ejercicio2(){
        System.out.println("Ejercicio 2 - Ingresa un numero igual o mayor a 7");
        
        int border = 0;
        while(border<7){
            border = misc.leerEntero();
        }
        //allí vaaaa
        mate.sandwich(border);
        
    }
    
    //Algoritmo del ejercicio 3
    public void ejercicio3(){
        System.out.println("Ejercicio 3 -  Ingresa una cadena con comandos -w y -p");
        String comando = misc.leerCadena();
        int limit = comando.length();
        String cadena;
        String param="";
        for(int i =0; i < limit-3; i++){
            if(comando.charAt(i) == '-'){
                cadena = comando.substring(i+3, limit);
                
                for(int j =0; j<cadena.length(); j++){
                    if(cadena.charAt(j)==' '){
                        break;
                    }
                    param += cadena.charAt(j);
                }
                
                System.out.println(comando.charAt(i+1)+": "+param);
                param="";
            }
        }
    }
    
}

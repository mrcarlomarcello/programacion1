
package lab7p1_carlomenjivar;

public class cadenas {
    
    public String cadena;
    public char caracter;
    
    //constructor
    public void cadenas(String cadena, char caracter){
        this.cadena =  cadena;
        this.caracter = caracter;
    }

    //Sets y Gets porque tengo que practicar :)        
    public void setcadena(String cadena){
        this.cadena = cadena;
    }    
    public void setcaracter(char caracter){
        this.caracter = caracter;
    }
    public String getcadena(){
        return cadena;
    }
    public char   getcaracter(){
        return caracter;
    }        
        
    //ALGORITMOS PARA EL EJERCICIO #1
    public String [] turingSearch(String passphrase, char caracter){
        
        //CONTAMOS LOS CARACTERES
        int contador = 0;              
        for(int i=0;i<passphrase.length();i++){
            if(passphrase.charAt(i)==caracter){
                //System.out.print('X');
                contador++;
            }
        }
        
        //sin este if no me agarraba el ultimo espacio
        if(passphrase.charAt(passphrase.length()-1) != caracter){
            contador++;
        }
        
        //Creamos un Array del tamano que contamos de Caracteres
        String [] cadena = new String[contador];        
        String temp ="";
        contador = 0;
        
        //agrego la palabra
        int tope = passphrase.length()-1;
        
        for(int i=0;i<passphrase.length();i++){
            if(i==(tope) && passphrase.charAt(tope)!= caracter){
                temp += passphrase.charAt(i);
                cadena[contador] = temp;
            }else if(passphrase.charAt(i)==caracter){
                cadena[contador] = temp;
                contador+=1;
                temp = "";
            }else{
                temp += passphrase.charAt(i);
            }
            
        }    
        
        return cadena;
    }
    
    //Metodo que imprime la respuesta del ejercicio uno (pero en general imprime los strings de un arreglo)
    public void imprimirRespuestaEjercicio1(String [] Respuesta){
        for (String respuesta : Respuesta) {
            System.out.println(respuesta);
        }
    }
}

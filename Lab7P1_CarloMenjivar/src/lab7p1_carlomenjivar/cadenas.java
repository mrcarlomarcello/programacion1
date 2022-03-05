
package lab7p1_carlomenjivar;

public class cadenas {
    
    public String cadena;
    public char caracter;
    
    //constructor
    public void cadenas(String cadena, char caracter){
        this.cadena =  cadena;
        this.caracter = caracter;
    }

    //Sets y Gets
    public String getcadena(){
        return cadena;
    }    
    public void setcadena(String cadena){
        this.cadena = cadena;
    }    
    public char getcaracter(){
        return caracter;
    }    
    public void setcaracter(char caracter){
        this.caracter = caracter;
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
        //Creamos un Array del tamano que contamos de Caracteres
        String [] cadena = new String[contador];        
        String temp ="";
        contador = 0;
        
        for(int i=0;i<passphrase.length();i++){
            if(passphrase.charAt(i)==caracter){
                cadena[contador] = temp;
                contador+=1;
                temp = "";
            }else{
                temp += passphrase.charAt(i);
            }
            
        }    
        
        return cadena;
    }
}

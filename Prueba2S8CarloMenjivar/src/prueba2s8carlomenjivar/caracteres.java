
package prueba2s8carlomenjivar;
import java.util.Random;
//ascii de caracteres 97 a - 122 z
//a 97- e - 101 - i - 105 - o - 111 - u - 117

public class caracteres {
    
    private final Random random =  new Random();
    int [] arregloChar;
    
    public void caracteres(int size, int min, int max){
        this.arregloChar = LlenarChar(size, min, max);
    }

    public int[] getArregloChar() {
        return arregloChar;
    }

    public void setArregloChar(int[] arregloChar) {
        this.arregloChar = arregloChar;
    }
    //Llena un arreglo de int size con numeros de 0-999
    public int [] LlenarChar(int size, int min,int max){
        
        int [] temp = new int[size];        
        for(int i = 0; i < temp.length; i++){
            temp[i] = this.random.nextInt(min, max);
        }        
        return temp;
    }
}

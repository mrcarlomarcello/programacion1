
package prueba2s8carlomenjivar;


public class Prueba2S8CarloMenjivar {

    static int menu = 0;
    static miscellaneous misc = new miscellaneous();
    static numeros num = new numeros();
    static caracteres caracter = new caracteres();
    
    public static void main(String[] args) {
        
        while(menu!=3){
            System.out.println("Ingrese 1 o 2, 3 para salir.");
            menu = misc.leerEntero();
            
            switch(menu){
                
                case 1 -> {
                    num.numeros(10);                    
                    int [] temp = num.bubbleSort(num.getArregloEnteros());                 
                    //BUBBLE implementation
                    misc.imprimirArray(temp);
                    for(int i=0; i<temp.length; i++){
                        temp = num.bubbleSort(temp);
                    }
                    misc.imprimirArray(temp);
                    
                    //contar los pares
                    int pares = 0;
                    for(int i = 0; i< temp.length; i++){if(temp[i]%2==0){pares++;}}
                    
                    System.out.println("cantidad de números pares: "+ pares);

                    //Imprimo el arreglo ordenado en mi metodo ordenSort
                    misc.imprimirArray(num.ordenSort(temp, pares));
                    
                    break;
                }
                case 2 -> {
                    caracter.caracteres(10, 97, 122);                   
                    int [] tempChar = caracter.getArregloChar();
                    misc.imprimirChar(tempChar);
                    
                    //bubble para los char
                    
                    for(int i=0; i< caracter.getArregloChar().length; i++){
                        tempChar = num.bubbleSort(caracter.getArregloChar());
                    }
                    //Aqui va el arreglo Ordenado
                    misc.imprimirChar(tempChar);
                    
                    int contadorVocales=0;
                    
                    //a 97- e - 101 - i - 105 - o - 111 - u - 117
                    for(int i=0; i<tempChar.length;i++){
                        if(tempChar[i] == 97 || tempChar[i] == 101 || tempChar[i] == 105 || tempChar[i] == 111 || tempChar[i] == 117){
                            contadorVocales++;
                        }
                    }
                    System.out.println("Vocales en el Arreglo: " + contadorVocales);
                    
                    int [] letrasOrdenadas = new int[tempChar.length];
                    
                    int ordenador = 0;
                    
                    //a 97- e - 101 - i - 105 - o - 111 - u - 117
                    for(int i=0; i<tempChar.length;i++){
                        if(tempChar[i] == 97 || tempChar[i] == 101 || tempChar[i] == 105 || tempChar[i] == 111 || tempChar[i] == 117){
                            letrasOrdenadas[ordenador] = tempChar[i];
                            ordenador++;
                        }
                    }
                    
                    for(int i=0; i<tempChar.length;i++){
                        if(tempChar[i] == 97 || tempChar[i] == 101 || tempChar[i] == 105 || tempChar[i] == 111 || tempChar[i] == 117){
                            //DO NOTHING
                        }else{
                            letrasOrdenadas[ordenador] = tempChar[i];
                            ordenador++;
                        }
                    }
                     misc.imprimirChar(letrasOrdenadas);
                    
                    break;
                    
                }
            }
        }
    }
    
}


package prueba2s8carlomenjivar;


public class numeros {
    
    private miscellaneous misc = new miscellaneous();    
    int [] arregloEnteros;
    int [] temp;

    public void numeros(int size){
        this.arregloEnteros = misc.LlenarEnteros(size, 9);        
    }
    
    //get
    public int[] getArregloEnteros() {
        return arregloEnteros;
    }
    
    //set
    public void setArregloEnteros(int[] arregloEnteros) {
        this.arregloEnteros = arregloEnteros;
    }       
    
    //Para ponerlos en Orden
    public int [] bubbleSort(int [] tempArray){
        
        this.temp = tempArray;
        
        for(int i = 0; i < tempArray.length; i++){
            int pos = i+1;
            int step = tempArray[pos];
            if(tempArray[i]>=step){
                tempArray[pos]=tempArray[i];
                tempArray[i]=step;
                //imprimirArray(tempArray);
            }
            if(pos==(tempArray.length-1)){i++;}
            
        }
        return tempArray;
    }
    
    //Para poner los pares primero
    public int [] ordenSort(int [] temp, int paresLimit){
        
        int [] paresPrimero = new int [temp.length];        
        int contpares = 0;
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i]%2==0){
                paresPrimero[contpares]=temp[i];
                contpares++;
            }
        }
                
        for(int i = 0; i < temp.length; i++){
            if(temp[i]%2!=0){
                paresPrimero[contpares]=temp[i];
                contpares++;
            }
        }
        
        
        return paresPrimero;
    }
}

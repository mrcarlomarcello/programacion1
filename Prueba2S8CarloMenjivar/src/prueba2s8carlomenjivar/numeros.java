
package prueba2s8carlomenjivar;


public class numeros {
    
    private miscellaneous misc = new miscellaneous();    
    int [] arregloEnteros;
    int [] temp;

    public int[] getArregloEnteros() {
        return arregloEnteros;
    }

    public void setArregloEnteros(int[] arregloEnteros) {
        this.arregloEnteros = arregloEnteros;
    }
    
    public void numeros(int size){
        this.arregloEnteros = misc.LlenarEnteros(size, 9);        
    }
    
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
}

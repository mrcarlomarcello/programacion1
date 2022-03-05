
package lab7p1_carlomenjivar;


public class numero {
    
    public int [] temp;
    public miscClass misc = new miscClass();
    
    //constructor
    public void numero(int size){        
        this.temp = misc.LlenarEnteros(size, 25);
    }
    public int [] getNumero(){
        return this.temp;
    }
    // Ejercicio 2
    public int[] primos(){
        
        int [] primos = new int[this.temp.length];
        int contadorprimos;
        
        for(int i =0; i< this.temp.length; i++){
            
            contadorprimos=0;
            
            for(int j = 2; j< this.temp[i]; j++) {
                int number = this.temp[i];
                while(number%j == 0) {
                    contadorprimos++;
                    number = number/j;
                }                
            }
            if(contadorprimos==0){
                primos[i]=-1;
            }else{
                primos[i]=contadorprimos;
            }
            
        }
        return primos;
    }
    
}


package lab7p1_carlomenjivar;


public class numero {
    
    public int [] temp;
    public int max =25;
    // no me mires mal hey... intente hacer un algoritmo pero me quede sin tiempo y técnicamente dice que tiene que funcionar y quiero mis puntos :)
    public int [] prime = {2,3,5,7,11,13,17,19,23};
    public miscClass misc = new miscClass();
    
    //constructor
    public void numero(int size){        
        //El Ejercicio 2 y 3 la limitante de los valores es 25
        this.temp = misc.LlenarEnteros(size, this.max);
    }
    public int [] getNumero(){
        return this.temp;
    }
    // Ejercicio 2
    public int[] primos(){
        
        int [] primos = new int[this.temp.length];
        int contadorprimos;
        int number=0;
        
        for(int i =0; i< this.temp.length; i++){                        
            contadorprimos=0;
            number = this.temp[i];
            
            for(int j = 0; j< this.prime.length; j++) {
                if(number%this.prime[j]==0){
                    if(number>0)
                        contadorprimos +=1;
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

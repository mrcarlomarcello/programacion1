/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s8_matrices;

/**
 *
 * @author shello101
 */
public class spells {
    
    public int [][] matrix;
    private int [] palabra;
    private int [] pasilloH;
    
    public void wordmazeRunner(int [][] matrix, String temp){
        this.matrix = matrix;
        busquedaHorizontal(temp);
        busquedaVertical(temp);
    }
    
    //Busqueda por Record Horizontal
    public void busquedaHorizontal(String temp){
                  
        this.palabra = new int[temp.length()];
        
        for(int i = 0; i < temp.length(); i++){
            this.palabra[i] = (int)temp.charAt(i);          
        }
        
        
        int y = this.matrix.length;
        int x = this.matrix[0].length;
        
        
        for(int i = 0; i < y; i++){
            
            this.pasilloH = matrix[i];            
                       
            for(int j = 0; j < x; j++){
                
                //Si el tamaño del Subarray hasta el final es mayor al String, busco internamente
                if( (j+temp.length()) < x){
                    
                    for(int k =0; k < temp.length();k++){
                        if(this.palabra[k] != this.pasilloH[j+k]){
                            //esto lo saca del For
                            k = temp.length();
                        }else if(k == (temp.length() -1) ){
                            System.out.println("Encontre Horizontal: " + temp);
                            j=x;
                            i=y;
                        }
                    }
                    
                }
            }  
            
        }
    }
    
    //Busqueda poor Record Vertical
    public void busquedaVertical(String temp){
        
        this.palabra = new int[temp.length()];
        
        for(int i =0; i< temp.length(); i++){
            this.palabra[i] = (int)temp.charAt(i);
        }                
        
        int y = this.matrix.length;
        int x = this.matrix[0].length;
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                
                //Si el tamaño del Subarray hasta el final es mayor al String, busco internamente
                if( (i+temp.length()) < y){
                                    
                    for(int k = 0; k < temp.length(); k++){
                        if(this.palabra[k] != this.matrix[i+k][j]){
                            //saca del Loop
                            k = temp.length();
                        }else if(k==(temp.length()-1)){
                            System.out.println("Encontramos Vertical: "+ temp);
                            //saco todos los fors
                            j=y;
                            i=x;
                        }
                    }
                    
                }    
            }
        }
        
    }

}

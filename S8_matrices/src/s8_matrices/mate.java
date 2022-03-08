
package s8_matrices;


public class mate {
    
    public void sandwich(int limit){
        String [][] sandwich = new String[limit][limit];
        
        for(int i = 0 ; i< limit; i++){
            for(int j=0; j < limit; j++){
                if(i==j){
                    sandwich[i][j] = "   ";
                }else if(i == 0 || j == 0 || i == (limit-1) || j == (limit-1)){
                    sandwich[i][j] = " * ";   
                }else if((j-1)==i){
                    sandwich[i][j] = " * ";
                }else if((j+1)==i){
                    sandwich[i][j] = " * ";
                }else {
                    sandwich[i][j] = " + ";   
                }                
            }
        }
        
        for(int i = 0 ; i< limit; i++){
            for(int j=0; j < limit; j++){
                System.out.print(sandwich[i][j]);
            }
            System.out.println();
        }
    }
}

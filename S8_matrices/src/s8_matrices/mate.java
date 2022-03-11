
package s8_matrices;
import java.util.Random;

public class mate {
    
    static final Random random =  new Random();
    public int [][] matrix;
    
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
    
    public String sandwich2(int limit){
        String [][] sandwich = new String[limit][limit];
        String sandwichtext = "";
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
        
        //for(int i = 0 ; i< limit; i++){
        //    for(int j=0; j < limit; j++){
        //        System.out.print(sandwich[i][j]);
        //    }
        //    System.out.println();
        //}
        
        for(int i = 0 ; i< limit; i++){
            for(int j=0; j < limit; j++){
                sandwichtext += sandwich[i][j];
            }
            sandwichtext += "\n";
        }
        return sandwichtext;        
    }
    
    public int [][] llenarMatriz(int x, int y){
        matrix =  new int [y][x];
        int row = matrix.length;
        int column = matrix[0].length;
        int cont = 0;
        for(int i =0; i < column; i++){
            for(int j =0; j < row ; j ++){
                matrix[j][i] =  cont;
                cont++;
            }
        }
        return matrix;
    }
    
    public void imprimirMatrix(int [][] temp){
        
        int row = temp.length;
        int column = temp[0].length;
        
        for (int i = 0; i < column ; i++){
            for (int j = 0; j < row; j++){
                if(temp[j][i]<10){
                    System.out.print("  " + temp[j][i] + " ");
                }else{
                    System.out.print(" " + temp[j][i] + " ");
                }
                
            }
            System.out.println();
        }
    }
}

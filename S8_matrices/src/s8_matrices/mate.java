
package s8_matrices;
import java.util.Random;

public class mate {
    
    static final Random random =  new Random();
    public int [][] matrix;
    
    public void matrix(int x, int y){
        this.matrix = new int [y][x];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
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
    
    public int [][] llenarMatrizOrdenada(int [][] temp){
        matrix =  temp;
        int row = matrix.length;
        int column = matrix[0].length;
        int cont = 0;
        for(int i =0; i < column; i++){
            for(int j =0; j < row ; j ++){
                matrix[i][j] =  cont;
                cont++;
            }
        }
        return matrix;
    }
    
    public int [][] llenarMatrix(int [][] temp){
        matrix =  temp;        
        int row = matrix.length;
        int column = matrix[0].length;        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column ; j++){matrix[i][j]=random.nextInt(9);}
        }
        
        return matrix;
    }
    
    public void imprimirMatrix(int [][] temp){
        
        int row = temp[0].length;
        int column = temp.length;
        
        for (int i = 0; i < column ; i++){
            for (int j = 0; j < row; j++){
                if(temp[i][j]<10){
                    System.out.print("  " + temp[i][j] + " ");
                }else{
                    System.out.print(" " + temp[i][j] + " ");
                }
                
            }
            System.out.println();
        }
    }
    
    public int [][] sumaFilas(int [][] temp){        
        int [][] sumFilas = new int[temp.length][1];
        int suma = 0;
        for(int i = 0; i < (temp.length); i++){
            for(int j = 0; j < temp[0].length; j++){
                suma += temp[i][j];
            }
            sumFilas[i][0] = suma;
            suma=0;
        }
        return sumFilas;
    }
    
    public int [][] sumaColumns(int [][] temp){        
        int [][] sumColumnas = new int[1][temp[0].length];
        int suma = 0;
        for(int j = 0; j < temp[0].length; j++){
            for(int i = 0; i < (temp.length); i++){
                suma += temp[i][j];
            }
            sumColumnas[0][j] = suma;
            suma=0;
        }
        return sumColumnas;
    }
    
    public void encontrarNumero(int [][] temp, int num){
        
        int row = temp[0].length;
        int column = temp.length;
        
        for (int i = 0; i < column ; i++){
            for (int j = 0; j < row; j++){
                if(temp[i][j]<10){
                    if(temp[i][j]==num){
                        System.out.print("  " + "X" + " ");
                    }else{
                        System.out.print("  " + temp[i][j] + " ");   
                    }                    
                }else{
                    System.out.print(" " + temp[i][j] + " ");
                }
                
            }
            System.out.println();
        }
    }
    
    public void yfunciondex(int [][] temp){
        
        int row = temp[0].length;
        int column = temp.length;
        
        for (int i = 0; i < column ; i++){
            for (int j = 0; j < row; j++){
                if(i==j){                
                    System.out.print(" " + 'X' + " ");
                }
                else{
                    System.out.print(" " + ' ' + " ");
                }                
            }
            System.out.println();
        }
    }
   
}


package s8_matrices;
import java.util.Random;
import java.util.ArrayList;

public class mate {
    
    static final Random random =  new Random();
    public int [][] matrix;
    public int [][] sopa;
    
    public void matrix(int x, int y){
        this.matrix = new int [y][x];
    }
    
    public void sopa(int x, int y){
        this.sopa =new int [y][x];
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
        this.matrix =  temp;        
        int row = this.matrix.length;
        int column = this.matrix[0].length;        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column ; j++){this.matrix[i][j]=random.nextInt(9);}
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
        
        //agregue este cambio para que imprimiera la funcion de Y graficamente correcta
        for (int i = column -1 ; i > 0 ; i--){
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
    
    //ascii de caracteres 97 a - 122 z
    //a 97- e - 101 - i - 105 - o - 111 - u - 117
    public int [][] llenarsopadeLetras(int [][] temp){
        this.sopa =  temp;        
        int row = this.sopa.length;
        int column = this.sopa[0].length;        
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column ; j++){this.sopa[i][j]=random.nextInt(97,122);}
        }        
        return this.sopa;
    }
    
    //Sopa creada
    public void imprimirSopa(int [][] temp){
        int row = temp[0].length;
        int column = temp.length;
        
        for (int i = 0; i < column ; i++){
            for (int j = 0; j < row; j++){
                if(temp[i][j]<10){
                    System.out.print("  " + (char)temp[i][j] + " ");
                }else{
                    System.out.print(" " + (char)temp[i][j] + " ");
                }
                
            }
            System.out.println();
        }
    }
   
    //ArraList
    public void ejemplodeArrayList(int size){
        
        ArrayList listaDeArreglos = new ArrayList();
                
        for(int i = 0; i<size; i++){
            listaDeArreglos.add(random.nextInt(9));
        }
        
        System.out.println(listaDeArreglos);
        
        System.out.println("Este es el tamaño del arreglo: " + listaDeArreglos.size());
        
        System.out.println("Vamos a ver si existe el 10 en el arreglo .contains(10): "+ listaDeArreglos.contains(10));
        
        System.out.println("Vamos a ver si existe el 9 en el arreglo .contains(9): "+ listaDeArreglos.contains(9));
        
        System.out.println("Vamos a ver si existe el 7 en el arreglo .contains(7): "+ listaDeArreglos.contains(7));
        
        System.out.println("Vamos a ver si existe el 6 en el arreglo .contains(6): "+ listaDeArreglos.contains(6));
        
        System.out.println("Vamos a ver si existe el 3 en el arreglo .contains(3): "+ listaDeArreglos.contains(3));
        
        System.out.println("Vamos a ver si existe el 1 en el arreglo .contains(1): "+ listaDeArreglos.contains(1));
        
        System.out.println("Vamos a remover la posicion 3 con el metodo .remove(3) : " + listaDeArreglos.get(3));
        
        listaDeArreglos.remove(3);
        
        System.out.println(listaDeArreglos);
        
    }
}

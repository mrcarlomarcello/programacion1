/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s7.bubblesorting;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author marcellomenjivarmontesdeoca
 */
public class S7BubbleSorting {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        //Creamos los arreglos Random
        int size = 100;
        int max = 99;
        int [] arregloDesorden = LlenarEnteros(size, max);
        int [] arregloOrdenado = new int[arregloDesorden.length];
        imprimirArray(arregloDesorden);
        
        
        //BUBBLE implementation
        for(int i=0; i<arregloDesorden.length; i++){
            arregloOrdenado = bubbleSort(arregloDesorden);
        }
        //pruebas
        System.out.println("Esta es la impresión de la variable el arreglo original after sorting");
        imprimirArray(arregloDesorden);
        System.out.println("Esta esta es la impresión de la segunda variable 'temp' que es la que debería de cambiar");
        imprimirArray(arregloOrdenado);
        
        // AGREGANDO SEARCHINDEX
        System.out.println("Ingresa un numero real: ");
        //Mi método para leer enteros            
        int buscarNumero = leerEntero();
        //Mi método para busqueda lineal, me retorba -1 si no encuentra el index
        int index = searchIndex(arregloOrdenado, buscarNumero);
        
        if(index != -1){
            System.out.println("Encontramos el index con nuestro metodo linear: " + index);
            System.out.println("El arreglo["+index+"]: "+arregloOrdenado[index]);
        }else{
            System.out.println("No encontramos tu número...");
        }
        
        // Binary search O Busqueda Binaria
        boolean found = binarySearch(arregloOrdenado, buscarNumero);
        System.out.println(found);
    }
    
    //Quiero un metodo para leer Enteros...
    public static int leerEntero(){
        while(!in.hasNextInt()){
            System.out.println("Ingresa un numero real...");
            in.nextLine();
        }
        int buscarnumero = in.nextInt();
        return buscarnumero;
    }
    
    //Llena un arreglo de int size con numeros de 0-999
    public static int [] LlenarEnteros(int size, int max){
        
        int [] temp = new int[size];        
        for(int i = 0; i < temp.length; i++){
            temp[i] = random.nextInt(max);
        }        
        return temp;
    }
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public static void imprimirArray(int [] temp){
        
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i]>99){
                System.out.print("["+temp[i]+"]");
            }else if(temp[i]>9){
                System.out.print("[ "+temp[i]+"]");
            }else{
                System.out.print("[ "+temp[i]+" ]");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    
    //sort tipo Bubble, pero tiene que correrse N cantidad de veces segun el length del arreglo... VER EL MAIN*
    public static int [] bubbleSort(int [] tempArray){
        
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
    
    //linear Sorting
    public static int searchIndex(int [] temp, int number){
        int index = -1;
        System.out.println("Length: "+ temp.length);
        
        for(int i= 0; i<temp.length;i++){
            System.out.println("Iter: "+i);
            if(temp[i]==number){
                index = i;
                break;
            }
        }
        return index;
    }
    
    //Binary Search (necesita estar sorteado)
    public static boolean binarySearch(int [] temp, int buscar){
        boolean found =false;
        int MIN=0;
        int MAX=temp.length;
        int index=MAX/2;
        
        while(found!=true){
            if(buscar==temp[index]){
                found = true;
                System.out.println("Elemento encontrado");
                break;
            }else if(buscar<temp[index]){
                MAX=index-1;
                index=(MAX-MIN)/2;
            }else if(buscar>temp[index]){
                MIN=index+1;
                index=(MAX-MIN)/2;
            }
                
        }
        
        if(found==false)
            System.out.println("Not found");
        return found;        
    }
    
}

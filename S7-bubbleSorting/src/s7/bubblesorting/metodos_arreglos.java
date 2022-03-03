/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7.bubblesorting;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author shello101
 */
//nota de cambio
public class metodos_arreglos {
    private Scanner in = new Scanner(System.in);
    private Random random = new Random();
    
    //Quiero un metodo para leer Enteros...
    public int leerEntero(){
        while(!in.hasNextInt()){
            System.out.println("Ingresa un numero real...");
            in.nextLine();
        }
        int buscarnumero = in.nextInt();
        return buscarnumero;
    }
    
    //Llena un arreglo de int size con numeros de 0-999
    public int [] LlenarEnteros(int size, int max){
        
        int [] temp = new int[size];        
        for(int i = 0; i < temp.length; i++){
            temp[i] = this.random.nextInt(max);
        }        
        return temp;
    }
    
    //imprime bonito Arreglos hasta XXX [ X ] [ XX] [XXX]
    public void imprimirArray(int [] temp){
        
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
    public int [] bubbleSort(int [] tempArray){
        
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
    public int searchIndex(int [] temp, int number){
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
    public boolean binarySearch(int [] temp, int buscar){
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

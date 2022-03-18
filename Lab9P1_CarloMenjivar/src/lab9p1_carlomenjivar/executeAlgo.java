
package lab9p1_carlomenjivar;


public class executeAlgo {
    
    public miscellaneous misc = new miscellaneous();
    public soneteo sone = new soneteo();
    public CRAI crai = new CRAI();
    
    public void ejercicio1(){        
        System.out.println("Ejercicio 1 - Zoneteo");
        int cant = misc.leerEntero("Ingrese la cantidad de IPs a Evaluar: ");        
        
        for(int i =0; i< cant && i<255; i++){
            
        }
        
    }
    
    public void ejercicio2(){
        
        int menu = 0;
        
        while(menu!=6){
            crai.printmenu();
            menu = misc.leerEntero("Ingrese qué opción quiere: ");
            
            switch(menu){
                case 1:
                    
                    //Agregar Usuario
                    String usuario = misc.leerCadena("Ingrese un usuario: ");
                    crai.agregarUsuario(usuario);
                    crai.imprimir(1);                    
                    System.out.println();
                    break;
                case 2:
                    
                    //Agregar Libro
                    String libro = misc.leerCadena("Ingrese un Libro: ");
                    crai.agregarLibro(libro);
                    crai.imprimir(2);                    
                    System.out.println();
                    break;
                    
                case 3:                    
                    //Eliminar
                    crai.imprimir(1);
                    int elim = misc.leerEntero("elige un Usuario para eliminar");
                    crai.eliminar(elim);
                    crai.imprimir(4);    
                    System.out.println();
                    break;
                case 4:
                    //Asignar
                    crai.imprimir(1);
                    int user = misc.leerEntero("elige User");
                    crai.imprimir(2);
                    int book = misc.leerEntero("elige un Book");
                    crai.asignar(user, book);
                    crai.imprimir(3);
                    System.out.println();
                    break;                    
                case 5:
                    //Listar
                    crai.imprimir(4);
                    System.out.println();
                    break;
            }
            
        }
    }
    
}

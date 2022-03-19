
package lab9p1_carlomenjivar;
import java.util.ArrayList;

public class CRAI {
    private ArrayList <String> listaUsuarios = new ArrayList();
    private ArrayList <String> librosDisponibles = new ArrayList();
    private ArrayList <String> librosUsuarios = new ArrayList();

    //Setter y Getters
    public ArrayList<String> getListaUsuarios() {
        return listaUsuarios;
    }    
    
    public void setListaUsuarios(ArrayList<String> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<String> getLibrosDisponibles() {
        return librosDisponibles;
    }

    public void setLibrosDisponibles(ArrayList<String> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public ArrayList<String> getLibrosUsuarios() {
        return librosUsuarios;
    }

    public void setLibrosUsuarios(ArrayList<String> librosUsuarios) {
        this.librosUsuarios = librosUsuarios;
    }
    //Fin de Setters y Getters
    
    
    public void printmenu(){
        System.out.println("Bienvenido al CRAI");
        System.out.println();
        System.out.println("1 -  Agrega Usuario");
        System.out.println("2 -  Agrega Libro");
        System.out.println("3 -  Elimina");
        System.out.println("4 -  Asignar");
        System.out.println("5 -  Listar");
        System.out.println("6 -  salir");
    }
    
    public void agregarUsuario(String temp){
        this.listaUsuarios.add(temp);
        this.librosUsuarios.add("");
        System.out.println("Listo, se ha agregado "+temp);
        System.out.println();
    }
    
    public void agregarLibro(String temp){
        this.librosDisponibles.add(temp);
        System.out.println("Listo, se ha agregado el libro: "+temp);
        System.out.println();
    }
    
    public void eliminar(int pos){
        
        if( !listaUsuarios.isEmpty() && pos < listaUsuarios.size()){
            this.librosDisponibles.add(this.librosUsuarios.get(pos));
            this.librosUsuarios.remove(pos);
            this.listaUsuarios.remove(pos);
            System.out.println("Listo el usuario se ha eliminado.");
            System.out.println();
        }                
    }
    
    public void asignar(int pos, int posEliminar){
        this.librosUsuarios.set(pos, this.librosDisponibles.get(posEliminar));
        this.librosDisponibles.remove(posEliminar);
        System.out.println("Libro Asignado!");  
        System.out.println();
    }
    
    public void imprimir(int option){
        
        if(option ==1 || option == 4){
            System.out.println("Lista de Usuarios: ");
            for(int i = 0; i < this.listaUsuarios.size(); i++){ System.out.println(i +" - "+ this.listaUsuarios.get(i)); }
            System.out.println("-----------------");
            System.out.println();
        }
        if(option ==2 || option == 4){
            System.out.println("Lista de Libros Disponibles: ");
            for(int i = 0; i < this.librosDisponibles.size(); i++) { System.out.println(i +" - "+ this.librosDisponibles.get(i)); }
            System.out.println("-----------------");
            System.out.println();
        }
        if(option == 3 || option == 4){
            System.out.println("Lista de Usuarios y Libros");
            for(int i = 0; i < this.librosUsuarios.size(); i++) { System.out.println(i +" - "+this.listaUsuarios.get(i)+" - "+this.librosUsuarios.get(i)); }
            System.out.println("-----------------");
            System.out.println();
        }                              
    }
    
}

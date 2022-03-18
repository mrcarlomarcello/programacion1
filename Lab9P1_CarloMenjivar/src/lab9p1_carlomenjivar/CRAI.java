
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
}

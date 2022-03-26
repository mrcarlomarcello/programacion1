
package examen2p1_carlomenjivar20551123;
import javax.swing.JOptionPane;


public class miscellaneous {
    
    public int dialogLeerEntero(){               
        int buscarnumero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Número: "));
        return buscarnumero;        
    }
    
    public String dialogLeerFrase(){        
        String frase =JOptionPane.showInputDialog("Ingresa una frase");        
        return frase;       
    }
    
}

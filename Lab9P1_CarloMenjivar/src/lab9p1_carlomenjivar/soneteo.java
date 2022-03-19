
package lab9p1_carlomenjivar;
import java.util.ArrayList;

public class soneteo {        
    
    private ArrayList <String> listaAceptadaIPs = new ArrayList();
    private ArrayList <String> listaDenegada = new ArrayList();
    private String primerIP ="172.19.20.0";
    private String ultimaIP="172.19.20.63";
    
    //Setters y Getters
    public ArrayList<String> getListaAceptadaIPs() {
        return listaAceptadaIPs;
    }

    public void setListaAceptadaIPs(ArrayList<String> listaAceptadaIPs) {
        this.listaAceptadaIPs = listaAceptadaIPs;
    }

    public ArrayList<String> getListaDenegada() {
        return listaDenegada;
    }

    public void setListaDenegada(ArrayList<String> listaDenegada) {
        this.listaDenegada = listaDenegada;
    }

    public String getPrimerIP() {
        return primerIP;
    }

    public void setPrimerIP(String primerIP) {
        this.primerIP = primerIP;
    }

    public String getUltimaIP() {
        return ultimaIP;
    }

    public void setUltimaIP(String ultimaIP) {
        this.ultimaIP = ultimaIP;
    }
    //fin de Setters y Getters            
    
    public void validarIP(String temp){                        
        if(temp.length() == 11 || temp.length() == 12){
            if(temp.substring(0, 10)==this.primerIP.substring(0, 10)){
                try{
                     int rango= Integer.parseInt(temp.substring(10, temp.length()));
                     System.out.println(rango);
                     if(rango>0 && rango<63){
                         this.listaAceptadaIPs.add(temp);
                     }else{this.listaDenegada.add(temp);}
                     
                }catch(Exception e){
                    this.listaDenegada.add(temp);
                }                
            }else{this.listaDenegada.add(temp);}            
        }else{this.listaDenegada.add(temp);}              
    }        
    public void imprimirTabla(){        
        System.out.println("-- IP's Aceptadas -- ");
        for(int i = 0; i < this.listaAceptadaIPs.size(); i++){System.out.println(this.listaAceptadaIPs.get(i));}
        
        System.out.println("-- IP's Denegadas -- ");
        for(int i = 0; i < this.listaDenegada.size(); i++){System.out.println(this.listaDenegada.get(i));}
    }        
}

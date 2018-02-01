package boletin18;

import java.util.ArrayList;

public class Buzon {
    
    private ArrayList<Correo> correos = new ArrayList<>();

    // Set's y Get's
    
    public ArrayList<Correo> getCorreos() {
        
        return correos;
    }

    public void setCorreos(ArrayList<Correo> correos) {
        
        this.correos = correos;
    }
    
    // Devuelve el número de correos
    
    public int numCorreos(){
        
        return correos.size();
    }
    
    // Permite añadir un Correo nuevo al Buzon (al ArrayList)
    
    public void engade(Correo c){
        
        correos.add(c);
    }
    
    // Devuelve si hay mensaje por leer
    
    public boolean porLeer(){
        
        boolean leidos = true;
        
        for(Correo objeto: correos){
            
            if(objeto.isLeido() == false){
                
                leidos = false; break;
            }
        }
        
        return leidos;
    }
    
    // Muestro el primer correo sin leer y lo cambia a leido
    
    public String amosaPrimerNoLeido(){
        
        String mensaje = "Todos los Correos han sido leidos.";
        
        for(Correo correo: correos){
            
            if(correo.isLeido() == false){
                
                correo.setLeido(true);
                mensaje = correo.getMensaje();
                break;
            }
        }
        
        return mensaje;
    }
    
    // Muestro el correo en la posicion X de la lista
    
    public String amosa(int pos){
        
        String mensaje = "No existe el correo que quieres visualizar.";
        
        if(pos > correos.size()){
            
        } else {
            correos.get(pos-1).setLeido(true);
            mensaje = correos.get(pos-1).getMensaje();
        }
        
        
        return mensaje;
    }
    
    // Elimino el correo en la posicion X de la lista
    
    public void eliminar(int pos){
        
        if(pos > correos.size()){
            
            System.out.println("No existe el mensaje que quieres eliminar");
        } else {
            correos.remove(pos-1);
        }
        
    }
    
}

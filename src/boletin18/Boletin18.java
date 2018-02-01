package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {
        
        // Inicializo un Buzon
        
        Buzon buzon1 = new Buzon();
        
        // Creo una lista de Correos

        ArrayList<Correo> correos = new ArrayList<>();
        
        // Añado los correos la lista
        
        Correo correo1 = new Correo("Mensaje del Correo 1");
        correos.add(correo1);
        Correo correo2 = new Correo("Mensaje del Correo 2");
        correos.add(correo2);
        Correo correo3 = new Correo("Mensaje del Correo 3");
        correos.add(correo3);
        Correo correo4 = new Correo("Mensaje del Correo 4");
        correos.add(correo4);
        Correo correo5 = new Correo("Mensaje del Correo 5");
        correos.add(correo5);
        Correo correo6 = new Correo("Mensaje del Correo 6");
        correos.add(correo6);
        Correo correo7 = new Correo("Mensaje del Correo 7");
        correos.add(correo7);
        
        // Pregunto si quiere cargar los correos creados por defecto
        
        String cargarCorreos = "No";
        
        try{
            
            cargarCorreos = JOptionPane.showInputDialog("Han llegado nuevos correos. ¿Deseas cargarlos? (Si | No)");
        }finally {
            
            if(cargarCorreos == null){
                cargarCorreos ="No";
            }
        }
        
        switch(cargarCorreos){
            case "Si": buzon1.setCorreos(correos); break;
            case "No": break;
            default: buzon1.setCorreos(correos); break;
        }
        
        boolean exit = false;
        
        do {
            
            String opcion = "7";
            
            try{
                opcion = JOptionPane.showInputDialog("Opciones:\n "
                    + "1) Mostrar Nº de Correos\n "
                    + "2) Añadir un nuevo Correo\n"
                    + "3) Mostrar si hay mensajes sin leer\n"
                    + "4) Mostrar primer correo sin leer\n"
                    + "5) Mostrar un Correo\n"
                    + "6) Eliminar un Correo\n"
                    + "7) Salir");
            }finally {
                
                if(opcion == null){
                    opcion = "7";
                }
            }
            
        switch(opcion){
            case "1":
                // Muestro el número de correos en el buzon
        
                System.out.format("Hay %d correos en el buzon\n", buzon1.getCorreos().size()); break;
            case "2":
                // Añade un correo nuevo al Buzon
        
                Correo correo8 = new Correo(JOptionPane.showInputDialog("Escribe el mensaje del nuevo correo"));
                buzon1.engade(correo8); break;
            case "3":
               // Muestra si hay mensajes por leer
        
                if (buzon1.porLeer() == false){
            
                    System.out.println("Hay mensajes sin leer.");
                } else {
            
                    System.out.println("Todos los mensajes han sido leidos.");
                } break;
            case "4":
                // Muestra el primer correo sin leer
        
                System.out.println("Mensaje --> " + buzon1.amosaPrimerNoLeido()); break;
            case "5":
                // Muestra el mensaje de la posición que se le pasa
        
                System.out.println(buzon1.amosa(Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de mensaje que quieras leer.")))); break;
            case "6":   
                // Elimina el mensaje de la posición que se le pasa
        
                buzon1.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de mensaje que quieras eliminar."))); break;
            case "7":
                // Sale del bucle de preguntas
                
                exit = true; break;
        }
        
        
        
        } while(exit == false);

    }
    
}

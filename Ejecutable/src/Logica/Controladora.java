
package Logica;

import Persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
    public void crearEmpleado(Empleado unEmpleado){
        controlPersistencia.crearEmpleado(unEmpleado);
    }
     
    public void crearUsuario(Usuario unUsuario){
        controlPersistencia.crearUsuario(unUsuario);
    }
    
    public void crearJuego(Juego unJuego){
        controlPersistencia.crearJuego(unJuego);
    }
    
    public void crearHorario(Horario unHorario){
        controlPersistencia.crearHorario(unHorario);
    }
}

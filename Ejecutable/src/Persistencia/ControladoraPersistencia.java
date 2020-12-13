
package Persistencia;

import Logica.Empleado;
import Logica.Horario;
import Logica.Juego;
import Logica.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {

    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    JuegoJpaController juegoJPA = new JuegoJpaController();
    HorarioJpaController horarioJPA = new HorarioJpaController();

    public void crearEmpleado(Empleado unEmpleado) {
        try {
            empleadoJPA.create(unEmpleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearUsuario(Usuario unUsuario) {
        try {
            usuarioJPA.create(unUsuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearJuego(Juego unJuego){
        juegoJPA.create(unJuego);
    }
    
    public void crearHorario(Horario unHorario){
        try {
            horarioJPA.create(unHorario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

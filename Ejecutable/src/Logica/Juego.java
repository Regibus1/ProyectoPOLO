
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Juego implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idJuego;
    @Basic
    private String nombreJuego;
    private int capacidadMax;
    private int edadMinima;
    @OneToOne
    private Horario unHorario;
    @OneToMany
    private List<Empleado> listaEmpleados;

    public Juego() {
    }

    public Juego(int idJuego, String nombreJuego, int capacidadMax, int edadMinima, Horario unHorario, List<Empleado> listaEmpleados) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        this.capacidadMax = capacidadMax;
        this.edadMinima = edadMinima;
        this.unHorario = unHorario;
        this.listaEmpleados = listaEmpleados;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
}

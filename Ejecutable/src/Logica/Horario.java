
package Logica;

import java.io.Serializable;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario implements Serializable {
    
    @Id
    int idHorario;
    @Temporal(TemporalType.TIME)
    Time horaApertura;
    @Temporal(TemporalType.TIME)
    Time horaCierre;

    public Horario() {
    }

    public Horario(int idHorario, Time horaApertura, Time horaCierre) {
        this.idHorario = idHorario;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public Time getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Time getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }
    
    
}

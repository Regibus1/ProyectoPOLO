
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable {
    
    @Id
    private int idUsuario;
    @Basic
    private String username;
    private String password;
    @OneToOne
    Empleado unEmpleado;
    
    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String password, Empleado unEmpleado) {
        this.idUsuario = idUsuario;
        this.username = username;
        this.password = password;
        this.unEmpleado = unEmpleado;
    }

    public Empleado getUnEmpleado() {
        return unEmpleado;
    }

    public void setUnEmpleado(Empleado unEmpleado) {
        this.unEmpleado = unEmpleado;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

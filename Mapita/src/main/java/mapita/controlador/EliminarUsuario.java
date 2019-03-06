/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapita.controlador;

import com.mycompany.mapita.Mapita;
import com.mycompany.mapita.UsuarioDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ailyn
 */
@ManagedBean
public class EliminarUsuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String contrasenia;
    private Date fechanacimiento;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void eliminaUsuario(){
        UsuarioDAO udb= new UsuarioDAO();
        Mapita us=udb.find(Mapita.class,idUsuario);
        if(us!=null)
            udb.delete(us);
        
    }
}

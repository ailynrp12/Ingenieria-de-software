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
public class ActualizaUsuario {
    private int IdUsuario;
     private String nombre;
     private String correo;
     private String contrasenia;
     private Date fechanacimiento;
     
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
     
    public void actualizaUsuario(){
        UsuarioDAO udb= new UsuarioDAO();
        Mapita u= udb.find(Mapita.class,IdUsuario);
        if (u!=null){
            u.setIdusuario(IdUsuario);
            if(nombre!= null|| nombre!= "")
                u.setNombre(nombre);
            if(contrasenia!= null|| contrasenia!= "")
                u.setContrasenia(contrasenia);
            if(correo!= null|| correo!= "")
                u.setCorreo(correo);
            if(fechanacimiento!= null)
                u.setFechaNacimiento(fechanacimiento);
            udb.update(u);
        }
    }
}

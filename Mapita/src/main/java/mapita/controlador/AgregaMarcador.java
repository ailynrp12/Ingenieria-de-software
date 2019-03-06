/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapita.controlador;

import com.mycompany.mapita.Mapita;
import com.mycompany.mapita.Marcador;
import com.mycompany.mapita.MarcadorDAO;
import com.mycompany.mapita.UsuarioDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ailyn
 */
@ManagedBean
public class AgregaMarcador {
    private int usuario;
    private String descripcion;
    private double longitud;
    private double latitud;

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    public void agregarMarcador(){
        Marcador m = new Marcador();
        UsuarioDAO u = new UsuarioDAO();
        m.setLatitud(latitud);
        m.setIdusuario(usuario);
        m.setDescripcion(descripcion);
        m.setLongitud(longitud);
        MarcadorDAO udb = new MarcadorDAO();
        udb.save(m);
    }
}

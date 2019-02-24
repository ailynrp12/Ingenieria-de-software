/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapita.controlador;

import com.mycompany.mapita.Marcador;
import com.mycompany.mapita.MarcadorDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ailyn
 */
@ManagedBean
public class ActualizaMarcador {
    private int idmarcador;
    private String descripcion;
    private Double longitud;
    private Double latitud;
    private int idusuario;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    
    public void actualizaMarcador(){
        MarcadorDAO mdao = new MarcadorDAO();
        Marcador m = mdao.find(Marcador.class, getIdmarcador());
        if(getDescripcion() != null)
            mdao.update(m);
        if(getLongitud() !=  0)
            mdao.update(m);
        if(getLatitud() !=  0)
            mdao.update(m);
    }
}

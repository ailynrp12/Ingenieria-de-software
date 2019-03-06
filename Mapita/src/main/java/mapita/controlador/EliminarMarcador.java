/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapita.controlador;

import com.mycompany.mapita.Mapita;
import com.mycompany.mapita.Marcador;
import com.mycompany.mapita.MarcadorDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author ailyn
 */
@ManagedBean
public class EliminarMarcador {
    private int idmarcador;
    private int idusuario;
    private String descripcion;
    private double longitud;
    private double latitud;

    public int getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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
    
    public void eliminarMarcador(){
        MarcadorDAO udb = new MarcadorDAO();
        Marcador m = udb.find(Marcador.class,idmarcador);
        if(m != null){
            udb.delete(m);
        }
    }
    
}

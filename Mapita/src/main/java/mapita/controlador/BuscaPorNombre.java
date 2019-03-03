/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapita.controlador;
import com.mycompany.mapita.Mapita;
import com.mycompany.mapita.UsuarioDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ailyn
 */
@ManagedBean
//@SessionScoped
public class BuscaPorNombre {
     private String nombre;
    
    private List<Mapita> resultado;

    public List<Mapita> getResultado() {
        return resultado;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String buscaPorNombre(){
        if(nombre.equals(""))
            return "";
        UsuarioDAO ubd = new UsuarioDAO();
        resultado =  ubd.buscaPorNombre(nombre);
        return "resultado?faces-redirect=true";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapita;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author ailyn
 */
public class UsuarioDAO extends AbstractDAO<Mapita> {

    
    
    public UsuarioDAO(){
        super();
    }
    
    @Override
    public void save(Mapita m){
        super.save(m);
        
    }
    
    @Override
    public void update(Mapita m){
        super.update(m);
    }
    
    @Override
    public void delete(Mapita m){
        super.delete(m);
        
    }
    
    @Override
    public Mapita find(Class clazz, int id){
        return super.find(Mapita.class, id);
        
    }
    
    @Override
    public List<Mapita> findAll(Class clazz){
        return super.findAll(Mapita.class);
    }
}

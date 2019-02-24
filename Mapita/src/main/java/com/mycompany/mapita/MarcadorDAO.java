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
public class MarcadorDAO extends AbstractDAO<Marcador>{
   
    
    public MarcadorDAO(){
        super();
    }
    
    @Override
    public void save(Marcador m){
        super.save(m);
    }
    
    @Override
    public void update(Marcador m){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(m);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
            e.printStackTrace();
            
        }finally{
            session.close();
            
        }
    }
    
    @Override
    protected void delete(Marcador m){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(m);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
            e.printStackTrace();
            
        }finally{
            session.close();
            
        }
    }
    
    @Override
    public Marcador find(Class clazz, int id){
        
       return super.find(Marcador.class, id);
        
    }
    
    @Override
    public List<Marcador> findAll(Class clazz){
        return super.findAll(Marcador.class);
     
    }
}

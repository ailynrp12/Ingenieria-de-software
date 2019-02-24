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
    protected SessionFactory sessionFactory;
    
    
    public UsuarioDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public void save(Mapita obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.save(obj);
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
    public void update(Mapita obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(obj);
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
    public void delete(Mapita obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(obj);
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
    public Mapita find(Class clazz, int id){
        Mapita obj = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            obj = (Mapita)session.get(clazz,id);
            tx.commit();
            
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return obj;
        
    }
    
    @Override
    public List<Mapita> findAll(Class clazz){
        List<Mapita> obj = null;
        Session session = this.sessionFactory.getCurrentSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From" + clazz;
            Query query = session.createQuery(hql);
            obj = (List<Mapita>)query.list();
            tx.commit();
            
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return obj;
    }
}

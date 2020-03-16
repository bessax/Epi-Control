/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.epicontrol.Persistence;

import br.epicontrol.Model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Andre Bessa
 */
public class PersistenciaFuncionario {
    @PersistenceContext(unitName = "epicontrolPU")
     private EntityManager em =null;
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("epicontrolPU");

    public PersistenciaFuncionario() throws Exception {        
        em = emf.createEntityManager();
    }    
  
    public void createFuncionario(Funcionario funcionario) throws Exception  {
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }

    public Funcionario searchById(Integer id)throws Exception {
        return em.find(Funcionario.class, id);
    }
    
    public Funcionario searchByLoginPassword (String login, String password) throws Exception {
       //@NamedQuery(name = "Funcionario.findByLoginAndPassword", query = "SELECT f FROM Funcionario f WHERE f.senha = :senha and f.login = :login"), 
        List<Object> obj = null;
        Query query = em.createNamedQuery("Funcionario.findByLoginAndPassword");
        query.setParameter("login", login);
        query.setParameter("senha", password);         
        obj =  query.getResultList();
        this.close();
        return (Funcionario)obj.get(0); 
    }    
   
    public void updateFuncionario(Funcionario funcionario) {
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();
    }

    public void removeFuncionario(Funcionario funcionario) {
        em.getTransaction().begin();
        em.remove(funcionario);
        em.getTransaction().commit();
    }

    public List<Funcionario> getAll() {
        Query query = em.createQuery("select a from Funcionario a");
        List<Funcionario> list = query.getResultList();
        return list;
    }
    
    public ArrayList<Funcionario> getTodos() {
        Query query = em.createQuery("select a from Funcionario a");
        List list = query.getResultList();
        return (ArrayList<Funcionario>)list;
    }

    public void close() {
        em.close();
    }

    public Funcionario searchById2(int parseInt) {
        Object obj = null;
        Query query = em.createNamedQuery("Funcionario.findByCodigo");
        query.setParameter("codigo", parseInt);               
        obj =  query.getSingleResult();
        this.close();
        return (Funcionario)obj; 
    }

    
}

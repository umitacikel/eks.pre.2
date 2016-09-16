/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eksamenspreparation_jpa2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class Facade {
    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;

    }

    EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    EntityManager em = getEntityManager();

    
    public Student findStudent(int nr){
     try {
            return em.find(Student.class, nr);
        } finally {
            em.close();
        }
    }
     public Person findPerson(String firstName){
     try {
            return em.find(Person.class, firstName);
        } finally {
            em.close();
        }
    }
     public Employee findEmployee(int nr){
     try {
            return em.find(Employee.class, nr);
        } finally {
            em.close();
        }
    }
    
    public Person addPerson(String firstName){
    
    try {
            em.persist(firstName);
        } finally {
            em.close();
        }
        return null;
    }
    
    
    public Person deletePerson(String firstName){
    try {
            em.remove(firstName);
        } finally {
            em.close();
        }
        return null;
    
    }
}

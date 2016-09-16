/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eksamenspreparation_jpa2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    
    int nr;
    float wage;
    String taxClass;

    @OneToOne
    private Person pr;
    
    @Override
    public String toString() {
        return "Employee{" + "soSecNr=" + nr + ", wage=" + wage + ", taxClass=" + taxClass + '}';
    }

    public int getSoSecNr() {
        return nr;
    }

    public void setSoSecNr(int soSecNr) {
        this.nr = soSecNr;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }
}

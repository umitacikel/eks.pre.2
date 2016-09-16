/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.eksamenspreparation_jpa2;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
    @Id
    int Nr;
    Date Date;
  
    @OneToOne
    private Person per;
    
    
    @Override
    public String toString() {
        return "Student{" + "matNr=" + Nr + ", matDate=" + Date + '}';
    }

    public int getMatNr() {
        return Nr;
    }

    public void setMatNr(int matNr) {
        this.Nr = matNr;
    }

    public Date getMatDate() {
        return Date;
    }

    public void setMatDate(Date matDate) {
        this.Date = matDate;
    }
    
}

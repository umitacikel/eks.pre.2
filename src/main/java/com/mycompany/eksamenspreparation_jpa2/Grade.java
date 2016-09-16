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
public class Grade {

    @OneToOne(mappedBy = "grad")
    private Person person;

  @Id
  String name;
  int value;

    @Override
    public String toString() {
        return "Grade{" + "name=" + name + ", value=" + value + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
  
}

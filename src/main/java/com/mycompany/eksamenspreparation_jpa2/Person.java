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
public class Person {

    @OneToOne(mappedBy = "per")
    private Student student;
   @Id
   String firstName;
   String lastName;
   Date birthDate;
   int age;
   boolean isMarried;

    
    @OneToOne(mappedBy = "person")
   private Grade grad;
   
   
   
   
   
    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", age=" + age + ", isMarried=" + isMarried + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
   
   
   
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class Person {
    
    private int id;
    private String name;
    private String email;
    private int age;
    private int country;
    

    public Person() {
    }

    public Person(int id, String name, String email, int age, int country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
     public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }
}

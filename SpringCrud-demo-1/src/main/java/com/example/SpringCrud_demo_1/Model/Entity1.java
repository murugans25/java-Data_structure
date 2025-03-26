package com.example.SpringCrud_demo_1.Model;

import jakarta.persistence.*;
import lombok.Setter;


@Entity  // its class connected to the maping database table
//@Table(name = "users") // Ensure this matches your database table name
public class Entity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Ensure ID is auto-generated

    private String name;
    private String email;
    private int mobileno;
    public int rollno;

    public Entity1(Long id, String name, String email, int mobileno) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileno = mobileno;
        this.rollno =rollno;
    }

    public Entity1() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public int getrollno() {

        return rollno;
    }

    public void setRollno(String email) {

        this.rollno= rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }
}

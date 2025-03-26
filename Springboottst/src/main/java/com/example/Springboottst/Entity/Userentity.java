package com.example.Springboottst.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class Userentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Using IDENTITY for auto-increment
    private int id;

    private String name;
    private String email;
    private  int rollno;
    private  int mobileno;
    public String dept ;

    public Userentity() {
    }

    public Userentity(int id, String name, String email, int rollno, int mobileno, String dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rollno = rollno;
        this.mobileno = mobileno;
        this.dept = dept;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

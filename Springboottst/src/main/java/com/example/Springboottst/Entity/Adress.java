package com.example.Springboottst.Entity;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.beans.ConstructorProperties;

@Entity
@Table(name="adress")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String city;

    @OneToOne(cascade = CascadeType.ALL)
    private Adress adress;

    public Adress() {
    }

    public Adress(String city, Long id, Adress adress) {
        this.city = city;
        this.id = id;
        this.adress = adress;
    }


}

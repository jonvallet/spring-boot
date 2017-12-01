package com.jonvallet.restdemo.model;


import javax.persistence.*;

@Entity
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;
    @Embedded
    public Contact contact;
}

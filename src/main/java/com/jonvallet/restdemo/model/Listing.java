package com.jonvallet.restdemo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Listing {
    @Id
    public String id = UUID.randomUUID().toString();
    @Embedded
    public Contact contact;
    @Embedded
    public Address address;
    @Embedded
    public Location location;
    @JsonIgnore
    public Date timestamp = new Date();
}

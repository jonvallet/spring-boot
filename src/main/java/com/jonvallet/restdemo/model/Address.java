package com.jonvallet.restdemo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    public String address;
    public String postalCode;
    public String countryCode;
    public String city;
    public String state;
    public String country;
}

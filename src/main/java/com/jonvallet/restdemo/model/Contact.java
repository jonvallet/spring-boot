package com.jonvallet.restdemo.model;

import com.jonvallet.restdemo.formmater.PhoneFormatter;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
    public String phone;

    public String getFormattedPhone() {
        return PhoneFormatter.format(phone);
    }
}

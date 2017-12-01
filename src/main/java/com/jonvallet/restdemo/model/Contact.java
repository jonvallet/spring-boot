package com.jonvallet.restdemo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
    public String phone;

    public String getFormattedPhone() {
        return "+44 "+phone;
    }
}

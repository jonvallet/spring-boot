package com.jonvallet.restdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Location {
    @JsonProperty("lat")
    @Column(scale = 16, precision = 20)
    public BigDecimal latitude;
    @JsonProperty("lng")
    @Column(scale = 16, precision = 20)
    public BigDecimal longitude;
}

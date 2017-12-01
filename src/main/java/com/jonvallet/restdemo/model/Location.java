package com.jonvallet.restdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Location {
    @JsonProperty("lat")
    public BigDecimal latitude;
    @JsonProperty("lng")
    public BigDecimal longitude;
}

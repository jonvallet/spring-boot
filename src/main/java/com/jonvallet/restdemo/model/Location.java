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

    public Location() {
    }

    public Location(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(double latitude, double longitude) {
        this(new BigDecimal(latitude), new BigDecimal(longitude));
    }

    public double distance(Location location) {

        int r = 6371; // average radius of the earth in km
        double dLat = Math.toRadians(location.latitude.doubleValue() - latitude.doubleValue());
        double dLon = Math.toRadians(location.longitude.doubleValue() - longitude.doubleValue());
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(latitude.doubleValue())) * Math.cos(Math.toRadians(location.latitude.doubleValue()))
                        * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return  r * c;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

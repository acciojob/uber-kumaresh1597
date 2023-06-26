package com.driver.model;

import javax.persistence.*;

@Entity
@Table
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pricePerKm;
    private boolean available;

    @OneToOne
    @JoinColumn
    private Driver driver;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPricePerKm() {
        return pricePerKm;
    }

    public void setPricePerKm(int pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
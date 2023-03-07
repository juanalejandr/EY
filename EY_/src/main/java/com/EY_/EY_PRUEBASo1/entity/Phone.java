package com.EY_.EY_PRUEBASo1.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Embeddable
@Entity
public class Phone {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "number", nullable = false)
    @JsonProperty(value = "Number")
    private int number;
    @Column(name = "cityCode", nullable = false, unique = true)
    @JsonProperty(value = "CityCode")
    private int cityCode;
    @Column(name = "contryCode", nullable = false, unique = true)
    @JsonProperty(value = "ContryCode")
    private int contryCode;


    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getContryCode() {
        return contryCode;
    }

    public void setContryCode(int contryCode) {
        this.contryCode = contryCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

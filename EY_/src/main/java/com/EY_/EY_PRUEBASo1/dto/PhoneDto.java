package com.EY_.EY_PRUEBASo1.dto;

import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;


public class PhoneDto implements Serializable {
    @NotEmpty(message = "el email no debe ser vacio o nulo")
    private int number;
    @NotEmpty(message = "el email no debe ser vacio o nulo")
    private int cityCode;
    @NotEmpty(message = "debe ingresar una contraseña valida")
    private int countryCode;

    public PhoneDto() {
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

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }
}

package com.EY_.EY_PRUEBASo1.dto;

import com.EY_.EY_PRUEBASo1.entity.Phone;
import jakarta.persistence.ElementCollection;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

import java.io.Serializable;
import java.util.ArrayList;

public class RegistroDto implements Serializable {



    @NotEmpty(message = "el email no debe ser vacio o nulo")
    private String name;
    @NotEmpty(message = "el email no debe ser vacio o nulo")
    @Email
    private String email;
    @NotEmpty(message = "debe ingresar una contraseña valida")
     private String password;
    @ElementCollection
    private ArrayList<PhoneDto> phones;

    public ArrayList<PhoneDto> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<PhoneDto> phones) {
        this.phones = phones;
    }

    public RegistroDto() {super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

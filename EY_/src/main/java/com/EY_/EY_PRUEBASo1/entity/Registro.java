package com.EY_.EY_PRUEBASo1.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;




import java.time.Instant;
import java.util.ArrayList;

import java.util.List;
import java.util.UUID;


    @Entity
    public class Registro {
        @Id
        @Column(name = "id", nullable = false)
        private UUID id;
        @Column(name = "name", nullable = false)
        @JsonProperty(value = "Name")
        private String name;
        @Column(name = "email", nullable = false, unique = true)
        @JsonProperty(value = "Email")
        private String email;
        @Column(name = "password", nullable = false)
        @JsonProperty(value = "Password")
        private String password;

        @OneToMany(mappedBy="id")
        @Column(name = "phones", nullable = false)
        @JsonProperty(value = "phones")
        private List<Phone> phones;


        @Column(name = "token")
        @JsonProperty(value = "Token")
        private String token;

        @Column
        private Instant date;

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Registro() {super();
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

        public List<Phone> getPhones() {
            return phones;
        }

        public void setPhones(List<Phone> phones) {
            this.phones = phones;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }
    }


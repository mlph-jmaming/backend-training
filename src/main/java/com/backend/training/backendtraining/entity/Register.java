package com.backend.training.backendtraining.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {

    @Id
    private String userName;
    private String email;
    private String password;
    private String fName;
    private String lName;

    @Override
    public String toString() {
        return super.toString();
    }
}

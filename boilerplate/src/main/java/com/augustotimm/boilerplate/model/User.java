package com.augustotimm.boilerplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @JsonProperty(value = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "user_name",  length = 50, nullable = false)
    @JsonProperty(value = "user_name")
    private String userName;


    @Column(name = "first_name",  length = 50, nullable = false)
    @JsonProperty(value = "first_name")
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    @JsonProperty(value = "last_name")
    private String lastName;

    public String getId() {return this.id;}
    
    public String getUserName() {return this.userName;}

    
    User(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    User(String id, String userName, String firstName, String lastName) {
        this(userName, firstName, lastName);
        this.id = id;
    }
}

package com.augustotimm.boilerplate.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
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
}

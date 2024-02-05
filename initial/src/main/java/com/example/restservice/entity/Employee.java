package com.example.restservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*
@Employee Fields
employee_id
first_name
last_name
email
title
 */
@Entity
public class Employee {
    @Id
    @Column(name=d")
    private int employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;
}

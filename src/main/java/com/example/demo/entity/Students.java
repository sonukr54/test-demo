package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int rollNo;
    private String address;
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public Students(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Students(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Students() {
    }

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getRollNo() {
        return rollNo;
    }
}

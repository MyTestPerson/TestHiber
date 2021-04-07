package com.mytest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user", schema = "TestKeyJoin")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Basic
    @Column(name = "name")
    private String name;


    @OneToOne(mappedBy = "user")
    @PrimaryKeyJoinColumn
    private Address address;

    // Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

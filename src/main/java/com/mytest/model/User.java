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
    private Address activated;

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

    public Address getActivated() {
        return activated;
    }

    public void setActivated(Address activated) {
        this.activated = activated;
    }
}

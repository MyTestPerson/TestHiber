package com.mytest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Address", schema = "TestKeyJoin")
public class Address implements Serializable {


    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;


    @Basic
    @Column(name = "city")
    private String city;


    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    // Getter and Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

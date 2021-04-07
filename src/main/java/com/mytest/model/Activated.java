package com.mytest.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "activated", schema = "hiber")
public class Activated implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    @Basic
    @Column(name = "active")
    private String active;



    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

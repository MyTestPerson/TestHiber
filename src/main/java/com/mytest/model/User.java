package com.mytest.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "users", schema = "hiber")
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Basic
    @Column(name = "username")
    private String username;


    @OneToOne(mappedBy = "user")
    @PrimaryKeyJoinColumn
    private Activated activated;

    // Getter and Setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Activated getActivated() {
        return activated;
    }

    public void setActivated(Activated activated) {
        this.activated = activated;
    }
}

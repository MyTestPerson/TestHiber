package com.mytest.controller;

import com.mytest.jpa.ServiceJpa;
import com.mytest.model.Activated;
import com.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JpaController {

    @Autowired
    ServiceJpa serviceJpa;

    @GetMapping(value = "/jpa")
    public String getJpa () {

        User user = new User();
        user.setId(2L);
        user.setUsername("Jack");
        serviceJpa.saveUser(user);

        Activated activated = new Activated();
        activated.setId(2L);
        activated.setActive("Active");
        serviceJpa.saveActivated(activated);

        return "/jpa";
    }
}

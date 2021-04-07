package com.mytest.controller;

import com.mytest.jpa.ServiceJpa;
import com.mytest.model.Address;
import com.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JpaController {

    @Autowired
    ServiceJpa serviceJpa;

    @GetMapping(value = "/saveUser")
    public String getJpa () {

        User user = new User();
        user.setId(1L);
        user.setName("Michael Joseph Jackson");
        serviceJpa.saveUser(user);

        Address address = new Address();
        address.setId(1L);
        address.setCity("Los Angeles");
        serviceJpa.saveActivated(address);

        return "/saveUser";
    }
}

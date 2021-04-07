package com.mytest.jpa;

import com.mytest.model.Address;
import com.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceJpa {


    @Autowired
    SaveUser saveUser;

    @Autowired
    SaveAddress saveAddress;



    public void saveUser(User user) {
        saveUser.save(user);
    }


    public void saveAddress(Address address) {
        saveAddress.save(address);
    }


}

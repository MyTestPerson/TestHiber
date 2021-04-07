package com.mytest.jpa;

import com.mytest.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveActivated extends JpaRepository<Address, Long> {
}

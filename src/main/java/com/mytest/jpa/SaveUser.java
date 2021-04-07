package com.mytest.jpa;

import com.mytest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveUser extends JpaRepository<User, Long> {
}

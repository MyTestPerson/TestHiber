package com.mytest.jpa;

import com.mytest.model.Activated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveActivated extends JpaRepository<Activated, Long> {
}

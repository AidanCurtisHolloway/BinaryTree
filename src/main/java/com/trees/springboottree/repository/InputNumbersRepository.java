package com.trees.springboottree.repository;

import com.trees.springboottree.entity.InputNumbers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputNumbersRepository extends JpaRepository<InputNumbers, Long> {
    // You can define custom query methods if needed
}

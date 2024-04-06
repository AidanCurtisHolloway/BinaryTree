package com.trees.springboottree.repository;

import com.trees.springboottree.entity.BinaryTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryTreeRepository extends JpaRepository<BinaryTree, Long> {
    // You can define custom query methods if needed
}

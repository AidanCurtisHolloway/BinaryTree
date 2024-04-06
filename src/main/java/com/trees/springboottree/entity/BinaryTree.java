package com.trees.springboottree.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class BinaryTree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String treeStructure;

    @ManyToOne
    @JoinColumn(name = "input_numbers_id")
    private InputNumbers inputNumbers;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTreeStructure() {
        return treeStructure;
    }

    public void setTreeStructure(String treeStructure) {
        this.treeStructure = treeStructure;
    }

    public InputNumbers getInputNumbers() {
        return inputNumbers;
    }

    public void setInputNumbers(InputNumbers inputNumbers) {
        this.inputNumbers = inputNumbers;
    }
}

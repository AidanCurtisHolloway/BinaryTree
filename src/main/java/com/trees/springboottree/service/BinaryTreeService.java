package com.trees.springboottree.service;

import com.trees.springboottree.entity.BinaryTree;
import com.trees.springboottree.entity.InputNumbers;
import com.trees.springboottree.repository.BinaryTreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BinaryTreeService {
    private final BinaryTreeRepository binaryTreeRepository;

    @Autowired
    public BinaryTreeService(BinaryTreeRepository binaryTreeRepository) {
        this.binaryTreeRepository = binaryTreeRepository;
    }

    // Method to save a binary tree to the database
    public BinaryTree saveBinaryTree(BinaryTree binaryTree) {
        return binaryTreeRepository.save(binaryTree);
    }

    // Method to construct a binary tree from input numbers
    public BinaryTree constructBinaryTree(InputNumbers inputNumbers) {
        // Logic to construct binary tree from input numbers
        // This is just a placeholder, you need to implement the actual logic
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setInputNumbers(inputNumbers);
        binaryTree.setTreeStructure("Binary tree structure JSON");
        return binaryTree;
    }

    // Method to retrieve all binary trees from the database
    public List<BinaryTree> getAllBinaryTrees() {
        return binaryTreeRepository.findAll();
    }

    public String treeToJson(BinaryTree tree) {
        return "";
    }

    public void saveTreeToDatabase(String numbers, BinaryTree tree) {
    }

    public BinaryTree constructTree(String[] numberArray) {
        return null;
    }

    public List<BinaryTree> getPreviousTrees() {
        return List.of();
    }
}

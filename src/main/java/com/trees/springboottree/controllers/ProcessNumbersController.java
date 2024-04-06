package com.trees.springboottree.controllers;

import com.trees.springboottree.entity.BinaryTree;
import com.trees.springboottree.service.BinaryTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProcessNumbersController {

    @Autowired
    private BinaryTreeService binarySearchTreeService; // Service to handle processing

    @PostMapping("/process-numbers")
    @ResponseBody
    public String processNumbers(@RequestBody String numbers) {
        // Assuming numbers are passed as a comma-separated string in the request body
        String[] numberArray = numbers.split(",");
        // Construct binary search tree
        BinaryTree tree = binarySearchTreeService.constructTree(numberArray);
        // Save tree to database
        binarySearchTreeService.saveTreeToDatabase(numbers, tree);
        // Return JSON representation of the tree
        return binarySearchTreeService.treeToJson(tree);
    }
}

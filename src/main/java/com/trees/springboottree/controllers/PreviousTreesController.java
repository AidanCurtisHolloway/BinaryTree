package com.trees.springboottree.controllers;

import com.trees.springboottree.entity.BinaryTree;
import com.trees.springboottree.service.BinaryTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PreviousTreesController {

    @Autowired
    private BinaryTreeService binaryTreeService; // Service to handle database operations

    @GetMapping("/previous-trees")
    public String showPreviousTrees(Model model) {
        // Retrieve previous trees from the database
        List<BinaryTree> previousTrees = binaryTreeService.getPreviousTrees();
        model.addAttribute("previousTrees", previousTrees);
        return "previous-trees"; // HTML page for displaying previous trees
    }
}

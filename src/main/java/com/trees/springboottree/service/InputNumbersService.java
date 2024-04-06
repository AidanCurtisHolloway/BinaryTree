package com.trees.springboottree.service;

import com.trees.springboottree.entity.InputNumbers;
import com.trees.springboottree.repository.InputNumbersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputNumbersService {
    private final InputNumbersRepository inputNumbersRepository;

    @Autowired
    public InputNumbersService(InputNumbersRepository inputNumbersRepository) {
        this.inputNumbersRepository = inputNumbersRepository;
    }

    public InputNumbers saveInputNumbers(InputNumbers inputNumbers) {
        return inputNumbersRepository.save(inputNumbers);
    }

    // Add other methods as needed
}

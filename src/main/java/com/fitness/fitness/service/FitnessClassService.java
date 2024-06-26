package com.fitness.fitness.service;

import com.fitness.fitness.model.FitnessClass;
import com.fitness.fitness.repository.FitnessClassRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FitnessClassService {

    @Autowired
    private FitnessClassRepo fitnessClassRepository;

    public FitnessClassService(FitnessClassRepo fitnessClassRepository) {
        this.fitnessClassRepository = fitnessClassRepository;
    }

    public List<FitnessClass> getAllClasses() {
        return fitnessClassRepository.findAll();
    }
}
    // pblic FitnessClass getFitnessClassById(int id) {
    //     return fitnessClassRepository.findById(id).orElse(null);
    // }




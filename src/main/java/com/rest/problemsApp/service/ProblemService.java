package com.rest.problemsApp.service;

import com.rest.problemsApp.model.Problem;
import com.rest.problemsApp.repository.ProblemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemService {
    private final ProblemRepository problemRepository;

    public ProblemService(ProblemRepository problemRepository) {
        this.problemRepository = problemRepository;
    }

    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    public Problem createProblem(Problem problem) {
        return problemRepository.insert(problem);
    }
}

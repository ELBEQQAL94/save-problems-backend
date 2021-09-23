package com.rest.problemsApp.controller;

import com.rest.problemsApp.model.Problem;
import com.rest.problemsApp.service.ProblemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/problems")
public class ProblemController {

    private final ProblemService problemService;

    public ProblemController(ProblemService problemService) {
        this.problemService = problemService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Problem> getAllProblems() {
        return problemService.getAllProblems();
    }

    @PostMapping
    public Problem createPorblem(@Valid @RequestBody Problem problem) {
        return problemService.createProblem(problem);
    }
}

package com.rest.problemsApp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Document
public class Problem {

    @Id
    private String id;

    @NotEmpty(message = "Title must to be not empty.")
    @NotNull(message = "Title is required")
    private String title;

    @NotNull(message = "Description is required")
    private String description;

    @NotNull(message = "Resources is required")
    private String resources;

    @NotNull(message = "ProblemDescription is required")
    private String problemDescription;

    @NotNull(message = "Solution is required")
    private String solution;
    private String user_id;

}

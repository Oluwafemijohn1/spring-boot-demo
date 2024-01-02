package com.ephemzy.springbootdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is the API layer
 * */
@RestController
@RequestMapping(path = "api/vi/student")
public class StudentController {

    private final StudentService studentService;

    /**
     * Command used for database.
     * docker exec -it postgress bash :- to open up database shell
     * psql -U amigoscode :- to connect to the user
     * \du :- to see the list of role in database
     * CREATE DATABASE student;
     * GRANT ALL PRIVILEGES ON DATABASE "student" TO amigoscode;
     * \c student
     * */

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
}

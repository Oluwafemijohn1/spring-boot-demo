package com.ephemzy.springbootdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


/**
 * This is Service layer
 * */

@Service // We could also use @Component but @Service has semantic meaning
public class StudentService {

    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "mariam",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }
}

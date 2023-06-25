package com.example.springboot.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/abc")
    public List<Course> retrive(){
        List<Course> lst = new ArrayList();
        Course c1 = new Course(1,"abc");
        Course c2 = new Course(2,"def");
        lst.add(c1);
        lst.add(c2);
        return lst;
    }

}

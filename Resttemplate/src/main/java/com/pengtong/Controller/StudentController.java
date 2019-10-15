package com.pengtong.Controller;

import com.pengtong.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @GetMapping("findStudentById")
    public Student findStudentById(long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findStudent?id={id}",Student.class,id).getBody();
    }

    @PostMapping("/addStudent")
    public Collection<Student> addStudent(Student student){
        return restTemplate.postForEntity("http://localhost:8010/student/addStudent",student,Collection.class).getBody();
    }



}

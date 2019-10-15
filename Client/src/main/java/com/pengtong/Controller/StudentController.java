package com.pengtong.Controller;

import com.pengtong.Service.StudentService;
import com.pengtong.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping("/addStudent")
    public Collection<Student> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return studentService.findAll();
    }

    @GetMapping("/deleteStudent")
    public Collection<Student> deleteStudent(long id){
        studentService.deleteStudentByid(id);
        return studentService.findAll();
    }

    @PostMapping("/updateStudent")
    public Collection<Student> updateStudent(long id, @RequestBody Student student){
        studentService.updateStudentByid(id, student);
        return studentService.findAll();
    }

    @GetMapping("/findStudent")
    public Student findStudent(long id){
        return studentService.findStudentByid(id);
    }

    @GetMapping("/getPort")
    public String getPort(){
        return "当前端口为：" + port;
    }
}

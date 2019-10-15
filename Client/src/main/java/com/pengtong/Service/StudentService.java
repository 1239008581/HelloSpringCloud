package com.pengtong.Service;

import com.pengtong.pojo.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {

    Collection<Student> findAll();

    int addStudent(Student student);

    int deleteStudentByid(long id);

    int updateStudentByid(long id, Student student);

    Student findStudentByid(long id);

}

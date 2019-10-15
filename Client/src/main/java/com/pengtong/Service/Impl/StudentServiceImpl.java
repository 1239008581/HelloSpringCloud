package com.pengtong.Service.Impl;

import com.pengtong.Service.StudentService;
import com.pengtong.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {

    private static Map<Long, Student> studentMap;

    static{
        studentMap = new HashMap<Long, Student>();
        studentMap.put(1L, new Student("张三", 20));
        studentMap.put(2L, new Student("李四", 21));
        studentMap.put(3L, new Student("王五", 22));
    }

    public Collection<Student> findAll() {
        return studentMap.values();
    }

    public int addStudent(Student student) {
        studentMap.put(4L,student);
        return 0;
    }

    public int deleteStudentByid(long id) {
        studentMap.remove(id);
        return 0;
    }

    public int updateStudentByid(long id, Student student) {
        studentMap.put(id, student);
        return 0;
    }

    public Student findStudentByid(long id) {
        return studentMap.get(id);
    }
}

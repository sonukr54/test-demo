package com.example.demo.service;


import com.example.demo.entity.Students;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentrepo;

    @Autowired
    StudentService(StudentRepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    Students s = new Students();

    public void saveStudent(Students st) {
        Students s = new Students();
        s.setName(st.getName());
        s.setRollNo(st.getRollNo());
        s.setAddress(st.getAddress());
        studentrepo.save(s);

    }

    public List<Students> returnStudents() {

        List<Students> studentList = studentrepo.findAll();
        return studentList;
    }


    public String deleteStudents(Students st) {
        studentrepo.deleteById(st.getId());
        return "studentDeleted";
    }
}

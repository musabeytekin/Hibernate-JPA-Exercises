package com.musabeytekin.hibernatejpa.dao;

import com.musabeytekin.hibernatejpa.entity.Student;

public interface StudentDAO {

    void save(Student student);
    Student findById(Integer id);


}

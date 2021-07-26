package com.myTask.task.repository;

import com.myTask.task.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

   @Repository
public interface StudentRepository extends MongoRepository<Student, String> {



    Student findByStudentNumber(long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpaDesc();

}

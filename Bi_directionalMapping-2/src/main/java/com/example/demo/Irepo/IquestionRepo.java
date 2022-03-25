package com.example.demo.Irepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Question;

public interface IquestionRepo extends JpaRepository<Question, Integer>{

}

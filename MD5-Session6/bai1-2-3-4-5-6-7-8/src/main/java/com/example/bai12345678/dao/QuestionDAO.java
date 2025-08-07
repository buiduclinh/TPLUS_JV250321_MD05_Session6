package com.example.bai12345678.dao;

import com.example.bai12345678.model.Question;
import org.springframework.stereotype.Repository;


public interface QuestionDAO {
    Question getRandomQuestion();

    boolean addQuestion(Question question);
}

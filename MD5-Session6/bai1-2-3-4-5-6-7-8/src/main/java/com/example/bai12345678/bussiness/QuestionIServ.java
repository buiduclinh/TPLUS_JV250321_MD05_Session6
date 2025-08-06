package com.example.bai12345678.bussiness;

import com.example.bai12345678.model.Question;

public interface QuestionIServ {
    Question getRandomQuestion();

    boolean addQuestion(Question question);
}

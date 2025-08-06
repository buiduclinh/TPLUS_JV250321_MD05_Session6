package com.example.bai12345678.bussiness.Impl;

import com.example.bai12345678.bussiness.QuestionIServ;
import com.example.bai12345678.dao.QuestionDAO;
import com.example.bai12345678.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionIServImpl implements QuestionIServ {
    @Autowired
    QuestionDAO questionDAO;

    @Override
    public Question getRandomQuestion() {
        return questionDAO.getRandomQuestion();
    }

    @Override
    public boolean addQuestion(Question question) {
        return questionDAO.addQuestion(question);
    }
}

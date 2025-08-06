package com.example.bai12345678.controller;

import com.example.bai12345678.dao.QuestionDAO;
import com.example.bai12345678.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionDAO questionDAO;
    @GetMapping
    public String questions(Model model) {
        Question question = questionDAO.getRandomQuestion();
        model.addAttribute("question", question);
        return "questionView";
    }
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("question", new Question());
        return "addQuestion"; // trỏ đến addQuestion.jsp
    }
    @PostMapping
    public String save(@ModelAttribute Question question) {
        questionDAO.addQuestion(question);
        return "redirect:/question";
    }
}

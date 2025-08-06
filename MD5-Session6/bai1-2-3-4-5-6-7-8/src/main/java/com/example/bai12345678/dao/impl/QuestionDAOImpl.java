package com.example.bai12345678.dao.impl;

import com.example.bai12345678.dao.QuestionDAO;
import com.example.bai12345678.model.Question;
import com.example.bai12345678.util.DBConn;

import java.sql.*;

public class QuestionDAOImpl implements QuestionDAO {
    @Override
    public Question getRandomQuestion() {
        String sql = "{CALL get_random_question_id(?)}";
        try (Connection connection = DBConn.getInstance().getConnection();
             CallableStatement callableStatement = connection.prepareCall(sql);) {
//            callableStatement.setInt(1, (int)(Math.random()*100));
            callableStatement.registerOutParameter(1, Types.INTEGER);
            ResultSet resultSet = callableStatement.executeQuery();
            if (resultSet.next()) {
                Question question = new Question();
                question.setId(resultSet.getInt(1));
                question.setImageUrl(resultSet.getString(2));
                question.setAnswer(resultSet.getString(3));
                return question;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addQuestion(Question question) {
        String sql = "{CALL add_question(?,?)}";
        try (Connection connection = DBConn.getInstance().getConnection();
             CallableStatement callableStatement = connection.prepareCall(sql)) {
            callableStatement.setString(1, question.getImageUrl());
            callableStatement.setString(2, question.getAnswer());
            int row = callableStatement.executeUpdate();
            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

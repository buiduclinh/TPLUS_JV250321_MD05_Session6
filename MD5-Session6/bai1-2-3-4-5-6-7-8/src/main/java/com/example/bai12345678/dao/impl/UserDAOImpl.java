package com.example.bai12345678.dao.impl;

import com.example.bai12345678.dao.UserDAO;
import com.example.bai12345678.model.User;
import com.example.bai12345678.util.DBConn;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public List<User> getAllUsers() {
        String sql = "{CALL get_all_users()}";
        List<User> users = new ArrayList<>();
        try (Connection connection = DBConn.getInstance().getConnection();
             CallableStatement stmt = connection.prepareCall(sql);) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setBirthday(LocalDate.of(rs.getInt("birthday"), rs.getInt("birthday"), rs.getInt("birthday")));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return List.of();
    }

    @Override
    public boolean addUser(User user) {
        String sql = "{CALL add_user(?,?,?,?,?)}";
        try (Connection connection = DBConn.getInstance().getConnection();
             CallableStatement stmt = connection.prepareCall(sql);) {
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            stmt.setString(3, user.getBirthday().toString());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getPhone());
            int row = stmt.executeUpdate();
            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

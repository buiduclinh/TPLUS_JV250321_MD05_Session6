package com.example.bai12345678.dao.impl;

import com.example.bai12345678.dao.ProductDAO;
import com.example.bai12345678.model.Product;
import com.example.bai12345678.util.DBConn;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductDAOImpl implements ProductDAO {
    @Override
    public List<Product> findAll() {
        String sql = "{CALL get_all_products()}";
        List<Product> products = new ArrayList<>();
        try (Connection connection = DBConn.getInstance().getConnection(); CallableStatement callStmt = connection.prepareCall(sql);) {
            ResultSet resultSet = callStmt.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setProductName(resultSet.getString("product_name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setDescription(resultSet.getString("description"));
                product.setImage(resultSet.getString("image"));
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public boolean save(Product product) {
        String sql = "{CALL add_product(?,?,?,?)}";
        try (Connection connection = DBConn.getInstance().getConnection(); CallableStatement callStmt = connection.prepareCall(sql);) {
            callStmt.setString(1, product.getProductName());
            callStmt.setDouble(2, product.getPrice());
            callStmt.setString(3, product.getDescription());
            callStmt.setString(4, product.getImage());
            int row = callStmt.executeUpdate();
            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}

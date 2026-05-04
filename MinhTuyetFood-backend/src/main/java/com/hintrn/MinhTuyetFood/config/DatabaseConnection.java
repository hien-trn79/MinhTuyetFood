package com.hintrn.MinhTuyetFood.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

// Dung de kiem tra ket noi Database
@Component
public class DatabaseConnection implements CommandLineRunner {
    @Autowired
    private DataSource dataSource;

    public void run(String... args) throws Exception {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("=========== Connected database successful =============");
        } catch (Exception e) {
            System.out.println("Error connected: " + e.getMessage());
        }
    }

}

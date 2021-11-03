package com.company.Lab_3_1.controller;


import com.company.Lab_3_1.model.DataBase;
import com.company.Lab_3_1.model.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    DataBase db = new DataBase();

    public Controller() {
        try {
            db.connect();
            db.getFromDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee) {
        db.addEmployeeToDatabase(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return db.getEmployees();
    }
}

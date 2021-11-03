package com.company.Lab_3_1.gui;


import com.company.Lab_3_1.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class EmployeeFrame extends JFrame {
    private Controller controller;
    private JButton addButton;

    public EmployeeFrame() {
        super("Staff Manager");

        controller = new Controller();
        setLayout(new BorderLayout());

        final EmployeeAddForm employeeAddForm = new EmployeeAddForm();

        final TableForm tableForm = new TableForm();
        tableForm.setData(controller.getEmployees());

        addButton = new JButton("Add");
        addButton.addActionListener(e -> {
            employeeAddForm.addDataToDB();
            tableForm.setData(controller.getEmployees());
            tableForm.refresh();
        });

        add(employeeAddForm.getEmployeeAddPanel(), BorderLayout.WEST);
        add(tableForm.getTablePanel(), BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}

package com.company.Lab_1_1;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

import static java.awt.Font.BOLD;

public class EmployeeInfoFrame extends JFrame {

    public EmployeeInfoFrame(Employee employee) throws HeadlessException {
        super(employee.getName());
        setLayout(new FlowLayout(FlowLayout.LEFT, 50, 10));
        setResizable(false);
        setSize(200, 130);

        add(new JLabel("Name: " + employee.getName()));
        add(new JLabel("Age: " + employee.getAge()));
        add(new JLabel("Position: " + employee.getPosition().toString()));

        setVisible(true);
    }
}

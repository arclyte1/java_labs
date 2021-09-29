package com.company.Lab_1_1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    JTextField name = new JTextField(12);
    JTextField age = new JTextField(12);
    JComboBox<Employee.Position> position = new JComboBox<>(Employee.Position.values());
    JButton show = new JButton("Show");
    JButton exit = new JButton("Exit");

    public MainFrame() throws HeadlessException {
        super("Employee");
        setLayout(new FlowLayout());
        setSize(200, 160);
        setResizable(false);

        add(new JLabel("Name"));
        add(name);

        add(new JLabel("Age   "));
        add(age);

        add(new JLabel("Position"));
        add(position);

        add(show);
        show.addActionListener(e -> {
            Employee employee = new Employee(name.getText(), Integer.parseInt(age.getText()), (Employee.Position)position.getSelectedItem());
            new EmployeeInfoFrame(employee);
        });

        add(exit);
        exit.addActionListener(e -> {
            dispose();
        });

        setVisible(true);
    }
}

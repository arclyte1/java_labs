package com.company.Lab_1_1;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    JTextField nameField = new JTextField(9);
    JFormattedTextField ageField = new JFormattedTextField(9);
    JTextField departmentField = new JTextField(9);
    JFormattedTextField phoneField;
    JComboBox<Employee.Position> positionField = new JComboBox<>(Employee.Position.values());
    JButton show = new JButton("Show");
    JButton exit = new JButton("Exit");

    PersonEx.Gender defaultGender = PersonEx.Gender.OTHER;
    PersonEx.Gender selectedGender = defaultGender;

    public MainFrame() throws HeadlessException {
        super("Employee");
        setLayout(new FlowLayout());
        setSize(250, 400);

        JPanel main = createMainPanel();
        add(main);

        pack();
        setVisible(true);
    }

    private JPanel createMainPanel() {
        JPanel main = new JPanel();
        Font labelFont = new Font("TimesRoman", Font.PLAIN, 15);
        Font fieldFont = new Font("TimesRoman", Font.PLAIN, 20);
        main.setLayout(new BoxLayout(main, BoxLayout.PAGE_AXIS));

        ArrayList<JComponent> components = new ArrayList<>();

        // Name
        components.add(new JLabel("Name"));
        components.add(nameField);

        // Age
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);
        nf.setMaximumIntegerDigits(3);
        ageField = new JFormattedTextField(nf);
        components.add(new JLabel("Age"));
        components.add(ageField);

        // Phone
        MaskFormatter phoneMask = null;
        try{
            phoneMask = new MaskFormatter("+7(###)###-####");
            phoneMask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        phoneField = new JFormattedTextField(phoneMask);
        components.add(new JLabel("Phone"));
        components.add(phoneField);

        // Department
        components.add(new JLabel("Department"));
        components.add(departmentField);

        // Position
        components.add(new JLabel("Position"));
        components.add(positionField);

        // Gender
        components.add(new JLabel("Gender"));
        ButtonGroup genderGroup = new ButtonGroup();
        for (PersonEx.Gender g : PersonEx.Gender.values()) {
            JRadioButton b = new JRadioButton(g.toString());
            b.setFont(fieldFont);
            b.addActionListener(e -> {
                selectedGender = g;
            });
            if (g == defaultGender)
                b.setSelected(true);
            genderGroup.add(b);
            components.add(b);
        }

        // Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(show);
        show.addActionListener(e -> {
            String name = nameField.getText();
            if (name.isEmpty()) {
                new ErrorFrame("Name field is empty");
                return;
            }

            int age;
            try {
                age = Integer.parseInt(ageField.getText());
            }
            catch (NumberFormatException exception) {
                new ErrorFrame("Invalid age");
                return;
            }

            Employee.Position position = (Employee.Position) positionField.getSelectedItem();

            String phone = phoneField.getText();
            if (phone.contains("_")) {
                new ErrorFrame("Invalid phone number");
                return;
            }

            String department = departmentField.getText();
            if (department.isEmpty()) {
                new ErrorFrame("Department field is empty");
                return;
            }

            Employee employee = new Employee(name, age, position, department, phone, selectedGender);
            new EmployeeInfoFrame(employee);
        });

        buttonPanel.add(exit);
        exit.addActionListener(e -> {
            dispose();
        });
        components.add(buttonPanel);

        for (JComponent c : components) {
            c.setAlignmentX(Component.LEFT_ALIGNMENT);
            if (c.getClass() == JLabel.class)
                c.setFont(labelFont);
            else
                c.setFont(fieldFont);
            main.add(c);
        }

        return main;
    }
}

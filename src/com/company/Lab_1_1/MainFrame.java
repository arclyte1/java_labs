package com.company.Lab_1_1;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class MainFrame extends JFrame implements ItemListener {

    JTextField nameField = new JTextField(12);
    JTextField ageField = new JTextField(12);
    JTextField departmentField = new JTextField(12);
    JFormattedTextField phoneField;
    JComboBox<Employee.Position> positionField = new JComboBox<>(Employee.Position.values());
    JButton show = new JButton("Show");
    JButton exit = new JButton("Exit");

    JCheckBox genderMaleButton;
    JCheckBox genderFemaleButton;
    JCheckBox genderOtherButton;
    PersonEx.Gender gender = PersonEx.Gender.OTHER;

    public MainFrame() throws HeadlessException {
        super("Employee");
        setLayout(new FlowLayout());
        setSize(250, 400);
        setResizable(false);

        add(new JLabel("Name"));
        add(nameField);

        add(new JLabel("    Age         "));
        add(ageField);

        MaskFormatter phoneMask = null;
        try{
            phoneMask = new MaskFormatter("+7(###)###-####");
            phoneMask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }
        phoneField = new JFormattedTextField(phoneMask);
        add(new JLabel("Phone"));
        add(phoneField);

        add(new JLabel("Department       "));
        add(departmentField);

        add(new JLabel("Position"));
        add(positionField);

        add(new JLabel("Gender"));
        genderMaleButton = new JCheckBox("Male");
        genderMaleButton.setSelected(false);
        genderMaleButton.addItemListener(this);
        add(genderMaleButton);

        genderFemaleButton = new JCheckBox("Female");
        genderFemaleButton.setSelected(false);
        genderFemaleButton.addItemListener(this);
        add(genderFemaleButton);

        genderOtherButton = new JCheckBox("Other");
        genderOtherButton.setSelected(false);
        genderOtherButton.addItemListener(this);
        add(genderOtherButton);

        add(show);
        show.addActionListener(e -> {
            Employee employee = new Employee(nameField.getText(), Integer.parseInt(ageField.getText()), (Employee.Position) positionField.getSelectedItem(), departmentField.getText(), phoneField.getText(), gender);
            System.out.println(phoneField.getText() + gender.toString());
            new EmployeeInfoFrame(employee);
        });

        add(exit);
        exit.addActionListener(e -> {
            dispose();
        });

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == genderMaleButton) {
            gender = PersonEx.Gender.MALE;
        } else if (source == genderFemaleButton){
            gender = PersonEx.Gender.FEMALE;
        } else if (source == genderOtherButton){
            gender = PersonEx.Gender.OTHER;
        }
    }
}

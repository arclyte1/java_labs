package com.company.Lab_1_1;

import javax.swing.*;
import java.awt.*;

public class ErrorFrame extends JFrame{

    public ErrorFrame(String text) {
        super("Error");
        setSize(new Dimension(250, 100));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel errorLabel = new JLabel(text);
        errorLabel.setFont(new Font("TimesRoman", Font.BOLD, 15));
        errorLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(errorLabel);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            dispose();
        });
        okButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(okButton);

        add(panel);

        setVisible(true);
    }
}

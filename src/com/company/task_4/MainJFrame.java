package com.company.task_4;

import javax.swing.*;
import java.awt.*;

public class MainJFrame extends JFrame {

    JButton addMilan = new JButton("AC Milan");
    JButton addMadrid = new JButton("Real Madrid");
    JLabel result = new JLabel();
    JLabel last = new JLabel();
    JLabel winner = new JLabel();
    int milanScore = 0;
    int madridScore = 0;

    public MainJFrame() throws HeadlessException {
        super("AC Milan vs Real Madrid");
        setLayout(new FlowLayout());
        setResizable(false);
        setSize(250, 170);

        Font font = new Font("Times new roman", Font.PLAIN,20);

        add(addMilan);
        add(addMadrid);
        result.setFont(font);
        add(result);
        last.setFont(font);
        add(last);
        winner.setFont(font);
        add(winner);

        addMilan.addActionListener(e -> {
            milanScore++;
            updateLabels("AC Milan");
        });

        addMadrid.addActionListener(e -> {
            madridScore++;
            updateLabels("Real Madrid");
        });

        updateLabels("N/A");

        setVisible(true);
    }

    private void updateLabels(String team) {
        result.setText("Result: " + milanScore + " X " + madridScore);
        last.setText("Last Scorer: " + team);
        if (milanScore > madridScore)
            winner.setText("Winner: AC Milan");
        else if (madridScore > milanScore)
            winner.setText("Winner: Real Madrid");
        else
            winner.setText("Winner: DRAW");
    }
}

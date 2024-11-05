package com.rafa.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ClickCounterView extends JFrame {
    private JButton clickButton = new JButton("Clique!");
    private JLabel countLabel = new JLabel("Contagem: 0");

    public ClickCounterView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 150);

        JPanel panel = new JPanel();
        panel.add(clickButton);
        panel.add(countLabel);
        this.add(panel);
    }

    public void setCountLabel(int count) {
        countLabel.setText("Contagem: " + count);
    }


    public void addClickListener(ActionListener listener) {
        clickButton.addActionListener(listener);
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationField extends JFrame implements ActionListener {
    JButton button;
    JTextField textField = new JTextField();
    JPanel panelForButtonAndTextField;
    ImageIcon Background;
    JLabel BackgroundLabel;
    InformationField() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 448);
        this.setResizable(false);

        Background= new ImageIcon("NameImage.jpg");
        BackgroundLabel= new JLabel(Background);
        BackgroundLabel.setBounds(0,0,800,448);
        this.add(BackgroundLabel);
        panelForButtonAndTextField = new JPanel();
        panelForButtonAndTextField.setBounds(300, 300,300 , 50);
        panelForButtonAndTextField.setForeground(Color.white);
        panelForButtonAndTextField.setBackground(Color.black);

        textField.setPreferredSize(new Dimension(200, 40));
        textField.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        textField.setForeground(Color.white);
        textField.setBackground(Color.black);
        textField.setText("Enter your name");
        textField.setEditable(true);

        button = new JButton("Submit");
        button.setBounds(0, 0, 100, 50);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        button.setFocusable(false);
        button.addActionListener(this);



        panelForButtonAndTextField.add(textField);
        panelForButtonAndTextField.add(button);
        BackgroundLabel.add(panelForButtonAndTextField);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            GameData.PlayerName = textField.getText();
            System.out.println(GameData.PlayerName);
            this.dispose();
            AgeSlider ageSlider= new AgeSlider();

        }
    }
}

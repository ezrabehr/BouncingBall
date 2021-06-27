package com.company;

import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgeSlider implements ActionListener {
    JFrame frame;
    JSlider slider;
    JLabel label;
    JLabel background;
    JPanel panelForSlider;
    JPanel panelForButton;
    JPanel panelForLabel;
    JButton button;
    ImageIcon AgeBackground;
    AgeSlider() {
        frame = new JFrame("Pick your age");
        panelForSlider = new JPanel();
        panelForSlider.setBounds(130, 40, 50, 300);
        panelForSlider.setBackground(Color.black);
        panelForSlider.setForeground(Color.white);

        panelForButton = new JPanel();
        panelForButton.setBounds(200, 250, 200, 100);
        panelForButton.setBackground(Color.black);
        panelForButton.setForeground(Color.white);

        panelForLabel = new JPanel();
        panelForLabel.setBounds(200, 50, 325, 50);
        panelForLabel.setBackground(Color.black);
        label = new JLabel(AgeBackground);
        button = new JButton("Submit");
        button.setBounds(0, 0, 200, 100);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        button.addActionListener(this);

        AgeBackground = new ImageIcon("ageImage.jpg");
        background = new JLabel(AgeBackground);
        background.setBounds(0,0,800,448);

        slider = new JSlider(0, 120, 0);//decides the value of the slider in order- min, max, where the slider should start
        slider.setPreferredSize(new Dimension(100, 300));//sets the size of the slider

        slider.setPaintTicks(true);//sets the small lines to be visible
        slider.setMinorTickSpacing(10);//sets how often the ticks will appear

        slider.setPaintTrack(true);//sets the big lines to be visible
        slider.setMajorTickSpacing(20);//sets how often the big ticks will appear

        slider.setPaintLabels(true);//sets the numbers to be visible
        slider.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));

        slider.setOrientation(SwingConstants.HORIZONTAL);//turns the slider to be horizontal
        slider.setOrientation(SwingConstants.VERTICAL);//turns slider to be vertical

        label.setText("You are " + slider.getValue() + " years old");//creates a label with the value of slider
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        label.setForeground(Color.white);

        slider.addChangeListener(e ->
                label.setText("You are " + slider.getValue() + " years old"));//creates a label with the value of slider
        slider.setBackground(Color.black);
        slider.setForeground(Color.white);

        frame.add(background);
        background.add(panelForButton);
        background.add(panelForLabel);
        background.add(panelForSlider);
        panelForSlider.add(slider);
        panelForButton.add(button);
        panelForLabel.add(label);
        frame.setSize(800, 448);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.pack();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            GameData.PlayerAge= slider.getValue();
            System.out.println(GameData.PlayerAge);
            if (GameData.PlayerAge< 18) {
                JOptionPane.showMessageDialog(null, "You are underage!", "can't play", JOptionPane.ERROR_MESSAGE);
                frame.dispose();
            } else {
                frame.dispose();
                OpeningPage openingPage = new OpeningPage();

            }
        }
    }
}

package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimeUI {

    JFrame primeFrame = new JFrame("Prime Range");
    JTextField start = new JTextField("Start");
    JTextField end = new JTextField("End");

    JButton generatePrime = new JButton("Generate Prime");

    void drawUI(){
        PrimeNumber primeNumber = new PrimeNumber();
        primeFrame.add(start);
        primeFrame.add(end);
        primeFrame.add(generatePrime);
        primeFrame.setSize(200, 600);

        primeFrame.setLayout(new GridLayout(3, 1));
        primeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        primeFrame.setVisible(true);

        generatePrime.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeNumber.primeRange(
                        Integer.parseInt(start.getText()),
                        Integer.parseInt(end.getText())
                );
            }
        });
    }

    public static void main(String[] args) {
        PrimeUI primeUI = new PrimeUI();
        primeUI.drawUI();
    }
}
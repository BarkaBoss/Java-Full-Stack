package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoDesk {

    JFrame window = new JFrame("Math");
    JTextField heightTf = new JTextField("Enter Height");
    JTextField lengthTf = new JTextField("Enter Length");
    JButton calculateButton = new JButton("Calculate");

    void drawUI(){
        window.add(heightTf);
        window.add(lengthTf);
        window.add(calculateButton);

        window.setSize(400,300);
        window.setLayout(new GridLayout(3,1));
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        calculateButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        float height = Float.valueOf(heightTf.getText());
                        float length = Float.valueOf(lengthTf.getText());

                        JOptionPane.showMessageDialog(null, length * height);
                    }
                }
        );
    }

    public static void main(String[] args) {
        DemoDesk desk = new DemoDesk();
        desk.drawUI();
    }
}

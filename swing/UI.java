package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class UI {
    JFrame window = new JFrame("Physics");
    JTextField tfMass = new JTextField("Enter Mass");
    JTextField tfAcceleration = new JTextField("Acceleration");
    JButton btnCalculate = new JButton("Calculate");

    void drawUI(){
        window.add(tfMass);
        window.add(tfAcceleration);
        window.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Physics physics = new Physics();

                try{
                    float mass = Float.valueOf(tfMass.getText());
                    float acceleration = Float.valueOf(tfAcceleration.getText());

                    FileWriter fileWriter = new FileWriter("fileName.txt", true);

                    JOptionPane.showMessageDialog(null,
                            physics.calculateForce(mass, acceleration));
                    fileWriter.write(Float.toString(physics.calculateForce(mass, acceleration))+"\n");
                    fileWriter.close();
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,
                            "Enter only numeric values");
                    nfe.printStackTrace();
                }catch (Exception ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,
                            "Something strange has happened");
                }
            }
        });

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3, 1));
        window.setSize(200, 250);
        window.setVisible(true);
    }
}

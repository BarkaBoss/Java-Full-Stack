package ui;
import DatatypesAndVariables.files.FileWriterMain;
import oop.Geometry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI {
    JFrame myFrame = new JFrame("Geometry");
    JFrame myRectFrame = new JFrame("Rectangle");

    JButton btnTriangle = new JButton("Area of Triangle");
    JButton btnSquare = new JButton("Area of Square");
    JButton btnRectangle = new JButton("Area of Rectangle");
    JButton calcCircumference = new JButton("Area of Rectangle");

    JTextField radius = new JTextField("Radius");

    public void drawUI(){
        myFrame.setLayout(new GridLayout(3,1));
        myFrame.add(btnTriangle);
        myFrame.add(btnSquare);
        myFrame.add(btnRectangle);
        myFrame.setSize(200, 300);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        myFrame.setVisible(true);

        btnRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawCircumference();
                JOptionPane.showMessageDialog(null,"Calculate Area of Rectangle");
            }
        });
    }

    public void drawCircumference(){
        myRectFrame.setLayout(new GridLayout(2, 1));
        myRectFrame.add(radius);
        myRectFrame.add(calcCircumference);
        myRectFrame.setSize(200, 300);

        myRectFrame.setVisible(true);
        Geometry geometry = new Geometry();
        FileWriterMain fileWriterMain = new FileWriterMain();

        calcCircumference.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float area = geometry.areaOfSquare(Float.parseFloat(radius.getText()));
                fileWriterMain.writeData("Area Of Square with length: "
                        +radius.getText()+" is "+ area);
            }
        });
    }
}
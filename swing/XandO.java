package swing;

import javax.swing.*;
import java.awt.*;

public class XandO {

    JFrame tictac = new JFrame("X and O");
    JButton btnOne = new JButton();
    JButton btnTwo = new JButton();
    JButton btnThree = new JButton();
    JButton btnFour = new JButton();
    JButton btnFive = new JButton();
    JButton btnSix = new JButton();
    JButton btnSeven = new JButton();
    JButton btnEight = new JButton();
    JButton btnNine = new JButton();

    void drawUI(){
        tictac.add(btnOne);
        tictac.add(btnTwo);
        tictac.add(btnThree);
        tictac.add(btnFour);
        tictac.add(btnFive);
        tictac.add(btnSix);
        tictac.add(btnSeven);
        tictac.add(btnEight);
        tictac.add(btnNine);

        tictac.setLayout(new GridLayout(3, 3));
        tictac.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tictac.setSize(400, 400);
        tictac.setVisible(true);
    }
}

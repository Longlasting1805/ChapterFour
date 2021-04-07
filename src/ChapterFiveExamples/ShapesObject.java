package ChapterFiveExamples;

import javax.swing.*;
import java.awt.*;

public class ShapesObject extends JPanel {
    public static void main(String[] args) {
//        Obtain user's choice

        String input = JOptionPane.showInputDialog("Enter 1 to draw Rectangles\n" +
                "Enter 2 to draw Ovals");

//        Convert input to int

        int choice = Integer.parseInt(input);

//        create the panel with the user's input

        Shapes panel = new Shapes(choice);

//        create a new jFrame
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);

    }
}

package ChapterFiveExamples;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {
    private int choice;//user choice of switch shape to draw

//    constructor sets the user choice
    public Shapes (int userChoice){
        choice = userChoice;
    }
//    draw a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (int i = 0; i <= 10; i++){
//            pick the shape based on the user's choice
            switch (choice){
                case 1://draw rectangles
                    g.drawRect(10 + i * 10,10 + i * 10, 50 + i
                    * 10, 50 + i * 10);
                    break;
                case 2://draw ovals
                    g.drawRect(10 + i * 10,10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;
            }
        }

    }
}

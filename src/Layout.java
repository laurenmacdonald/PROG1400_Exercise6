import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    private JFrame frame;

    public Layout(){
        frame = new JFrame("Take a Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Creating colors red and blue to be used throughout
        Color blue = new Color(0,0,255);
        Color red = new Color(255,0,0);

        //Creating new font to be used on labels
        Font labelFont = new Font("Sans Serif", Font.BOLD, 24);

        //region Creating components
        JButton toggleLeft = new JButton("Toggle Left");
        JButton toggleRight = new JButton("Toggle Right");

        JLabel labelLeft = new JLabel("This is the left panel", SwingConstants.CENTER); // centering label
        labelLeft.setForeground(red);
        labelLeft.setFont(labelFont);
        JLabel labelRight = new JLabel("This is the right panel", SwingConstants.CENTER); //centering label
        labelRight.setForeground(blue);
        labelRight.setFont(labelFont);

        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(blue);
        panelLeft.add(labelLeft);       //adding label to the panel

        JPanel panelRight = new JPanel();
        panelRight.setBackground(red);
        panelRight.add(labelRight);     //adding label to the panel
        //endregion


        //region adding components to the container
        this.frame.add(toggleLeft);
        this.frame.add(toggleRight);
        this.frame.add(panelLeft);
        this.frame.add(panelRight);
        //endregion

        this.frame.setLayout(new GridLayout(2,2));      //setting layout using 2X2 grid
        this.frame.setSize(700, 300);
        this.frame.setVisible(true);
    }
}

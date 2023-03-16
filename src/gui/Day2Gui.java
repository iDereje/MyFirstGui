package gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Day2Gui {
  public static void main (String[]args) {
    //JLable = a Gui area for a string of text ,an image or both
    ImageIcon image = new ImageIcon("C:\\Users\\derej\\IdeaProjects\\MyFirstGui\\src\\gui\\OverWolf.png");
    JLabel label = new JLabel();
    Border border = BorderFactory.createLineBorder(Color.white,5);



    label.setIcon(image);

    label.setVerticalAlignment(JLabel.CENTER);//SET VERTICAL POSITION OF ICON AND TEXT
    label.setHorizontalAlignment(JLabel.CENTER);//SET HORIZONTAL POSITION OF THE LABEL
    label.setBorder(border);//DISPLAYS THE BORDER
    label.setHorizontalTextPosition(JLabel.LEFT);//SET TEXT LET,CENTER ,RIGHT OF IMAGE ;
    label.setVerticalTextPosition(JLabel.TOP);// SET TEXT TO TOP,BOTTOM,CENTER OF IMAGE ICON
    label.setForeground(new Color(0,100,111));//SET  THE TEXT COLOR
    label.setFont(new Font("TAHOMA",Font.PLAIN,20));//SET THE FONT STYLE OF TEXT
    label.setIconTextGap(-25);//SET GAP OF TEXT IMAGE

    label.setBackground(Color.black);//SET BACKGROUND COLOR
    label.setOpaque(true);//DISPLAYS THE COLOR OF BACKGROUND
    label.setText("bro do you even code ");//SET THE
    label.setBounds(100,100,250,220);//SET X AND Y POSITION WITHIN FRAME AS WELL POSITION ;



    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setLayout(null);
//    frame.setSize(400, 400);
    frame.setVisible(true);
    frame.add(label);
    frame.pack();//NEED TO BE LAST FIRST ADDING ALL COMPONENTS IS A MUST ;

  }
}

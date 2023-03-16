  package gui;

  import javax.swing.*;
  import java.awt.*;

  public class FirstGui {

    public static void main (String[]args) {
      JLabel label = new JLabel() ;
label.setText("Hello World " );
      //This sets the title of the frame
      JFrame frame = new JFrame() ;


      //This sets the title of the frame
      frame.setTitle("wazzaa");
      frame.setResizable(true);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      //This makes the frame visible
      frame.setVisible(true);

      //This sets x and y dimensions
      frame.setSize(500,500);

  ImageIcon image = new ImageIcon("C:\\Users\\derej\\IdeaProjects\\MyFirstGui\\src\\gui\\OverWolf.png");// Creates an ImageIcon Providing ull path

  frame.setIconImage(image.getImage()); //change icon of the frame

      frame.getContentPane().setBackground(new Color(0,0,0));
      frame.getJMenuBar();




    }
  }

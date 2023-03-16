package gui;

import javax.swing.*;
public class  Jframe1{
public static void main (String[]args) {
  JFrame frame = new JFrame () ;
  JLabel label = new JLabel() ;
  ImageIcon image = new ImageIcon("C:\\Users\\derej\\IdeaProjects\\MyFirstGui\\src\\gui\\Notes.png");


  label.setIcon(image);



  frame.setVisible(true);
  frame.setSize(250,250);
  frame.setTitle("Notes");





}
}

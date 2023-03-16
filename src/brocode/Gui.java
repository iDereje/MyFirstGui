package brocode;

import javax.swing.JOptionPane ;
public class Gui {
    public static void main(String[] args) {


        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, " you are " + age + " years old");
        Double  height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, " you are " + height + " cm Tall ");

    }
}
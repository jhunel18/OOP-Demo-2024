import javax.swing.*;
public class Main {
    public static void main(String[] args) {

       int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));
       if (age >= 18){
           JOptionPane.showMessageDialog(null, "You are a voter!");
       }
       else{
           JOptionPane.showMessageDialog(null, "You are not a voter");
       }
    }

}
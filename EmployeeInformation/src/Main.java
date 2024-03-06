import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        while (true) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            if (num > 0) {
                JOptionPane.showMessageDialog(null, "Positive");
            } else {
                JOptionPane.showMessageDialog(null, "Negative");
            }
        }
    }
}
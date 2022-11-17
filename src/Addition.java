import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog(null, "Input first number");
        String secondNumber = JOptionPane.showInputDialog(null, "Input second number");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        int sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
}

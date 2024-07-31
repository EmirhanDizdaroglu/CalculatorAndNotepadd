import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {

    JComboBox<String> selectionOfOperations;
    JLabel operandLabel1, operandLabel2, kindOfLabel, labelOfResult, labelOfOperator;
    JTextArea errorArea;
    JTextField firstOperand;
    JTextField secondOperand;
    JFrame SHAPE;
    JPanel PANO;
    JButton KEY;

    public static void main(String[] args) {//MAİN
        new CalculatorApp();
    }

    public CalculatorApp() {
        SHAPE = new JFrame("CALCULATOR-EMIRHAN DIZDAROGLU");
        PANO = new JPanel();
        SHAPE.add(PANO);
        SHAPE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SHAPE.setSize(280, 400);
        KEY = new JButton("CALCULATE");
        firstOperand = new JTextField("", 10);
        secondOperand = new JTextField("", 10);
        selectionOfOperations = new JComboBox<>();
        //OPERATION ITEMS:
        selectionOfOperations.addItem("Summation");
        selectionOfOperations.addItem("Subtraction");
        selectionOfOperations.addItem("Multiply");
        selectionOfOperations.addItem("Division");

        operandLabel1 = new JLabel("First Number:");
        operandLabel2 = new JLabel("Second Number:");
        kindOfLabel = new JLabel("Choose the type of operation: ");
        labelOfResult = new JLabel("                    -                      ");
        //first
        labelOfOperator = new JLabel("");
        labelOfOperator.setFont(new Font("Tahoma", Font.BOLD, 75));
        labelOfResult.setFont(new Font("Calibre", Font.BOLD, 25));
        errorArea = new JTextArea("If there is a problem you will see in this area...\n", 25, 15);
        PANO.add(operandLabel1, BorderLayout.CENTER);
        PANO.add(firstOperand, BorderLayout.CENTER);
        PANO.add(labelOfOperator, BorderLayout.CENTER);
        PANO.add(operandLabel2, BorderLayout.CENTER);
        PANO.add(secondOperand, BorderLayout.CENTER);
        PANO.add(kindOfLabel, BorderLayout.CENTER);
        PANO.add(selectionOfOperations, BorderLayout.CENTER);
        PANO.add(KEY, BorderLayout.CENTER);
        PANO.add(labelOfResult, BorderLayout.CENTER);
        PANO.add(errorArea, BorderLayout.CENTER);
        selectionOfOperations.addActionListener(new ComboActionListener());
        KEY.addActionListener(new MyButtonActionListener());
        SHAPE.setVisible(true);

    }

    class ComboActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }

    class MyButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int number1 = Integer.parseInt(firstOperand.getText());
                int number2 = Integer.parseInt(secondOperand.getText());
                if (selectionOfOperations.getSelectedIndex() == 0) {
                    labelOfResult.setText("                    " + (number1 + number2) + "                      ");
                    firstOperand.setText("");
                    secondOperand.setText("");
                } else if (selectionOfOperations.getSelectedIndex() == 1) {
                    labelOfResult.setText("                    " + (number1 - number2) + "                      ");
                    firstOperand.setText("");
                    secondOperand.setText("");
                } else if (selectionOfOperations.getSelectedIndex() == 2) {
                    labelOfResult.setText("                    " + (number1 * number2) + "                      ");
                    firstOperand.setText("");
                    secondOperand.setText("");
                } else {
                    labelOfResult.setText("                " + (number1 / number2) + "                      ");
                    firstOperand.setText("");
                    secondOperand.setText("");
                }
                selectionOfOperations.setSelectedIndex(0);
            } catch (NumberFormatException x) {
                errorArea.append("Both operands must be int\n");
                firstOperand.setText("");
                secondOperand.setText("");
            } catch (ArithmeticException y) {
                errorArea.append("Error: You can't divided by 0\n");
                firstOperand.setText("");
                secondOperand.setText("");
            }
        }
    }

}
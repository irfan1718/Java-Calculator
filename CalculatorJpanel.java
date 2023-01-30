
// import javax.swing.*;
// import java.awt.event.*;
import java.awt.*;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class CalculatorJpanel implements ActionListener {

    JFrame frame;
    JLabel displayLabel;
    JPanel panel;

    JButton[] numberButton = new JButton[10];
    JButton[] functionButton = new JButton[8];

    JButton equButton, addButton, mulButton, subButton;
    JButton decButton, divButton, delButton, clearButton;

    Font myFont = new FontUIResource("Arial", Font.BOLD, 25);

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public CalculatorJpanel() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420, 550);
        frame.setLocation(400, 80);

        displayLabel = new JLabel();
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setFont(myFont);
        displayLabel.setForeground(ColorUIResource.WHITE);
        displayLabel.setBackground(ColorUIResource.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setBounds(50, 25, 300, 50);
        frame.add(displayLabel);

        addButton = new JButton("+");
        subButton = new JButton("-");
        divButton = new JButton("/");
        mulButton = new JButton("*");
        decButton = new JButton(".");
        clearButton = new JButton("clear");
        delButton = new JButton("delete");
        equButton = new JButton("=");

        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = divButton;
        functionButton[3] = mulButton;
        functionButton[4] = decButton;
        functionButton[5] = clearButton;
        functionButton[6] = delButton;
        functionButton[7] = equButton;

        for (int i = 0; i < 8; i++) {
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myFont);
            numberButton[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 145, 50);
        clearButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        frame.add(panel);

        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addButton);

        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(subButton);

        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(mulButton);

        panel.add(decButton);
        panel.add(numberButton[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(delButton);
        frame.add(clearButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorJpanel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButton[i]) {
                displayLabel.setText(displayLabel.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            displayLabel.setText(displayLabel.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '+';
            displayLabel.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '-';
            displayLabel.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '*';
            displayLabel.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '/';
            displayLabel.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(displayLabel.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            displayLabel.setText(result + "");
            num1 = result;
        }
        if (e.getSource() == clearButton) {
            displayLabel.setText("");
        }
        if (e.getSource() == delButton) {
            String string = displayLabel.getText();
            displayLabel.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                displayLabel.setText(displayLabel.getText() + string.charAt(i));
            }
        }
    }

}

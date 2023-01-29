import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;

public class Calculator implements ActionListener {
    boolean isOperatorClicked = false;

    String oldValue;

    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton,
            dotButton, zeroButton, equalButton, plusButton, mulButton, minusButton, divideButton, clearButton;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(400, 80);

        displayLabel = new JLabel();
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setForeground(ColorUIResource.WHITE);
        displayLabel.setBackground(ColorUIResource.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setBounds(20, 50, 540, 40);
        jf.add(displayLabel);

        sevenButton = new JButton("7");
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sevenButton.setBounds(20, 130, 60, 60);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setFont(new Font("Arial", Font.PLAIN, 20));
        eightButton.setBounds(120, 130, 60, 60);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setFont(new Font("Arial", Font.PLAIN, 20));
        nineButton.setBounds(220, 130, 60, 60);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton = new JButton("4");
        fourButton.setFont(new Font("Arial", Font.PLAIN, 20));
        fourButton.setBounds(20, 220, 60, 60);
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton = new JButton("5");
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 20));
        fiveButton.setBounds(120, 220, 60, 60);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton = new JButton("6");
        sixButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sixButton.setBounds(220, 220, 60, 60);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton = new JButton("1");
        oneButton.setFont(new Font("Arial", Font.PLAIN, 20));
        oneButton.setBounds(20, 310, 60, 60);
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton = new JButton("2");
        twoButton.setFont(new Font("Arial", Font.PLAIN, 20));
        twoButton.setBounds(120, 310, 60, 60);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton = new JButton("3");
        threeButton.setFont(new Font("Arial", Font.PLAIN, 20));
        threeButton.setBounds(220, 310, 60, 60);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton = new JButton(".");
        dotButton.setFont(new Font("Arial", Font.PLAIN, 20));
        dotButton.setBounds(20, 400, 60, 60);
        dotButton.addActionListener(this);
        jf.add(dotButton);

        zeroButton = new JButton("0");
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 20));
        zeroButton.setBounds(120, 400, 60, 60);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton = new JButton("=");
        equalButton.setFont(new Font("Arial", Font.PLAIN, 20));
        equalButton.setBounds(220, 400, 60, 60);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divideButton = new JButton("/");
        divideButton.setFont(new Font("Arial", Font.PLAIN, 20));
        divideButton.setBounds(320, 130, 60, 60);
        divideButton.addActionListener(this);
        jf.add(divideButton);

        mulButton = new JButton("*");
        mulButton.setFont(new Font("Arial", Font.PLAIN, 20));
        mulButton.setBounds(320, 220, 60, 60);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        minusButton = new JButton("-");
        minusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        minusButton.setBounds(320, 310, 60, 60);
        minusButton.addActionListener(this);
        jf.add(minusButton);

        plusButton = new JButton("+");
        plusButton.setFont(new Font("Arial", Font.PLAIN, 20));
        plusButton.setBounds(320, 400, 60, 60);
        plusButton.addActionListener(this);
        jf.add(plusButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
        clearButton.setBounds(400, 400, 120, 60);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        // some button are remaining to add .,0 and operators

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (isOperatorClicked) {
                displayLabel.setText("7");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }
        } else if (e.getSource() == eightButton) {
            if (isOperatorClicked) {
                displayLabel.setText("8");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }
        } else if (e.getSource() == nineButton) {
            if (isOperatorClicked) {
                displayLabel.setText("9");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }
        } else if (e.getSource() == fourButton) {
            if (isOperatorClicked) {
                displayLabel.setText("4");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }
        } else if (e.getSource() == fiveButton) {
            if (isOperatorClicked) {
                displayLabel.setText("5");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }
        } else if (e.getSource() == sixButton) {
            if (isOperatorClicked) {
                displayLabel.setText("6");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }
        } else if (e.getSource() == oneButton) {
            if (isOperatorClicked) {
                displayLabel.setText("1");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }
        } else if (e.getSource() == twoButton) {
            if (isOperatorClicked) {
                displayLabel.setText("2");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }
        } else if (e.getSource() == threeButton) {
            if (isOperatorClicked) {
                displayLabel.setText("3");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }
        } else if (e.getSource() == zeroButton) {
            if (isOperatorClicked) {
                displayLabel.setText("0");
                isOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "0");
            }
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");
        } else if (e.getSource() == plusButton) {
            isOperatorClicked = true;
            oldValue = displayLabel.getText();
            displayLabel.setText("");
        } else if (e.getSource() == equalButton) {
            String newValue = displayLabel.getText();

            float oldValueF = Float.parseFloat(oldValue);
            float newValueF = Float.parseFloat(newValue);

            float result = oldValueF + newValueF;
            displayLabel.setText(result + "");

        } else if (e.getSource() == minusButton) {

        } else if (e.getSource() == divideButton) {

        } else if (e.getSource() == mulButton) {

        } else if (e.getSource() == clearButton) {
            displayLabel.setText("");
        }
    }

}

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class Calculator implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    JFrame frame;
    JLabel displayLabel;
    JButton addBtn, subBtn, mulBtn, divBtn, equBtn, decBtn, delBtn, clrBtn;

    JButton[] numBtn = new JButton[10];
    JButton[] funBtn = new JButton[8];

    Font myFont = new FontUIResource("Arial", Font.BOLD, 20);

    public Calculator() {
        // frame
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setLocation(500, 100);
        frame.setSize(420, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Label
        displayLabel = new JLabel();
        displayLabel.setBounds(40, 25, 320, 50);
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setBackground(ColorUIResource.lightGray);
        displayLabel.setOpaque(true);
        displayLabel.setFont(myFont);
        frame.add(displayLabel);

        // number buttons
        for (int i = 0; i < 10; i++) {
            numBtn[i] = new JButton(String.valueOf(i));
            numBtn[i].addActionListener(this);
            numBtn[i].setFont(myFont);
            numBtn[i].setFocusable(false);
            frame.add(numBtn[i]);
        }

        // function Button
        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("*");
        divBtn = new JButton("/");
        equBtn = new JButton("=");
        decBtn = new JButton(".");
        delBtn = new JButton("Del");
        clrBtn = new JButton("Clr");

        funBtn[0] = addBtn;
        funBtn[1] = subBtn;
        funBtn[2] = mulBtn;
        funBtn[3] = divBtn;
        funBtn[4] = equBtn;
        funBtn[5] = decBtn;
        funBtn[6] = delBtn;
        funBtn[7] = clrBtn;

        for (int i = 0; i < 8; i++) {
            funBtn[i].addActionListener(this);
            funBtn[i].setFont(myFont);
            funBtn[i].setFocusable(false);
            frame.add(funBtn[i]);
        }

        numBtn[1].setBounds(50, 100, 50, 50);
        numBtn[2].setBounds(130, 100, 50, 50);
        numBtn[3].setBounds(220, 100, 50, 50);
        funBtn[0].setBounds(300, 100, 50, 50);

        numBtn[4].setBounds(50, 180, 50, 50);
        numBtn[5].setBounds(130, 180, 50, 50);
        numBtn[6].setBounds(220, 180, 50, 50);
        funBtn[1].setBounds(300, 180, 50, 50);

        numBtn[7].setBounds(50, 260, 50, 50);
        numBtn[8].setBounds(130, 260, 50, 50);
        numBtn[9].setBounds(220, 260, 50, 50);
        funBtn[2].setBounds(300, 260, 50, 50);

        funBtn[5].setBounds(50, 340, 50, 50);
        numBtn[0].setBounds(130, 340, 50, 50);
        funBtn[3].setBounds(220, 340, 50, 50);
        funBtn[4].setBounds(300, 340, 50, 50);

        funBtn[6].setBounds(50, 420, 140, 50);
        funBtn[7].setBounds(210, 420, 140, 50);

    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBtn[i]) {
                displayLabel.setText(displayLabel.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decBtn) {
            displayLabel.setText(displayLabel.getText().concat("."));
        }
        if (e.getSource() == addBtn) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '+';
            displayLabel.setText("");
        }
        if (e.getSource() == subBtn) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '-';
            displayLabel.setText("");
        }
        if (e.getSource() == mulBtn) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '*';
            displayLabel.setText("");
        }
        if (e.getSource() == divBtn) {
            num1 = Double.parseDouble(displayLabel.getText());
            operator = '/';
            displayLabel.setText("");
        }
        if (e.getSource() == equBtn) {
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
        if (e.getSource() == clrBtn) {
            displayLabel.setText("");
        }
        if (e.getSource() == delBtn) {
            String string = displayLabel.getText();
            displayLabel.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                displayLabel.setText(displayLabel.getText() + string.charAt(i));
            }
        }

    }

}

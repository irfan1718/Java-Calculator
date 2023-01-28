import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;

public class Calculator {
    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(400, 80);

        JLabel displayLabel = new JLabel("Java Calculator");
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setForeground(ColorUIResource.WHITE);
        displayLabel.setBackground(ColorUIResource.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setBounds(20, 50, 540, 40);
        jf.add(displayLabel);


        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(20,130,60 ,60);
        jf.add(sevenButton); 

        JButton eightButton=new JButton("8");
        eightButton.setBounds(120,130,60,60);
        jf.add(eightButton);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(220,130,60,60);
        jf.add(nineButton);

        JButton fourButton=new JButton("4");
        fourButton.setBounds(20,220,60 ,60);
        jf.add(fourButton); 

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(120,220,60,60);
        jf.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(220,220,60,60);
        jf.add(sixButton);

        JButton oneButton=new JButton("1");
        oneButton.setBounds(20,310,60 ,60);
        jf.add(oneButton); 

        JButton twoButton=new JButton("2");
        twoButton.setBounds(120,310,60,60);
        jf.add(twoButton);

        JButton threeButton=new JButton("3");
        threeButton.setBounds(220,310,60,60);
        jf.add(threeButton);

        

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

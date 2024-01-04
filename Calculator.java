package Java.Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

    private static final Object Button_clearEntry = null;
    JFrame jf;
    JLabel dispLabel;
    JButton Button_0, Button_1, Button_2, Button_3, Button_4, Button_5, Button_6, Button_7, Button_8, Button_9, Button_add, Button_div, Button_dot, Button_equl, Button_multi, Button_sub, Button_clear;
    boolean Click = false;
    String oldValue, operator;

    public Calculator(){
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,550);
        jf.setLocation(400, 150);

        dispLabel = new JLabel("");
        dispLabel.setBounds(10, 30, 385, 40);
        dispLabel.setBackground(Color.GRAY);
        dispLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        dispLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dispLabel.setOpaque(true);
        dispLabel.setForeground(Color.BLACK);
        jf.add(dispLabel);

        Button_7 = new JButton("7");
        Button_7.setBounds(10, 100, 80, 80);
        Button_7.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_7);
        Button_7.addActionListener(this);

        Button_8 = new JButton("8");
        Button_8.setBounds(110, 100, 80, 80);
        Button_8.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_8);
        Button_8.addActionListener(this);

        Button_9 = new JButton("9");
        Button_9.setBounds(210, 100, 80, 80);
        Button_9.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_9);
        Button_9.addActionListener(this);

        Button_4 = new JButton("4");
        Button_4.setBounds(10, 210, 80, 80);
        Button_4.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_4);
        Button_4.addActionListener(this);

        Button_5 = new JButton("5");
        Button_5.setBounds(110, 210, 80, 80);
        Button_5.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_5);
        Button_5.addActionListener(this);

        Button_6 = new JButton("6");
        Button_6.setBounds(210, 210, 80, 80);
        Button_6.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_6);
        Button_6.addActionListener(this);

        Button_1 = new JButton("1");
        Button_1.setBounds(10, 310, 80, 80);
        Button_1.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_1);
        Button_1.addActionListener(this);

        Button_2 = new JButton("2");
        Button_2.setBounds(110, 310, 80, 80);
        Button_2.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_2);
        Button_2.addActionListener(this);

        Button_3 = new JButton("3");
        Button_3.setBounds(210, 310, 80, 80);
        Button_3.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_3);
        Button_3.addActionListener(this);

        Button_dot = new JButton(".");
        Button_dot.setBounds(10, 410, 80, 80);
        Button_dot.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_dot);
        Button_dot.addActionListener(this);

        Button_0 = new JButton("0");
        Button_0.setBounds(110, 410, 80, 80);
        Button_0.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_0);
        Button_0.addActionListener(this);

        Button_equl = new JButton("=");
        Button_equl.setBounds(210, 410, 80, 80);
        Button_equl.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_equl);
        Button_equl.addActionListener(this);

        Button_div = new JButton("/");
        Button_div.setBounds(310, 100, 80, 80);
        Button_div.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_div);
        Button_div.addActionListener(this);

        Button_multi = new JButton("*");
        Button_multi.setBounds(310, 210, 80, 80);
        Button_multi.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_multi);
        Button_multi.addActionListener(this);

        Button_sub = new JButton("-");
        Button_sub.setBounds(310, 310, 80, 80);
        Button_sub.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_sub);
        Button_sub.addActionListener(this);

        Button_add = new JButton("+");
        Button_add.setBounds(310, 410, 80, 80);
        Button_add.setFont(new Font("Arial", Font.PLAIN, 30));
        jf.add(Button_add);
        Button_add.addActionListener(this);

        Button_clear = new JButton("Clear");
        Button_clear.setBounds(410, 410, 100, 80);
        Button_clear.setFont(new Font("Arial", Font.PLAIN, 20));
        jf.add(Button_clear);
        Button_clear.addActionListener(this);



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void actionPerformed(ActionEvent e) {


        if(e.getSource() == Button_1){
            if (Click) {
                dispLabel.setText("1");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"1");
            }
            
        }
        else if (e.getSource() == Button_2) {
            if (Click) {
                dispLabel.setText("2");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"2");
            }
        }
        else if (e.getSource() == Button_3) {
            if (Click) {
                dispLabel.setText("3");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"3");
            }
        }
        else if (e.getSource() == Button_4) {
            if (Click) {
                dispLabel.setText("4");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"4");
            }
        }
        else if (e.getSource() == Button_5) {
            if (Click) {
                dispLabel.setText("5");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"5");
            }
        }
        else if (e.getSource() == Button_6) {
            if (Click) {
                dispLabel.setText("6");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"6");
            }
        }
        else if (e.getSource() == Button_7) {
            if (Click) {
                dispLabel.setText("7");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"7");
            }
        }
        else if (e.getSource() == Button_8) {
            if (Click) {
                dispLabel.setText("8");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"8");
            }
        }
        else if (e.getSource() == Button_9) {
            if (Click) {
                dispLabel.setText("9");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"9");
            }
        }
        else if (e.getSource() == Button_0) {
            if (Click) {
                dispLabel.setText("0");
                Click = false;
            }
            else{
                dispLabel.setText(dispLabel.getText()+"0");
            }
        }
        else if (e.getSource() == Button_add) {
                setOperator("+");
        } 
        else if (e.getSource() == Button_sub) {
                setOperator("-");
        } 
        else if (e.getSource() == Button_multi) {
                setOperator("*");
        } 
        else if (e.getSource() == Button_div) {
                setOperator("/");
        }

        else if (e.getSource() == Button_equl) {
            calculateResult();
        }

        else if (e.getSource() == Button_clear) {
            clearAll();
        } else if (e.getSource() == Button_clearEntry) {
            clearEntry();
        }

    }
    
    private void setOperator(String op) {
        Click = true;
        oldValue = dispLabel.getText();
        operator = op;
    }

    private void calculateResult() {
        String newValue = dispLabel.getText();
        float result = 0;

        float oldValueF = Float.parseFloat(oldValue);
        float newValueF = Float.parseFloat(newValue);

        switch (operator) {
            case "+":
                result = oldValueF + newValueF;
                break;
            case "-":
                result = oldValueF - newValueF;
                break;
            case "*":
                result = oldValueF * newValueF;
                break;
            case "/":
                if (newValueF != 0) {
                    result = oldValueF / newValueF;
                } else {
                    dispLabel.setText("Error: Division by zero");
                    return;
                }
                break;
        }

        dispLabel.setText(String.valueOf(result));
    }

    private void clearAll() {
        dispLabel.setText("");
        oldValue = "";
        operator = "";
        Click = false;
    }

    private void clearEntry() {
        dispLabel.setText("");
        Click = true;
    }
}


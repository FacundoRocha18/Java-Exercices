package com.openbootcamp.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IvaCalculatorUI {
    private JButton buttonCalculate;
    private JPanel mainPanel;
    private JTextField price;
    private JTextField iva;
    private JTextField total;

    public IvaCalculatorUI() {
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCalcIva();
            }
        });
    }

    public void handleCalcIva(){
        double p = validateDouble(price.getText());
        double i = validateDouble(iva.getText());
        double result = p + (p * i);
        total.setText(String.valueOf(result));
    }

    /**
     * This function validates that the passed text doesn't contain letters
     * and then parses the text to double and returns the value.
     * @param stringValue
     * @return parsedValue
     * @throws NumberFormatException
     * @author Facundo Rocha
     */
    public static double validateDouble(String stringValue) throws NumberFormatException {
        double parsedValue = 0.0;
        try {
            if(stringValue.contains("([A-Z]|[a-z])")) {
                throw new NumberFormatException();
            }
            parsedValue = Double.parseDouble(stringValue);

        } catch (NumberFormatException e) {
            System.out.println("No pueden haber letras en el campo Precio");
        }
        return parsedValue;
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Iva calculator");
        frame.setContentPane(new IvaCalculatorUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

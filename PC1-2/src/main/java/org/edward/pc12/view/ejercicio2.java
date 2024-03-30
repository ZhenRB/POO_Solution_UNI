package org.edward.pc12.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio2 extends JFrame{
    private JButton processBtn;
    private JButton exitBtn;
    private JTextField xValueIn;
    private JTextField nValueIn;
    private JTextField serieOut;
    private JLabel xValue;
    private JPanel principalFrame;

    public ejercicio2() {

        //Exit Button
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        processBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Datos
                double x = Double.parseDouble(xValueIn.getText());
                int n = Integer.parseInt(nValueIn.getText());

                //Proceso

            }
        });
    }

    public static void main(String[] args) {
        ejercicio2 f = new ejercicio2();
        f.setContentPane(f.principalFrame);
        f.setTitle("Ejercicio 2");
        f.setBounds(600,200,600,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

package org.practices.edward.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.practices.edward.services.formulaGeneral;

public class forms extends JFrame{

    private JButton cancelButton;
    private JButton limpiarButton;
    private JButton procesarButton;
    private JTextField ValueA;
    private JTextField ValueC;
    private JTextField ValueB;
    private JTextField ConditionField;
    private JTextField x1Field;
    private JTextField x2Field;
    private JPanel panelMain;
    private JPanel valuePanel;
    private JPanel resultPanel;
    private JPanel buttonPanel;
    public forms(){
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panelMain,"Se limpiaron los datos");
                setEditMode(true);
            }
        });
        procesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //Datos
                    double a = Double.parseDouble(ValueA.getText());
                    double b = Double.parseDouble(ValueB.getText());
                    double c = Double.parseDouble(ValueC.getText());

                    //Proceso
                    formulaGeneral service = new formulaGeneral();
                    double d = service.calcDiscriminante(a,b,c);
                    double x1 = service.calcX1(d,b,a);
                    double x2 = service.calcX2(d,b,a);
                    String condicion = service.calcCondicion(d);

                    //Resultado
                    x1Field.setText(String.valueOf(x1));
                    x2Field.setText(String.valueOf(x2));
                    ConditionField.setText(condicion);
                    setEditMode(false);
            }
        });
    }

    private void setEditMode(boolean editMode){
        ValueA.setEnabled(editMode);
        ValueB.setEnabled(editMode);
        ValueC.setEnabled(editMode);
        procesarButton.setEnabled(editMode);
        limpiarButton.setEnabled(!editMode);
        if(editMode){
            ValueA.setText("");
            ValueB.setText("");
            ValueC.setText("");
            ConditionField.setText("");
            x1Field.setText("");
            x2Field.setText("");
            ValueA.requestFocus();
        }


    }

    public static void  main(String[] args){
        forms f = new forms();
        f.setContentPane(f.panelMain);
        f.setTitle("Problema 1");
        //f.setSize(300,300);
        f.setBounds(600,200,600,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package view;
import service.MathSerie;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formpc12 extends JFrame{
    private JTextField ValueX;
    private JTextField ValueN;
    private JButton ProcessBtn;
    private JButton CancelBtn;
    private JTextField SerieValue;
    private JPanel PrincipalPane;

    public formpc12() {
        ProcessBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Datos

                double x = Double.parseDouble(ValueX.getText());
                int n = Integer.parseInt(ValueN.getText());
                //Proceso

                MathSerie ms = new MathSerie();
                ms.calcularFactorial(n);
                ms.calcularPotencia(x,n);
                double serie = ms.calcularSerie(x,n);
                setEditMode(false);

                //Resultado
                SerieValue.setText(Double.toString(serie));

            }
        });
        CancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void setEditMode(boolean editMode){
        ValueN.setEnabled(!editMode);
        ValueX.setEnabled(!editMode);
        ProcessBtn.setEnabled(!editMode);
        SerieValue.setEnabled(editMode);


    }
    public static void main(String[] args) {
        formpc12 frame = new formpc12();
        frame.setVisible(true);
        frame.setContentPane(frame.PrincipalPane);
        frame.setTitle("Problema 2");
        frame.setBounds(600,200,600,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}

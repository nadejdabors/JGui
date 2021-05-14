import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaGUI extends JFrame {
    private JPanel Main;
    private JTextField txtName;
    private JTextField txtAddress;
    private JButton OKButton;

    public JavaGUI() {
        /*
        -----anonymous inner class 
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = txtName.getText();
                String address = txtAddress.getText();
                JOptionPane.showMessageDialog(null,name);
                JOptionPane.showMessageDialog(null,address);
            }
        });
        */
        OKButton.addActionListener(new MyActionListener());


    }

    public static void main(String[] args) {
        JavaGUI j = new JavaGUI();
        j.setContentPane(new JavaGUI().Main);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();
    }

    public class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = txtName.getText();
            String address = txtAddress.getText();
            JOptionPane.showMessageDialog(null, name);
            JOptionPane.showMessageDialog(null, address);
        }
    }
}
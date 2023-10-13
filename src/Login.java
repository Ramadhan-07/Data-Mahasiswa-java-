

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Ramad
 */
public class Login extends JFrame implements ActionListener {
    private JTextField f_User;
    private JPasswordField f_Pass;
    private JButton login, exit;
    
    public Login (){
        setSize(400, 250);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        userInterface();
        setVisible(true);
    }
    
    private void userInterface(){
        JLabel judul = new JLabel("SILAHKAN LOGIN");
        judul.setHorizontalAlignment(JLabel.CENTER);
        judul.setFont(new Font("Tahoma", Font.BOLD, 25));
        getContentPane().add(judul, "North");
        
        JPanel panComp = new JPanel();
        panComp.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        JLabel user = new JLabel("Username");
        user.setPreferredSize(new Dimension(110, 25));
        user.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
        panComp.add(user);
        
        f_User = new JTextField();
        f_User.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_User);
        
        JLabel pass = new JLabel("Password");
        pass.setPreferredSize(new Dimension(110, 25));
        pass.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
        panComp.add(pass);
        
        f_Pass = new JPasswordField();
        f_Pass.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_Pass);
        
        getContentPane().add(panComp);
        
        JPanel panButton = new JPanel();
        panButton.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        login = new JButton("Login");
        login.addActionListener(this);
        panButton.add(login);
        
        exit = new JButton("Exit");
        exit.addActionListener(this);
        panButton.add(exit);
        
        getContentPane().add(panButton, "South");
    }
    
    public static void main(String[] args){
       Login form = new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(ae.getSource()==login){
            String pass = String.valueOf(f_Pass.getPassword());
            if(f_User.getText().equals("Ramadhan") && pass.equals("12345")){
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                new Data().setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Gagal Login");
            }
        }else if(ae.getSource()==exit){
            System.exit(0);
        }
    }
    
}

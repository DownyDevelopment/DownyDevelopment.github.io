/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pergudangan;

import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author downy
 */
public class LoginController {
    private JTextField userField;
    private JTextField passField;


    public LoginController(JTextField userField, JTextField passField) {
        this.userField = userField;
        this.passField = passField;
    }
    
    
    
    
    public void LoginButton(){
    String username = userField.getText();
                String password = passField.getText();

                // Validasi Username dan Password
                if (username.equals("admin") && password.equals("123456")) {
                    JOptionPane.showMessageDialog(null, "Login Berhasil!");
                    UserInterface uuser = new UserInterface();
                    uuser.setVisible(true);// Membuka class MainInterface
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password Salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            
        

        
}

}

package View;

import javax.swing.*;
import java.awt.*;

public class UserLogin {

    public static void startUserLogin(){
        JTextField insertUsername;
        JTextField insertPassword;
        JTextField nameRegis;
        JTextField passRegis;
        JTextField rePassRegis;
        JTextField emailRegis;
        JTextField pNoRegis;
        JTextField addressRegis;

        JFrame loginAccountCreation = new JFrame("Panel test");
        loginAccountCreation.setIconImage(Toolkit.getDefaultToolkit().getImage("src/rfc/uiImg/sageorbLS.png"));
        loginAccountCreation.setTitle("Login/Account Creation");
        loginAccountCreation.getContentPane().setBackground(new Color(255, 255, 255));
        loginAccountCreation.setSize(648,347);
        loginAccountCreation.getContentPane().setLayout(null);

        JLabel sageLogo = new JLabel("");
        sageLogo.setBackground(new Color(100, 149, 237));
        sageLogo.setIcon(new ImageIcon("src/rfc/uiImg/sageCleanLogoSmal.png"));
        sageLogo.setBounds(10, 39, 274, 246);
        loginAccountCreation.getContentPane().add(sageLogo);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 206, 209));
        panel.setBounds(0, 0, 632, 36);
        loginAccountCreation.getContentPane().add(panel);
        panel.setLayout(null);

        insertUsername = new JTextField();
        insertUsername.setText("Username");
        insertUsername.setBounds(246, 6, 138, 20);
        panel.add(insertUsername);
        insertUsername.setColumns(10);

        insertPassword = new JTextField();
        insertPassword.setText("Password");
        insertPassword.setColumns(10);
        insertPassword.setBounds(394, 6, 138, 20);
        panel.add(insertPassword);

        JButton loginB = new JButton("Login");
        loginB.setBounds(542, 6, 78, 20);
        panel.add(loginB);
        loginB.setBackground(new Color(169, 169, 169));

        JButton createRegis = new JButton("Create Account");
        createRegis.setBounds(372, 252, 167, 23);
        loginAccountCreation.getContentPane().add(createRegis);

        nameRegis = new JTextField();
        nameRegis.setBounds(408, 62, 181, 20);
        loginAccountCreation.getContentPane().add(nameRegis);
        nameRegis.setColumns(10);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(372, 65, 46, 14);
        loginAccountCreation.getContentPane().add(nameLabel);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(354, 95, 59, 14);
        loginAccountCreation.getContentPane().add(passLabel);

        passRegis = new JTextField();
        passRegis.setColumns(10);
        passRegis.setBounds(408, 92, 181, 20);
        loginAccountCreation.getContentPane().add(passRegis);

        JLabel rePassLabel = new JLabel("Re-enter Password:");
        rePassLabel.setBounds(309, 123, 104, 14);
        loginAccountCreation.getContentPane().add(rePassLabel);

        rePassRegis = new JTextField();
        rePassRegis.setColumns(10);
        rePassRegis.setBounds(408, 120, 181, 20);
        loginAccountCreation.getContentPane().add(rePassRegis);

        emailRegis = new JTextField();
        emailRegis.setColumns(10);
        emailRegis.setBounds(408, 151, 181, 20);
        loginAccountCreation.getContentPane().add(emailRegis);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(376, 155, 46, 14);
        loginAccountCreation.getContentPane().add(emailLabel);

        pNoRegis = new JTextField();
        pNoRegis.setColumns(10);
        pNoRegis.setBounds(408, 178, 181, 20);
        loginAccountCreation.getContentPane().add(pNoRegis);

        JLabel phoneNoLabel = new JLabel("Phone no:");
        phoneNoLabel.setBounds(354, 182, 74, 14);
        loginAccountCreation.getContentPane().add(phoneNoLabel);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(359, 212, 74, 14);
        loginAccountCreation.getContentPane().add(addressLabel);

        addressRegis = new JTextField();
        addressRegis.setColumns(10);
        addressRegis.setBounds(408, 209, 181, 20);
        loginAccountCreation.getContentPane().add(addressRegis);
        loginAccountCreation.setVisible(true);
        loginAccountCreation.setResizable(false);
    }
}

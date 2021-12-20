package HotelManagementSystem.Login;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import HotelManagementSystem.Dashboard.Dashboard;
import HotelManagementSystem.Database.connection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel username, password;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton login_button, cancel_button;

    public Login() {

        username = new JLabel("Username");
        username.setBounds(40, 35, 100, 30);
        add(username);

        password = new JLabel("Password");
        password.setBounds(40, 95, 100, 30);
        add(password);

        userTextField = new JTextField();
        userTextField.setBounds(160, 30, 150, 40);
        add(userTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 90, 150, 40);
        add(passwordField);

        login_button = new JButton("LOGIN");
        login_button.setBackground(Color.BLACK);
        login_button.setForeground(Color.WHITE);
        login_button.setBounds(40, 200, 130, 30);
        login_button.addActionListener(this);
        add(login_button);

        cancel_button = new JButton("CANCEL");
        cancel_button.setBackground(Color.BLACK);
        cancel_button.setForeground(Color.WHITE);
        cancel_button.setBounds(190, 200, 130, 30);
        cancel_button.addActionListener(this);
        add(cancel_button);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(380, 10, 200, 200);
        add(l1);

        setLayout(null);
        setBounds(500, 250, 600, 300);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == login_button) {

            String username = userTextField.getText();
            String password = String.valueOf(passwordField.getPassword());
            connection con = new connection();
            String sql = "select * from login where username='" + username + "' and password='" + password + "'";

            try {
                ResultSet rs = con.s.executeQuery(sql);
                if (rs.next()) {
                    new Dashboard().setVisible(true);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username and password");
                    this.setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == cancel_button) {
            System.exit(0);
        }

    }
}

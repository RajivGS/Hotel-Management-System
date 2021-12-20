package HotelManagementSystem;

import HotelManagementSystem.Login.Login;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelManagementSystem extends JFrame implements ActionListener {

    public HotelManagementSystem() {
        setBounds(100, 100, 1366, 565);

        ImageIcon homepage_image = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        JLabel home_image = new JLabel(homepage_image);
        home_image.setBounds(0, 0, 1365, 565);
        add(home_image);

        JButton next = new JButton("NEXT");
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(1030, 470, 150, 37);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Login().setVisible(true);
        setVisible(false);
        
    }

     public static void main(String[] args) throws Exception {
        new HotelManagementSystem();
     }
}

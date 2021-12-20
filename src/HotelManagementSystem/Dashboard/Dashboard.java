package HotelManagementSystem.Dashboard;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import HotelManagementSystem.Dashboard.Reception.Reception;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu hotel_mgmt, admin;
    JMenuItem reception, employee, rooms, drivers;

    public Dashboard() {

        menuBar = new JMenuBar();
        add(menuBar);

        hotel_mgmt = new JMenu("HOTEL MANAGEMENT");
        hotel_mgmt.setForeground(Color.BLACK);
        menuBar.add(hotel_mgmt);

        admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLACK);
        menuBar.add(admin);

        reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel_mgmt.add(reception);

        employee = new JMenuItem("ADD EMPLOYEE");
        employee.addActionListener(this);
        admin.add(employee);

        rooms = new JMenuItem("ADD ROOMS");
        rooms.addActionListener(this);
        admin.add(rooms);

        drivers = new JMenuItem("ADD DRIVERS");
        drivers .addActionListener(this);
        admin.add(drivers);

        menuBar.setBounds(0, 0, 1680, 30);
        add(menuBar);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        JLabel image_label = new JLabel(image);

        image_label.setBounds(0, 0, 1024, 860);
        add(image_label);


        JLabel hotel_name=  new JLabel("RIAS GREMORY GROUP");
        hotel_name.setBounds(250  , 60, 1000, 50);
        hotel_name.setForeground(Color.WHITE);
        hotel_name.setFont(new Font("Tahoma",Font.PLAIN,46));
        image_label.add(hotel_name);


        setLayout(null);
        setBounds(350, 0, 1024, 860);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("RECEPTION")) {
            new Reception().setVisible(true);
        }else if(e.getActionCommand().equals("ADD EMPLOYEE")) {
            new Add_Emplyee().setVisible(true);
        } else if(e.getActionCommand().equals("ADD ROOMS")) {
            new Add_Rooms().setVisible(true);
        } else if(e.getActionCommand().equals("ADD DRIVERS")) {
            new Add_Drivers().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

}

package HotelManagementSystem.Dashboard.Reception;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {

    JButton customer_form, room_button, pick_up_service, department_button, employee_info_button, customer_info_button,
            manager_info_button, check_out_button, update_check_status, update_room_status, search_room_button,
            logout_button;

    public Reception() {

        customer_form = new JButton("New Customer Form");
        customer_form.setBackground(Color.WHITE);
        customer_form.setForeground(Color.BLACK);
        customer_form.setBounds(10, 30, 200, 30);
        customer_form.addActionListener(this);
        add(customer_form);

        room_button = new JButton("Room");
        room_button.setBackground(Color.WHITE);
        room_button.setForeground(Color.BLACK);
        room_button.setBounds(10, 70, 200, 30);
        room_button.addActionListener(this);
        add(room_button);

        department_button = new JButton("Department");
        department_button.setBackground(Color.WHITE);
        department_button.setForeground(Color.BLACK);
        department_button.setBounds(10, 110, 200, 30);
        department_button.addActionListener(this);
        add(department_button);

        employee_info_button = new JButton("All Employee Info");
        employee_info_button.setBackground(Color.WHITE);
        employee_info_button.setForeground(Color.BLACK);
        employee_info_button.setBounds(10, 150, 200, 30);
        employee_info_button.addActionListener(this);
        add(employee_info_button);

        customer_info_button = new JButton("Customer Info");
        customer_info_button.setBackground(Color.WHITE);
        customer_info_button.setForeground(Color.BLACK);
        customer_info_button.setBounds(10, 190, 200, 30);
        customer_info_button.addActionListener(this);
        add(customer_info_button);

        manager_info_button = new JButton("Manager Info");
        manager_info_button.setBackground(Color.WHITE);
        manager_info_button.setForeground(Color.BLACK);
        manager_info_button.setBounds(10, 230, 200, 30);
        manager_info_button.addActionListener(this);
        add(manager_info_button);

        check_out_button = new JButton("Check Out");
        check_out_button.setBackground(Color.WHITE);
        check_out_button.setForeground(Color.BLACK);
        check_out_button.setBounds(10, 270, 200, 30);
        check_out_button.addActionListener(this);
        add(check_out_button);

        update_check_status = new JButton("Update Check Status");
        update_check_status.setBackground(Color.WHITE);
        update_check_status.setForeground(Color.BLACK);
        update_check_status.setBounds(10, 310, 200, 30);
        update_check_status.addActionListener(this);
        add(update_check_status);

        update_room_status = new JButton("Update Room Status");
        update_room_status.setBackground(Color.WHITE);
        update_room_status.setForeground(Color.BLACK);
        update_room_status.setBounds(10, 350, 200, 30);
        update_room_status.addActionListener(this);
        add(update_room_status);

        pick_up_service = new JButton("Pick Up Service");
        pick_up_service.setBackground(Color.WHITE);
        pick_up_service.setForeground(Color.BLACK);
        pick_up_service.setBounds(10, 390, 200, 30);
        pick_up_service.addActionListener(this);
        add(pick_up_service);

        search_room_button = new JButton("Search Rooms");
        search_room_button.setBackground(Color.WHITE);
        search_room_button.setForeground(Color.BLACK);
        search_room_button.setBounds(10, 430, 200, 30);
        search_room_button.addActionListener(this);
        add(search_room_button);

        logout_button = new JButton("Logout");
        logout_button.setBackground(Color.WHITE);
        logout_button.setForeground(Color.BLACK);
        logout_button.setBounds(10, 470, 200, 30);
        logout_button.addActionListener(this);
        add(logout_button);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
        JLabel imageJLabel = new JLabel(image);
        imageJLabel.setBounds(250, 30, 500, 460);
        add(imageJLabel);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(450, 200, 800, 570);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == customer_form) {

        } else if (ae.getSource() == room_button) {

        } else if (ae.getSource() == department_button) {

        } else if (ae.getSource() == employee_info_button) {
            new EmployeeInfo().setVisible(true);
            setVisible(false);
        } else if (ae.getSource() == customer_info_button) {

        } else if (ae.getSource() == manager_info_button) {

        } else if (ae.getSource() == check_out_button) {

        } else if (ae.getSource() == update_check_status) {

        } else if (ae.getSource() == update_room_status) {

        } else if (ae.getSource() == pick_up_service) {

        } else if (ae.getSource() == search_room_button) {

        } else if (ae.getSource() == logout_button) {
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Reception().setVisible(true);
    }

}

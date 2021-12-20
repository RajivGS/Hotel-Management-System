package HotelManagementSystem.Dashboard;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import HotelManagementSystem.Database.connection;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_Rooms extends JFrame implements ActionListener {

    JTextField roomTextField, priceTextField;
    JComboBox<String> avail_type, clean_status_box, bed_type_box;
    JButton b1, b2;

    public Add_Rooms() {

        JLabel add_rooms = new JLabel("Add Rooms");
        add_rooms.setBounds(150, 20, 200, 20);
        add_rooms.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(add_rooms);

        JLabel room_no = new JLabel("Room Number");
        room_no.setBounds(60, 80, 120, 30);
        room_no.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(room_no);

        roomTextField = new JTextField();
        roomTextField.setBounds(200, 80, 150, 30);
        add(roomTextField);

        JLabel available = new JLabel("Available Room");
        available.setBounds(60, 130, 120, 30);
        available.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(available);

        avail_type = new JComboBox<String>(new String[] { "Available", "Occupied" });
        avail_type.setBounds(200, 130, 150, 30);
        avail_type.setBackground(Color.WHITE);
        add(avail_type);

        clean_status_box = new JComboBox<String>(new String[] { "Cleaned", "Dirty" });
        clean_status_box.setBounds(200, 180, 150, 30);

        clean_status_box.setBackground(Color.WHITE);
        add(clean_status_box);

        JLabel cleaning_status = new JLabel("Cleaning Status");
        cleaning_status.setBounds(60, 180, 120, 30);
        cleaning_status.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(cleaning_status);

        JLabel price = new JLabel("Price");
        price.setBounds(60, 230, 120, 30);
        price.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(price);

        priceTextField = new JTextField();
        priceTextField.setBounds(200, 230, 150, 30);
        add(priceTextField);

        JLabel type = new JLabel("Bed Type");
        type.setBounds(60, 280, 120, 30);
        type.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(type);

        bed_type_box = new JComboBox<String>(new String[] { "Single Bed", "Double Bed" });
        bed_type_box.setBounds(200, 280, 150, 30);
        bed_type_box.setBackground(Color.WHITE);

        add(bed_type_box);

        b1 = new JButton("Add Rooms");
        b1.setBounds(60, 350, 130, 30);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(210, 350, 130, 30);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
        JLabel imageJLabel = new JLabel(image);
        imageJLabel.setBounds(400, 30, 500, 350);
        add(imageJLabel);

        getContentPane().setBackground(Color.WHITE);
        setBounds(400, 200, 950, 500);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            String room = roomTextField.getText();

            String available =(String) avail_type.getSelectedItem();
            String status = (String)clean_status_box.getSelectedItem();
            String price = priceTextField.getText();
            String bed_type = (String) bed_type_box.getSelectedItem();

            connection c =  new connection();

            try {
                String sql = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+bed_type+"')";
                c.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "New Room Added");

            } catch (Exception ae) {
                ae.printStackTrace();
            }


        } else if (e.getSource() == b2) {
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Add_Rooms().setVisible(true);
    }
}

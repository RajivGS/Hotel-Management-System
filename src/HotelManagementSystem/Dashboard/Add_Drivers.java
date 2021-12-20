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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_Drivers extends JFrame implements ActionListener {

    JTextField nameField, ageField, car_companyField, car_model_brand, locationField;
    JComboBox<String> gender_box, available_box;
    JButton add_driver, cancel;

    public Add_Drivers() {

        JLabel title = new JLabel("Add Drivers");
        title.setBounds(150, 10, 150, 30);
        title.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(title);

        JLabel name = new JLabel("Name");
        name.setBounds(60, 70, 120, 30);
        name.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(name);

        nameField = new JTextField();
        nameField.setBounds(200, 70, 120, 30);
        add(nameField);

        JLabel age = new JLabel("Age");
        age.setBounds(60, 110, 120, 30);
        age.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(age);

        ageField = new JTextField();
        ageField.setBounds(200, 110, 120, 30);
        add(ageField);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(60, 150, 120, 30);
        gender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(gender);

        gender_box = new JComboBox<String>(new String[] { "Male", "Female" });
        gender_box.setBackground(Color.WHITE);

        gender_box.setBounds(200, 150, 120, 30);
        add(gender_box);

        JLabel car_company = new JLabel("Car Company");
        car_company.setBounds(60, 190, 120, 30);
        car_company.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(car_company);

        car_companyField = new JTextField();
        car_companyField.setBounds(200, 190, 120, 30);
        add(car_companyField);

        JLabel car_model = new JLabel("Car Model");
        car_model.setBounds(60, 230, 120, 30);
        car_model.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(car_model);

        car_model_brand = new JTextField();
        car_model_brand.setBounds(200, 230, 120, 30);
        add(car_model_brand);

        JLabel available = new JLabel("Available");
        available.setBounds(60, 270, 120, 30);
        available.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(available);

        available_box = new JComboBox<String>(new String[] { "Available", "Busy" });
        available_box.setBounds(200, 270, 120, 30);
        available_box.setBackground(Color.WHITE);
        add(available_box);

        JLabel location = new JLabel("Location");
        location.setBounds(60, 310, 120, 30);
        location.setFont(new Font("Tahoma", Font.PLAIN, 14));
        add(location);

        locationField = new JTextField();
        locationField.setBounds(200, 310, 120, 30);
        add(locationField);

        add_driver = new JButton("Add Drivers");
        add_driver.setBackground(Color.WHITE);
        add_driver.setForeground(Color.BLACK);
        add_driver.setBounds(60, 370, 120, 30);
        add_driver.addActionListener(this);
        add(add_driver);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setBounds(200, 370, 120, 30);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = image.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel iamgLabel = new JLabel(i3);
        iamgLabel.setBounds(400, 80, 500, 300);
        add(iamgLabel);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(380, 200, 950, 450);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Add_Drivers().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add_driver) {

            String name = nameField.getText();
            String age = ageField.getText();
            String gender = (String) gender_box.getSelectedItem();
            String company = car_companyField.getText();
            String brand = car_model_brand.getText();
            String available = (String) available_box.getSelectedItem();
            String location = locationField.getText();

            connection c = new connection();

            String sql = "insert into driver values('" + name + "','" + age + "','" + gender + "','" + company + "','"
                    + brand + "','" + available + "','" + location + "')";

            try {
                c.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Driver Sucessfully Added");
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

}

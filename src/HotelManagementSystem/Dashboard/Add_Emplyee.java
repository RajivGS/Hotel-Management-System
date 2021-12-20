package HotelManagementSystem.Dashboard;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import HotelManagementSystem.Database.connection;

public class Add_Emplyee extends JFrame implements ActionListener {

    JTextField namTextField, ageTextField, salaryTextField, phoneTextField, aadharTextField, emailTextField;
    JButton submit;
    JComboBox<String> jobbox;
    JRadioButton male, female;

    Add_Emplyee() {

        JLabel name = new JLabel("NAME");
        name.setBounds(60, 30, 120, 30);
        add(name);

        namTextField = new JTextField();
        namTextField.setBounds(200, 30, 120, 30);
        add(namTextField);

        JLabel age = new JLabel("AGE");
        age.setBounds(60, 80, 120, 30);
        add(age);

        ageTextField = new JTextField();
        ageTextField.setBounds(200, 80, 120, 30);
        add(ageTextField);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(60, 130, 120, 30);
        add(gender);

        male = new JRadioButton("MALE");
        male.setFont(new Font("Tahoma", Font.PLAIN, 15));
        male.setBounds(200, 130, 70, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("FEMALE");
        female.setFont(new Font("Tahoma", Font.PLAIN, 15));
        female.setBounds(280, 130, 90, 30);
        female.setBackground(Color.WHITE);
        add(female);

        JLabel job = new JLabel("JOB");
        job.setBounds(60, 180, 120, 30);
        add(job);

        String job_list[] = { "Front Desk Clerks", "Porters", "Housekeeping", "Kitchen Staff", "Room Service",
                "Waiter/Waitress", "Manager", "Accountant", "Chef" };
        jobbox = new JComboBox<String>(job_list);
        jobbox.setFont(new Font("Tahoma", Font.PLAIN, 17));
        jobbox.setBounds(200, 180, 180, 30);
        jobbox.setBackground(Color.WHITE);

        add(jobbox);

        JLabel salary = new JLabel("SALARY");
        salary.setBounds(60, 230, 120, 30);
        add(salary);

        salaryTextField = new JTextField();
        salaryTextField.setBounds(200, 230, 120, 30);
        add(salaryTextField);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60, 280, 120, 30);
        add(phone);

        phoneTextField = new JTextField();
        phoneTextField.setBounds(200, 280, 120, 30);
        add(phoneTextField);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60, 330, 120, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setBounds(200, 330, 120, 30);
        add(aadharTextField);

        JLabel email = new JLabel("E-Mail");
        email.setBounds(60, 380, 120, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(200, 380, 120, 30);
        add(emailTextField);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image image2 = image.getImage().getScaledInstance(500, 540, Image.SCALE_DEFAULT);
        ImageIcon imag3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(imag3);
        imageLabel.setBounds(400, 60, 450, 450);
        add(imageLabel);

        JLabel emplye_dLabel = new JLabel("ADD EMPLOYEE DETAILS");
        emplye_dLabel.setBounds(420, 30, 400, 30);
        emplye_dLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(emplye_dLabel);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(200, 430, 150, 30);
        submit.addActionListener(this);
        add(submit);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(415, 200, 900, 540);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Add_Emplyee().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = namTextField.getText();
        String age = ageTextField.getText();
        String salary = salaryTextField.getText();
        String phone = phoneTextField.getText();
        String aadhar = aadharTextField.getText();
        String email = emailTextField.getText();

        String gender = null;

        if (male.isSelected()) {
            gender = "MALE";

        } else if (female.isSelected()) {
            gender = "FEMALE";
        }

        String jobType = (String) jobbox.getSelectedItem();

        connection c = new connection();

        String sql = "insert into employee values('" + name + "','" + age + "','" + gender + "','" + jobType + "','"
                + salary + "','" + phone + "','" + aadhar + "','" + email + "')";

        try {
            c.s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, " New Employee Added");
            this.setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
            // TODO: handle exception
        }
    }

}

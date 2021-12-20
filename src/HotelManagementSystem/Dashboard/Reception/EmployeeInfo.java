package HotelManagementSystem.Dashboard.Reception;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

import HotelManagementSystem.Database.connection;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.ResultSet;

import net.proteanit.sql.*;

public class EmployeeInfo extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    EmployeeInfo() {

        t1 = new JTable();
        t1.setBounds(0, 40, 1000, 500);
        add(t1);

        b1 = new JButton("Load Data");
        b1.setBounds(350, 560, 120, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b2.setBounds(530, 560, 120, 30);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(450, 200, 1000, 1000);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                connection c = new connection();
                String sql = "select * from employee";
                ResultSet rs = c.s.executeQuery(sql);
                
                t1.setModel(DbUtils.resultSetToTableModel(rs));
                

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == b2) {
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new EmployeeInfo().setVisible(true);
    }

}

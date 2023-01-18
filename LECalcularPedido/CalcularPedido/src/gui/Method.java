package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Method extends JFrame {

    private JButton order1Btn;
    private JButton order2Btn;
    private JButton order3Btn;
    private JTable orderTable;
    private DefaultTableModel tableModel;



    public Method() {
        // Initialize the frame
        setTitle("Menu Page");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create the panel to hold the buttons and table
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create the title label
        JLabel titleLabel = new JLabel("Menu Page");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Create the buttons
        order1Btn = new JButton("Order 1");
        order2Btn = new JButton("Order 2");
        order3Btn = new JButton("Order 3");

        // Add action listeners to the buttons
        order1Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(new Object[]{"Order 1", "Pending"});
            }
        });
        order2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(new Object[]{"Order 2", "Pending"});
            }
        });
        order3Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(new Object[]{"Order 3", "Pending"});

            }
        });

                  // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(order1Btn);
        buttonPanel.add(order2Btn);
        buttonPanel.add(order3Btn);
        mainPanel.add(buttonPanel, BorderLayout.WEST);
        
        // Create the table
        String[] columnNames = {"Order", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0);
        orderTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(orderTable);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

             // Add background image
             ImageIcon backgroundImage = new ImageIcon("C:"+File.separator+"Users"+File.separator+"jvela"+File.separator+"Downloads"+File.separator+"star.jpg");

    JLabel background = new JLabel(backgroundImage);
    background.setSize(new Dimension(600, 400));
    background.setLayout(new BorderLayout());
    background.setLayout(null);


    mainPanel.setLayout(null);
    background.setBounds(0, 0, 600, 400);

    // Add the panel to the frame
    add(background);


        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Method();
    }
}
    
    

       
    

   


         
        




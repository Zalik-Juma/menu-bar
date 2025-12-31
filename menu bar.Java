/*
*Name:Zalik Barasa Juma
*Reg No: J77-10594-2024m
*Description: Program for a menu bar
*/
import javax.swing.*;
import java.awt.event.*;

public class SimpleMenuApp {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Menu App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        
        // Create File menu
        JMenu fileMenu = new JMenu("File");
        
        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        // Add actions
        newItem.addActionListener(e -> 
            System.out.println("New menu item clicked"));
        
        openItem.addActionListener(e -> 
            System.out.println("Open menu item clicked"));
        
        exitItem.addActionListener(e -> 
            System.exit(0));
        
        // Add items to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        
        // Add menu to menu bar
        menuBar.add(fileMenu);
        
        // Set menu bar to frame
        frame.setJMenuBar(menuBar);
        
        // Add a label to show something in the window
        JLabel label = new JLabel("Check the File menu in the menu bar!", 
                                 SwingConstants.CENTER);
        frame.add(label);
        
        // Display
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
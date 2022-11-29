package BIODATA;

import javax.swing.*;

public class RunDATA {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("DATA BANK");
        jFrame.setContentPane(new DataBank().getRootPanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600,500);
        jFrame.setVisible(true);
    }
}
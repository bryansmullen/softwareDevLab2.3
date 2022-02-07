package io.bryanmullen;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Store user input of how many eggs have been laid
        String numberOfEggsLaidStr = JOptionPane.showInputDialog(null, "How many eggs have been laid?");
        int numberOfEggsLaid = Integer.parseInt(numberOfEggsLaidStr);
    }
}

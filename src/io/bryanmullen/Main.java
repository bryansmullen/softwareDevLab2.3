package io.bryanmullen;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Store user input of how many eggs have been laid
        String numberOfEggsLaidStr = JOptionPane.showInputDialog(null, "How many eggs have been laid?");
        int numberOfEggsLaid = Integer.parseInt(numberOfEggsLaidStr);

        // Define whether an extra box might be useful or not
        int boxSize = 6;
        boolean extraBoxUseful = numberOfEggsLaid % boxSize == 0;

    }
}

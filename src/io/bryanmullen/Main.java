package io.bryanmullen;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Define main variables
        int numberOfEggsLaid;
        int boxSize = 6;
        boolean extraBoxUseful;
        boolean extraBoxRequested = false;

        // Store user input of how many eggs have been laid
        String numberOfEggsLaidStr = JOptionPane.showInputDialog(
                null,
                "How many eggs have been laid?"
        );
        numberOfEggsLaid = Integer.parseInt(numberOfEggsLaidStr);

        // Define whether an extra box might be useful or not
        extraBoxUseful = numberOfEggsLaid % boxSize != 0;

        // If an extra box might be useful for leftover eggs, offer the user one
        if (extraBoxUseful) {
            String extraBoxStr =
                    JOptionPane.showInputDialog(
                            null,
                            "Would you like an extra box for the " +
                                    "leftover eggs or would you like to risk " +
                                    "breaking them? Type 'y' for yes or 'n' " +
                                    "for no. Default='n'"
                    );
            extraBoxRequested = extraBoxStr.equals("y");
        }

        // Calculate number of boxes needed. If an extra box is both useful for
        // holding leftover eggs and requested, then add 1 extra box
        int numberOfBoxesNeeded =
                extraBoxUseful && extraBoxRequested
                        ? numberOfEggsLaid / boxSize + 1
                        : numberOfEggsLaid / boxSize;

        // Calculate number of eggs left over
        int numberOfEggsLeftover = numberOfEggsLaid % boxSize;

        // Show message of how many boxes are needed
        JOptionPane.showMessageDialog(
                null,
                extraBoxUseful && extraBoxRequested
                ? "You need a total of " + numberOfBoxesNeeded + " boxes " +
                        "because you requested an extra box"
                : "You need a total of " + numberOfBoxesNeeded + " boxes"
                );

        // Show message of how many eggs leftover
        JOptionPane.showMessageDialog(
                null,
                extraBoxUseful && extraBoxRequested
                        ? "You have " + numberOfEggsLeftover + " egg(s) left " +
                                "over which we have put in an extra box to " +
                                "keep safe"
                        :"You have " + numberOfEggsLeftover + " eggs leftover");

        // If user had extra eggs and didn't request an extra box, advise them
        // to next time
        if (extraBoxUseful && !extraBoxRequested){
            JOptionPane.showMessageDialog(
                    null,
                    "Be careful with the leftover eggs. Put them in " +
                            "a bag or something. I don't know. Maybe take " +
                            "the extra box next time!");
        }
    }
}

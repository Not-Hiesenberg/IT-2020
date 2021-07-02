/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import javax.swing.JOptionPane;

/**
 *
 * @author Keeran Moodley
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Keeran Moodley
        // data collection 
        int points = 0;
        String name = JOptionPane.showInputDialog(null, "Enter the name of the player:");
        int postion = Integer.parseInt(JOptionPane.showInputDialog("In what place did the player finish?"));
        int kills = Integer.parseInt(JOptionPane.showInputDialog("How many people did the player eliminate?"));

        // points calcs 
        if (postion == 1) {
            points = 10;
        } else if (postion >= 2 && postion <= 5) {
            points = 7;
        } else if (postion >= 6 && postion <= 15) {
            points = 5;
        } else if (postion >= 16 && postion <= 25) {
            points = 3;
        }
        points = points + kills;

        // output handling placement
        if (postion == 1) {
            JOptionPane.showMessageDialog(null, name + " achieved a Victory Royale!");
        } else if (postion >= 26) {
            JOptionPane.showMessageDialog(null, "The player did not recieve any placemanent points.");
        }

        // output handling scores 
        if (points == 0) {
            JOptionPane.showMessageDialog(null, "The player has a score of 0 for this match.");
        }
        JOptionPane.showMessageDialog(null, name.toUpperCase() + "\nPlaced:" + postion + "\nScore:" + points);
    }

}

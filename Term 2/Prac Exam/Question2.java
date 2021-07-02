/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import javax.swing.JOptionPane;

/**
 *
 * @author Keeran Moodley
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Keeran Moodley

        JOptionPane.showMessageDialog(null, "NEXT SHOW IN...");
        int time = 10;
        while (time > 0) {
            JOptionPane.showMessageDialog(null, time);
            time--;            
        }
        JOptionPane.showMessageDialog(null, "A Strange planet is floating towards the stage...Astroworld...\n\nA giant Travis Scott!!\n\nLet's go!!!", "Travis Scott Fortnite Astroword Concert", JOptionPane.WARNING_MESSAGE);
    }

}

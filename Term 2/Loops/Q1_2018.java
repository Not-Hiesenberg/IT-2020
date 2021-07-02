/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author keeran
 */
public class Q1_2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Keeran Moodley

        //get table 
        int table = Integer.parseInt(JOptionPane.showInputDialog("Enter a whole number indicating which multiplication table you want to view, e.g. 7."));
        // output string 
        String out = table + "X TABLE:\n";

        for (int i = 1; i <= 12; i++) {

            out = out + i + " X " + table + "=" + i * table + "\n";
        }
        JOptionPane.showMessageDialog(null, out, "Multiplication table of "+table, 1);
    }

}

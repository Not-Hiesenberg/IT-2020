/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programme13;

import javax.swing.JOptionPane;

/**
 *
 * @author Keeran
 */
public class Programme13 {

    public static double average(int subject_num) {
        double sum = 0;
        for (int i = 0; i < subject_num; i++) {
            try {
                sum += Integer.parseInt(JOptionPane.showInputDialog("Enter mark."));
            } catch (Exception e) {
                System.out.println("Enter a number");
                i--;
            }
        }
        return sum / subject_num;
    }

    public static void main(String[] args) {
        

    }

}

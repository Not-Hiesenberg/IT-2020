/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sine;

import javax.swing.JOptionPane;

/**
 *
 * @author keera
 */
public class Sine {

    /**
     * @param args the command line arguments
     */
//    Write a program to compute sinx for given x
//    The user should supply x and a positive integer n
//    We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn 
// sin x  = x - x3 / 3! + x5/5! - x7/7! + x9/9! .......
    
    public static void main(String[] args) {
        // TODO code application logic here
        int ang = Integer.parseInt(JOptionPane.showInputDialog("Enter angle"));
        int precision = Integer.parseInt(JOptionPane.showInputDialog("Enter how precise"));
        double sinx=ang;
        for (int i = 1; i <= precision; i++) {
            int fact_term = 1;
            for (int j = 1; j <= i; j++) {
                fact_term = fact_term * j;
            }
            if (i % 2 == 0) {
                sinx = sinx - (Math.pow(ang, 2 * i - 1) / (fact_term));
            } else {
                sinx = sinx + (Math.pow(ang, 2 * i - 1) / (fact_term));
            }

        }
        System.out.println(sinx);
    }

}

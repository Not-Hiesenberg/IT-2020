/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvequadsequences;

import javax.swing.JOptionPane;

/**
 *
 * @author keera
 */
public class SolveQuadSequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Double[] terms = new Double[3];
        terms[0] = Double.parseDouble(JOptionPane.showInputDialog("Enter first term of sequence"));
        terms[1] = Double.parseDouble(JOptionPane.showInputDialog("Enter second term of sequence"));
        terms[2] = Double.parseDouble(JOptionPane.showInputDialog("Enter third term of sequence"));
        //processing 
        Double[] first_diff = new Double[2];
        first_diff[0] = terms[1] - terms[0];
        first_diff[1] = terms[2] - terms[1];

        double second_diff = first_diff[1] - first_diff[0];
        Double[] coeff = new Double[3];
        coeff[0] = second_diff / 2;
        coeff[1] = first_diff[0] - (3 * coeff[0]);
        coeff[2] = terms[0] - coeff[0] - coeff[1];

        //out
        if (coeff[0]>0&&coeff[1]>0&&coeff[2]>0){
            System.out.println("The general form is: " + coeff[0] + "x^2+" + coeff[1] + "x+" + coeff[2]);
        }
        else if(coeff[1]<0&&coeff[2]>0){
            System.out.println("The general form is: " + coeff[0] + "x^2" + coeff[1] + "x+" + coeff[2]);
        }
        else if(coeff[2]<0&&coeff[1]>0){
            System.out.println("The general form is: " + coeff[0] + "x^2+" + coeff[1] + "x" + coeff[2]);
        }
        else {
            System.out.println("The general form is: " + coeff[0] + "x^2+" + coeff[1] + "x+" + coeff[2]);
        }

    }

}

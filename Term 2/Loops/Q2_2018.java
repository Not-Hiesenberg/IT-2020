/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author keera
 */
public class Q2_2018 {

    /**
     * @return 
     */
    public static int generate() {
        int value;
        value = (int) Math.round(Math.random() * 10);
        return value;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        // Keeran Moodley 
        //get type and check validity 
        char type = JOptionPane.showInputDialog("Do you want an addition (a) or subtraction (s) question?").charAt(0);

        if (type != 'a' && type != 's') {
            System.out.println("Invalid input");
            System.exit(0);
        }
        int num_1 = generate();
        int num_2 = generate();
        int answer_correct;
        int input;

        switch (type) {
            case 'a':
                input = Integer.parseInt(JOptionPane.showInputDialog(null, "Solve the following:\n " + num_1 + "+" + num_2 + "="));
                answer_correct = num_1 + num_2;
                break;
            default:
                input = Integer.parseInt(JOptionPane.showInputDialog(null, "Solve the following:\n " + num_1 + "-" + num_2 + "="));
                answer_correct = num_1 - num_2;

        }
        if (input == answer_correct) {
            JOptionPane.showMessageDialog(null, " Well done! You are correct", "Result", 1);
        } else {
            JOptionPane.showMessageDialog(null, " You are incorrect. Try again.", "Result", 0);

        }

    }

}

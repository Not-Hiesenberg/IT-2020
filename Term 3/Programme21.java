/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programme21;

import javax.swing.JOptionPane;

/**
 *
 * @author keera
 */
public class Programme21 {

    public static int random(int low, int high) {
        return (int) Math.round((Math.random() * (high - low) + low));
    }

    public static void game() {
        int num = random(1, 10);
        int user;
        do {
            user = Integer.parseInt(JOptionPane.showInputDialog("Enter num"));
            if (user > num) {
                System.out.println("Num too big");
            } else if (user < num) {
                System.out.println("Num too small");
            }

        } while (user != num);
        System.out.println("well done");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        game();
    }

}

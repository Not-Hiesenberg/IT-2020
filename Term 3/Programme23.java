/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programme23;

import javax.swing.JOptionPane;

/**
 *
 * @author keera
 */
public class Programme23 {

    public static boolean auth() {
        String tag = JOptionPane.showInputDialog("Enter tag");
        String pass = JOptionPane.showInputDialog("Enter pass");
        return tag.equals("Ninja") && pass.equals("NinjaSlender");

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3;
        boolean state;
        do {
            if (i == 0) {
                System.out.println("Acess denied");
                break;
            }
            state = auth();
            if (!state) {
                i--;
                if (i >= 1) {
                    System.out.println("You have " + i + " chances");
                }
            } else {
                System.out.println("Acess granted");
            }
        } while (!state);
    }
}

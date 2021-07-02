/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import javax.swing.JOptionPane;

/**
 *
 * @author Keeran Moodley
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Keeran Moodley
        //inital flowchart handling
        JOptionPane.showMessageDialog(null, "The Battle Bus has launched! I am flying with 99 other players...");
        JOptionPane.showMessageDialog(null, "Jumping out of the bus!");
        JOptionPane.showMessageDialog(null, "I am skydiving! This is fun!");

        // landing
        char landingPlace = JOptionPane.showInputDialog("Mmmm...Where do I want to land?\n\nA. Pleasant Parks\nB. Sweaty Sands\nC. The Authority").toUpperCase().charAt(0);
        switch (landingPlace) {
            case 'A':
                JOptionPane.showMessageDialog(null, "I am gliding towards PLEASANT PARK. The storm has flooded the town...");
                JOptionPane.showMessageDialog(null, "I land on the tallest building.");
                JOptionPane.showMessageDialog(null, "Breaking through the roof.");
                JOptionPane.showMessageDialog(null, "Looking for a weapon...");
                JOptionPane.showMessageDialog(null, "Found some bullets...");
                JOptionPane.showMessageDialog(null, "I need to find a weapon...");
                JOptionPane.showMessageDialog(null, "I hear footsteps behind me...I start to turn around...");
                JOptionPane.showMessageDialog(null, "Argh!!");
                JOptionPane.showMessageDialog(null, "GAME OVER!");
                System.exit(0);
                break;
            case 'B':
                JOptionPane.showMessageDialog(null, "I am gliding towards SWEATY SANDS. I like what the storm has done to this once beautiful beach.");
                JOptionPane.showMessageDialog(null, "Hey look! That guy is skiing behind a shark!");
                JOptionPane.showMessageDialog(null, "I land safely on one of the islands.");
                String swim = JOptionPane.showInputDialog("Mmmm...Do I also want to ride a shark(yes/no)?");
                if (swim.equalsIgnoreCase("yes")) {
                    JOptionPane.showMessageDialog(null, "I jump into the water");
                    JOptionPane.showMessageDialog(null, "Cool! A shark is approaching...");

                } else if (swim.equalsIgnoreCase("no")) {
                    JOptionPane.showMessageDialog(null, "It is not worth the risk!");
                    JOptionPane.showMessageDialog(null, "Argh!!\nA Shark just jumped out of the water\n and is attacking me on land!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid input.");
                    System.exit(0);
                }
                JOptionPane.showMessageDialog(null, "Argh!!");
                JOptionPane.showMessageDialog(null, "GAME OVER!");
                System.exit(0);
            case 'C':
                JOptionPane.showMessageDialog(null, "I land at THE AUTHORITY. Nice loot to grab here but relentless Henchman\nare busy patrolling the building.");
                int userInput = Integer.parseInt(JOptionPane.showInputDialog("I see a Telephone Booth. Should I enter?\n1. Yes\n2. No"));
                boolean henchmen = false;
                if (userInput == 1) {
                    JOptionPane.showMessageDialog(null, "I enter the Telephone Booth");
                    JOptionPane.showMessageDialog(null, "I change to a Henchmen skin...\nThey will not spot me now...");
                    henchmen = true;
                }
                userInput = Integer.parseInt(JOptionPane.showInputDialog("Should I..\n(1)go down the corridor, or \n(2)go down the flight of stairs?"));
                int weaponType = 0; //0= no weapons; 1= dual pistol; 2= assult rifle ( used int value so code is scalable in the event more weapon types are needed)
                switch (userInput) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Great! I have found a Chest!");
                        JOptionPane.showMessageDialog(null, "I open the Chest...");
                        JOptionPane.showMessageDialog(null, "Nice loot!! Dual pistols! Some bullets and wood!");

                        weaponType = 1;
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Great! I have found a Henchmen Chest!");
                        if (henchmen) {
                            JOptionPane.showMessageDialog(null, "I open the Chest...");
                            JOptionPane.showMessageDialog(null, "Cool!! A legendary Assualt Rifle!");

                            weaponType = 2;
                        } else {
                            JOptionPane.showMessageDialog(null, "Argh!\nI cannot open the Chest!\nOnly Henchmen can!");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "I cannot decide! I turn around...");
                }
                JOptionPane.showMessageDialog(null, "I exit the building...");
                JOptionPane.showMessageDialog(null, "Other players are attacking me!");
                if (weaponType == 0) {
                    JOptionPane.showMessageDialog(null, "I do not have any weapons!");
                    JOptionPane.showMessageDialog(null, "Argh!!");
                    JOptionPane.showMessageDialog(null, "GAME OVER!");
                    System.exit(0);
                } else if (weaponType == 1) {
                    JOptionPane.showMessageDialog(null, "I start firing back! Argh!! These Dual Pistols are useless!");
                    int health = 100;
                    while (health > 0) {
                        int damage = (int) Math.round((Math.random() * 30) + 10);
                        if (health >= damage) {
                            health = health - damage; // iterates loop
                        } else {
                            health = 0; //breaks loop

                        }
                        JOptionPane.showMessageDialog(null, "Argh!! Health:" + health);
                    }
                    JOptionPane.showMessageDialog(null, "GAME OVER!");
                    System.exit(0);
                } else if (weaponType == 2) {
                    JOptionPane.showMessageDialog(null, "I start firing back! This legendary rife is awesome!");
                    JOptionPane.showMessageDialog(null, "Cool! I have eliminated the last standing player");
                    JOptionPane.showMessageDialog(null, "Victory Royale!!!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "I went to the kitchen to fetch a drink.\nWhen I came back the bus already passed the island!\nI have fallen into the ocean!");
                JOptionPane.showMessageDialog(null, "GAME OVER!");
                System.exit(0);
        }
    }

}

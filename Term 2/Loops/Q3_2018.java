/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author keera
 */
public class Q3_2018 {

    /**
     * @param user
     * @param computer
     * @return
     */
    public static int checkGameState(int user, int computer) {
        //1 rock 2 siccors 3 paper
        //1 = win
        //2 = lose 
        //3= draw
        int computer_win;
        switch (computer) {
            case 1:
                if (user == 2) {
                    computer_win = 1;
                } else if (user == 3) {
                    computer_win = 2;
                } else {
                    computer_win = 3;
                }
                break;
            case 2:
                if (user == 3) {
                    computer_win = 1;
                } else if (user == 1) {
                    computer_win = 2;
                } else {
                    computer_win = 3;
                }
                break;

            default:
                if (user == 1) {
                    computer_win = 1;
                } else if (user == 2) {
                    computer_win = 2;
                } else {
                    computer_win = 3;
                }
                break;
        }
        return computer_win;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Keeran Moodley
        int score_player = 0;
        int score_computer = 0;
        for (int i = 1; i <= 5; i++) {
            int computer = (int) Math.round((Math.random() * 2)+1);
            int user = Integer.parseInt(JOptionPane.showInputDialog("Enter (1) for rock,(2) for scissors or (3)for paper"));
            //show computewr state 
            switch (computer) {
                case 1:
                    System.out.println("Computer: Rock");

                    break;
                case 2:
                    System.out.println("Computer: Scissors");
                    break;

                default:
                    System.out.println("Computer: Paper");
                    break;

            }
            //print game state and counters 
            if (checkGameState(user, computer) == 1) {
                System.out.println("Computer wins!");
                score_computer++;
            } else if (checkGameState(user, computer) == 2) {
                System.out.println("User wins!");
                score_player++;
            } else {
                System.out.println("Draw!");
            }

        }
        //overal winner testing 
        if (score_player > score_computer) {
            System.out.println("OVERALL WINNER: User!");
        } else if (score_player < score_computer) {
            System.out.println("OVERALL WINNER: Computer!");
        } else {
            System.out.println("OVERALL WINNER: Draw!");
        }
        
        // print scores 
        System.out.println("Games won by player: "+score_player);
        System.out.println("Games won by computer: "+score_computer);
    }

}

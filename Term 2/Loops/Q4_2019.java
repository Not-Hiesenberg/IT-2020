/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4_2019;

/**
 *
 * @author keera
 */
public class Q4_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String output= "";
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                output= output+"#";
            }
            output= output+"\n";
        }
        System.out.println(output);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnum;

/**
 *
 * @author keera
 */
public class ArmstrongNum {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i < 501; i++) {
            int[] digits = new int[3];
            if (i < 10) {
                digits[2] = i;
                if (Math.pow(digits[2], 1) == i) {
                    System.out.println(i);
                }
                continue;
            } else if (i < 100) {
                digits[2] = i % 10;
                digits[1] = (int) i / 10;
                if ((Math.pow(digits[2], 2) + Math.pow(digits[1], 2)) == i) {
                    System.out.println(i);
                }
                continue;
            } else if (i < 1000) {
                digits[2] = i % 10;
                digits[0] = (i - (i % 100)) / 100;
                digits[1] = (i - (digits[0] * 100) - digits[2]) / 10;
                if ((Math.pow(digits[2], 3) + Math.pow(digits[1], 3) + Math.pow(digits[0], 3)) == i) {
                    System.out.println(i);
                }
                continue;
            } else {
                continue;
            }
        }
    }
}

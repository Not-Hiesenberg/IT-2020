/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsmallest;

/**
 *
 * @author keeran
 */
public class FindSmallest {

    public static void findSmallest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + "in the smallst");

        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + "is the smallest ");

        } else {
            System.out.println(num3 + "is the smallest");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        findSmallest(3, 2, 4);

    }
}

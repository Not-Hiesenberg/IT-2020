/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatepword;

/**
 *
 * @author keera
 */
public class ValidatePWord {

    /**
     * @param passw
     * @param args the command line arguments
     */
    
    public static void validate(String passw){
        CharSequence special= new StringBuffer("!@#$%^&*()_+");
        if(passw.length()<10){
            System.out.println("Password must be 10 charcters long");
        }
        if (passw.contains(special)== true){
            System.out.println("Password must only contain letters and digits");
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

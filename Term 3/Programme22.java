
package programme22;

import javax.swing.JOptionPane;


public class Programme22 {

    public static void main(String[] args) {
        // TODO code application logic here
        String pass="KFC";
        String user;
        do{
            user = JOptionPane.showInputDialog("Enter passs");
            if (!user.equals(pass)){
                System.out.println("Acess denied");
            }
        }while(!user.equals(pass));
        System.out.println("Acess granted");
    }
    
}

package javaapplication3;

public class JavaApplication3 {

    public static String build(int w, char character){
        String output ="";
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < i; j++) {
                output+=character;
            }
            output+="\n";
        }
        return output;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(build(10,'A'));
        
    }
    
}

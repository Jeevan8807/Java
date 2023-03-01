import java.util.StringTokenizer;

public class StringTokenizerEg {
    public static void main(String[]args) {
        StringTokenizer s = new StringTokenizer("Chatrapati Shivaji Maharaj");

        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
        
    }
    
}

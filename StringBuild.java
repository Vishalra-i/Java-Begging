/**
 * StringBuild
 */
public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vishal");

        for (int i = 0; i < sb.length()/2 ; i++) {
            int front = i ;
            int back = sb.length() - i - 1 ;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
            
        }
        System.out.println(sb);
        
    }
}
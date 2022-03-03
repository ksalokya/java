import java.util.StringTokenizer;

public class stringBuilderBasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Worl");

        // append
        sb.append('d');
        System.out.println(sb);

        // all functions are same as of StringBuffer

        // Buffer is thread safe i.e. no two threads can call methods of StringBuffer
        // simultaneously. Less efficient.

        // Builder is not thread safe i.e. two threads can call methods of StringBuffer
        // simultaneously. More effecient.


        StringTokenizer t = new StringTokenizer("Hello man. How are you?", " ");
        while(t.hasMoreTokens()){
            System.out.println(t.nextToken());
        }
    }
}

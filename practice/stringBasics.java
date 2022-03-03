public class stringBasics {
    public static void main(String[] args) {

        /*
         * STRING CLASS
         */

        String s1 = "Hello";
        String s2 = "World";

        // length
        System.out.println(s1.length());

        // empty fn
        System.out.println(s1.isEmpty());

        // accessing index
        System.out.println(s1.charAt(1));

        // concatenate
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));

        // compare
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.compareTo(s2));

        // substring
        System.out.println(s1.substring(2));

        // replace
        System.out.println(s1.replace('l', '#'));
        System.out.println(s1.replace("l", "%"));
        System.out.println(s1.replace("llo", "%"));

        // case change
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        // check start/end with
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.startsWith("o"));

        // other data type to String
        int x = 10;
        String t = String.valueOf(x);
        System.out.println(t);
    }
}

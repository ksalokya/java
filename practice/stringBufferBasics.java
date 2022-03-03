public class stringBufferBasics {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // append
        sb.append(" World");
        System.out.println(sb);

        // modify char at particular pos
        StringBuffer temp = new StringBuffer(sb);
        temp.setCharAt(2, '%');
        System.out.println(temp);

        // insert char
        temp.insert(6, '#');
        System.out.println(temp);

        // delete char
        temp.delete(2, 3);
        System.out.println(temp);

        // reverse
        System.out.println(temp.reverse());
    }
}

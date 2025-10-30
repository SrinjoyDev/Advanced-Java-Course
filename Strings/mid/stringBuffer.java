package Strings.mid;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Srinjoy");
        System.out.println(sb.capacity());
        sb.append(" Das");
        System.out.println(sb);

        //convert string buffer to a string
        // String str = sb.toString();
        // System.out.println(str);

        sb.deleteCharAt(1);
        System.out.println(sb);

        //string buffer is thread safe and string builder is not thread safe.
        //rest both does the same thing more over.
    }
}

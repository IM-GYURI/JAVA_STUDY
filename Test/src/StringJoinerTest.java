import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        // String + 연산자 사용
        String a = "a";
        String b = "b";
        String c = "c";

        String alphabet = a + "-" + b + "-" + "c";
        System.out.println(alphabet);


        // StringBuffer, StringBuilder
        StringBuffer sb = new StringBuffer();
        sb.append(a);
        sb.append("-");
        sb.append(b);
        sb.append("-");
        sb.append(c);

        alphabet = sb.toString();
        System.out.println(alphabet);

        StringJoiner sj = new StringJoiner("-");

        sj.add(a);
        sj.add(b);
        sj.add(c);

        alphabet = sj.toString();
        System.out.println(alphabet);

        StringJoiner sj2 = new StringJoiner("-", "[", "]");

        sj2.add(a);
        sj2.add(b);
        sj2.add(c);

        alphabet = sj2.toString();
        System.out.println(alphabet);
    }
}

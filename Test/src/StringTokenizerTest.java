import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("abc def");    // 띄어쓰기(공백) 기준

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer("abc,def", ",");  // 구분자 기준

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer("abc,def", ",", true); // (or false)

        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        String str = "blog > Gyuri! https://newbie-in-softengineering.tistory.com/";
        StringTokenizer st4 = new StringTokenizer(str, ">!");

        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }
    }
}

public class Strings {
    public static void main(String[] args) {
//        String s = "Hello!";
//        s=s.toUpperCase();
//        System.out.println(s);
//
//        String s1 = "Hello";
//        String s2 = " my";
//        String s3 = " friend";
//        String sAll = s1+s2+s3;
//        System.out.println(sAll);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my").append(" friend");
        System.out.println(stringBuilder.toString());

    }
}

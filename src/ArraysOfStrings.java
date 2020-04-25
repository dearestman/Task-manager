

public class ArraysOfStrings {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "привет";
        str[1] = "пока";
        str[2] = "java";
        System.out.println(str[0] + " " + str[2]);

        for (String word:str) {
            System.out.println(word);
        }

    }
}

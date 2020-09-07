import java.util.Scanner;

public class SechsPunktZwei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Normal String: " + str);
        str = str.toLowerCase();
        str = str.replaceAll("a", "@");
        str = str.replaceAll("b", "8");
        str = str.replaceAll("c", "(");
        str = str.replaceAll("e", "3");
        str = str.replaceAll("g", "6");
        str = str.replaceAll("h", "#");
        str = str.replaceAll("i", "!");
        str = str.replaceAll("l", "1");
        str = str.replaceAll("o", "0");
        str = str.replaceAll("s", "$");
        str = str.replaceAll("t", "7");
        str = str.replaceAll("z", "2");

        System.out.println("LeetSpeak: " + str);
    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\$[0-9]+\\.+[0-9]{2}");
        int n = 0;
        System.out.println("input number of digits");
        n = scanner.nextInt();
        String[] str = new String[n+1];
        System.out.println("input US currency");
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            Matcher m = pattern.matcher(str[i]);
            if (m.matches()) {
                System.out.print("Matches the entire text string");
                m.reset();
                System.out.println(str[i]);
            }
        }
    }
}

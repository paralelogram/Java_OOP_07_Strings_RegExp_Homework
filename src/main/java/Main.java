import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input sentence");
        String snt = scanner.nextLine();
        for(int i = 0; i < snt.length(); i++) {
            if (snt.contains("  ")) {
                 snt = snt.replace("  ", " ");
                //  replace = snt.replace("   ", " ");

            }
        }
        System.out.println(snt);
    }
}

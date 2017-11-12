import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("input sentence of five words");
        String snt = scanner.nextLine();
        String[] subsnt = snt.split(" ");
        
        int[] n = new int[subsnt.length];
        int max = n[0];
        
        for (int i = 0; i < subsnt.length; i++) {
            n[i] = subsnt[i].length();
        }

        for (int i = 0; i < subsnt.length; i++) {
            if ( n[i] > max) {
                max = n[i];
            }
        }

        for (int i = 0; i < subsnt.length; i++) {
            if (max == n[i]) {
                System.out.println("the longest word is " +subsnt[i] + ", it`s length is " + subsnt[i].length());
            }
        }
        StringBuffer sa = new StringBuffer(subsnt[1]);
        System.out.println("reversed second word: " + sa.reverse());
    }
}

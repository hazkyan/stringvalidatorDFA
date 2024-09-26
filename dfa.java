import java.util.Scanner;

public class dfa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String state = "q0";
        String input;

        System.out.print("what is your string? ");
        input = sc.nextLine();

        for (int x = 0; x < input.length(); x++) {
            if (state.equals("q0") && input.charAt(x) == '0') {

                state = "q1";
            } else if (state.equals("q0") && input.charAt(x) == '1') {

                state = "q0";
            } else if (state.equals("q1") && input.charAt(x) == '0') {

                state = "q1";
            } else if (state.equals("q1") && input.charAt(x) == '1') {

                state = "q2";
            } else if (state.equals("q2") && input.charAt(x) == '0') {

                state = "q1";
            } else if (state.equals("q2") && input.charAt(x) == '1') {

                state = "q0";
            }
        }

        if (state == "q2") {
            System.out.println("String is accepted");
        } else {
            System.out.println("String is not accepted");
        }
        sc.close();
    }
}

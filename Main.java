package m;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] answers = {"", "Walk", "No", "No", "No", "Yes", "Yes", "backwards", "7"};
        System.out.println(answers[n]);
    }
}
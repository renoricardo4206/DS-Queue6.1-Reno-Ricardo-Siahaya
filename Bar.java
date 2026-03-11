import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur: ");
        String input = sc.nextLine();
        Queue<Integer> queue = new LinkedList<>();
        for (String s : input.split(" ")) {
            queue.add(Integer.valueOf(s));
        }
        List<Integer> passed = new ArrayList<>();
        List<Integer> blocked = new ArrayList<>();

        while (!queue.isEmpty()) {
            int age = queue.remove();
            if (age >= 28 && age <= 118) {
                passed.add(age);
            } else {
                blocked.add(age);
            }
        }
        System.out.println("Passed: " + passed);
        System.out.println("Blocked: " + blocked);  
    }
}
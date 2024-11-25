

import java.util.HashMap;
import java.util.Scanner;

public class Practical8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter the string : ");
        String[] words = sc.nextLine().split(" ");

        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        System.out.println("The Hash map : " + map);

    }
}
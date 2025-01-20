package Assignment6;

import java.util.ArrayList;
import java.util.Random;

public class Bai5 {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            n.add(random.nextInt(100) + 1);
        }
        System.out.println("List: " + n);
        n.remove(3);
        System.out.println("Update list after remove 3: " + n);
    }

}

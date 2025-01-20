package Assignment6;

import java.util.ArrayList;

public class bai3 {

    public static void main(String[] args) {
        ArrayList<Double> n = new ArrayList<>();
        n.add(15.5);
        n.add(20.6);
        n.add(25.7);
        n.add(30.8);
        n.add(35.9);
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
    }
}

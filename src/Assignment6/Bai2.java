package Assignment6;

import java.util.ArrayList;

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");
        color.add("Black");
        color.add("White");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        for (String n : color) {
            System.out.println(n);
        }
    }

}

package Assignment6;

import java.util.ArrayList;

public class Bai4 {

    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();
        city.add("Paris");
        city.add("London");
        city.add("Berin");
        city.add("Danang");
        city.add("Hue");
        for (int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));
        }
        if (city.contains("London")) {
            System.out.println("Co thanh pho london trong danh sach");
        } else {
            System.out.println("Khong thanh pho london trong danh sach");
        }
    }
}

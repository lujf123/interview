package java8.lamda;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        Collections.sort(names, (String o1, String o2) -> {
//            return o2.compareTo(o1);
//        });

        names.sort((a, b) -> b.compareTo(a));

        System.out.println(names.toString());
    }
}

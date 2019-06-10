package java8.lamda_scope;

import java8.default_methods_for_interfaces.Formula;
import java8.functional_interfaces.Converter;

public class Main {

    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter = (from -> {
            outerNum = 23;
            return String.valueOf(from);
        });

        String str = stringConverter.convert(123);

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };

        String str2 = stringConverter2.convert(456);

        System.out.println(str);
        System.out.println(str2);
    }

    public static void main(String[] args) {
    }

}

package java8.functional_interfaces;

public class Main {
    public static void main(String[] args) {
        // TODO 将数字字符串转换为整数类型
        Converter<String, Integer> converter = (from -> Integer.valueOf(from));
        Integer convertered = converter.convert("123");
        System.out.println(convertered.getClass());
    }
}

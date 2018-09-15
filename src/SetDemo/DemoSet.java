package SetDemo;

import java.util.HashSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<String > values = new HashSet<>();
        values.add("Selenum");
        values.add("QTP");
        values.add("Winium");
        values.add("1");
        values.add("abc");

        System.out.println(values);
    }
}

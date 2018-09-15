package SetDemo;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String > values = new LinkedHashSet<>();
        values.add("Selenum");
        values.add("QTP");
        values.add("Winium");
        values.add("1");
        values.add("abc");
        values.add("abc");

        System.out.println(values);
    }
}

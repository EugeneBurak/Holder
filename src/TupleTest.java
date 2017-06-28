/**
 * Created by java_dev on 23.05.17.
 */
public class TupleTest {
    static TwoTuple<String,Integer> f() {
        // Autoboxing converts the int to Integer:
        return new TwoTuple<String,Integer>("hi", 47);
    }
    static ThreeTuple<Automobile,String,Integer> g() {
        return new ThreeTuple<Automobile, String, Integer>(
                new Automobile(), "hi", 47);
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        // ttsi.first = "there"; // Compile error: final
        System.out.println(g());

    }
}

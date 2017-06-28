/**
 * Created by java_dev on 23.05.17.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a) { this.a = a; }
    public void set(T a) { this.a = a; }
    public T get() { return a; }
    public static void main(String[] args) {
        Holder3<Automobile> h3 =
                new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get(); // Преобразование не требуется
        // h3.set("Not an Automobile");// Ошибка
        // h3.set(1); // Ошибка
    }
}

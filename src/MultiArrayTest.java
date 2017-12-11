
public class MultiArrayTest {
    public static void main(String[] args) {

        MultiArray ma = new MultiArray(5, 10);
        System.out.print("Tablica stworzona przez konstruktor:");
        ma.print();

        ma.randomize();
        System.out.print("Tablica wypełniona nowymi wartościami:");
        ma.print();

        System.out.println("Najmniejsza wartość w tablicy to: " + ma.findMin());
        System.out.println("Największa wartość w tablicy to: " + ma.findMax());

    }
}

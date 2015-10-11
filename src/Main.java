import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        long[] maxProduct = split(9);
        System.out.println(Arrays.toString(maxProduct));
    }

    static long[] split(long n) {
        if (n <= 4) return new long[] {n};
        if (n % 2 == 0) return Stream.of(split(n / 2), split(n / 2)).flatMapToLong(Arrays::stream).toArray();
        return Stream.of(split(n / 2), split(n / 2 + 1)).flatMapToLong(Arrays::stream).toArray();
    }
}

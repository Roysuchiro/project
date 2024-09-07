import java.util.Arrays;
import java.util.OptionalInt;

public class random {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,0};
        final int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}

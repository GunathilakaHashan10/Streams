import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConsume {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3,4,5,6,7);

        Stream<Integer> data = nums.stream();

        /* This forEach prints the values in the stream. It means we are consuming the
           data stream. */
        data.forEach(System.out::println);

        /* The forEach tries to consume the data stream again. But data stream is already consumed
         by upper forEach. Therefor we get an exception -->
         Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed */
        data.forEach(System.out::println);

    }
}
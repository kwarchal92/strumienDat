package strumienDat;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        Stream.iterate(LocalDate.now(), ld -> ld.plusDays(1L))
                .limit(10)
                .forEach(System.out::println);
    }
}

package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeWork14TestTask2 {

    @ParameterizedTest
    @MethodSource("arraysTestData")
    void shouldRetTrue (int[] arr, boolean bool) {
        Assertions.assertEquals(HomeWork14.doTask2(arr), bool);
    }

    static Stream<Arguments> arraysTestData() {
        return Stream.of(
          Arguments.arguments(new int[] {1, 3, 4, 1, 4, 1}, false),
          Arguments.arguments(new int[]{1, 1, 4, 4, 1, 4, 1, 1, 1}, true),
          Arguments.arguments(new int[]{1, 1, 1, 1, 4, 4, 4, 4, 4}, true),
          Arguments.arguments(new int[]{1, 1, 1, 1, 4, 4, 7, 4, 4}, false)
        );
    }


}

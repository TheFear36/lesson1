package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class HomeWork14TestTask1 {

    int[] arrInEx = {1, 2, 3, 3, 2, 3, 3, 1, 7};

    @ParameterizedTest
    @MethodSource("arraysTestData")
    void shouldReturnResAfter4(int[] arrIn, int[] arrOut) {
        Assertions.assertArrayEquals(arrOut, HomeWork14.doTask1(arrIn));
    }


    @Test
    void shouldRetRuntimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> HomeWork14.doTask1(arrInEx));
    }

    static Stream<Arguments> arraysTestData() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2, 3, 4, 2, 4, 4, 1, 7}, new int[] {1, 7}),
                Arguments.arguments(new int[] {1, 1, 4, 4, 1, 4, 1, 1, 1}, new int[] {1, 1, 1}),
                Arguments.arguments(new int[] {1, 1, 1, 1, 4, 4, 4, 4, 4}, new int[0])
        );
    }


}

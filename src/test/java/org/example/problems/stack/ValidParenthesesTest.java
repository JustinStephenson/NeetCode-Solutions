package org.example.problems.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @ParameterizedTest
    @MethodSource("isValidParenthesesTestProvider")
    void isValidParenthesesTest(String input, boolean expectedResult) {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> isValidParenthesesTestProvider() {
        return Stream.of(
            Arguments.of("[]", true),
            Arguments.of("([{}])", true),
            Arguments.of("[(])", false)
        );
    }
}
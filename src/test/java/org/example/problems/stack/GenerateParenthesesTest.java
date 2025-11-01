package org.example.problems.stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @ParameterizedTest
    @MethodSource("generateParenthesesTestProvider")
    void generateParenthesesTest(int input, List<String> expectedResult) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> generateParenthesesTestProvider() {
        return Stream.of(
                Arguments.of(1, List.of("()")),
                Arguments.of(3, List.of("((()))","(()())","(())()","()(())","()()()"))
        );
    }
}
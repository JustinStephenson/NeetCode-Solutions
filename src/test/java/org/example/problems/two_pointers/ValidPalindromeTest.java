package org.example.problems.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @ParameterizedTest
    @MethodSource("isPalindromeProvider")
    void isPalindrome(String input) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isPalindrome(input);
        assertTrue(result);
    }

    private static Stream<Arguments> isPalindromeProvider() {
        return Stream.of(
                Arguments.of("Was it a car or a cat I saw?"),
                Arguments.of("No lemon, no melon")
        );
    }

    @ParameterizedTest
    @MethodSource("isNotPalindromeProvider")
    void isNotPalindrome(String input) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean result = validPalindrome.isPalindrome(input);
        assertFalse(result);
    }

    private static Stream<Arguments> isNotPalindromeProvider() {
        return Stream.of(
                Arguments.of("tab a cat"),
                Arguments.of("race a car")
        );
    }
}
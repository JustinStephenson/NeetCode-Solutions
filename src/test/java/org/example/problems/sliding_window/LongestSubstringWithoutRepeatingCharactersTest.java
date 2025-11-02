package org.example.problems.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    @ParameterizedTest
    @MethodSource("longestSubstringWithoutRepeatingCharactersTestProvider")
    void longestSubstringWithoutRepeatingCharactersTest(String input, int expectedResult) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> longestSubstringWithoutRepeatingCharactersTestProvider() {
        return Stream.of(
                Arguments.of("zxyzxyz", 3),
                Arguments.of("xxxx", 1),
                Arguments.of("aab", 2),
                Arguments.of("dvdf", 3),
                Arguments.of("x", 1)
        );
    }
}
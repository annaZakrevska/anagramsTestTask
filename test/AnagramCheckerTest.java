import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {
    static AnagramChecker checker;

    @BeforeAll
    static void setUp() {
        checker = new AnagramChecker();
    }

    @Test
    @DisplayName("Null input")
    void isAnagrams_nullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            checker.isAnagrams(null, null);
        });
        String expectedMessage = "Input contains null values";

        assertEquals(0, exception.getMessage().compareTo(expectedMessage));
    }

    @Test
    @DisplayName("Different lengths")
    void isAnagrams_differentLengths() {
        assertFalse(checker.isAnagrams("car", "race"));
    }

    @Test
    @DisplayName("Same lengths, but there are no anagrams")
    void isAnagrams_sameLengths_notAnagrams() {
        assertFalse(checker.isAnagrams("carr", "race"));
    }

    @Test
    @DisplayName("Same lengths, but there are anagrams")
    void isAnagrams_sameLengths_Anagrams() {
        assertTrue(checker.isAnagrams("care", "race"));
    }

}
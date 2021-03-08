import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUserInputTest {
    ValidateUserInput validateUserInput;
    @BeforeEach
    void setUp() {
        validateUserInput = new ValidateUserInput(1, 2);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatUserInputFirstNumber(){
        validateUserInput.setFirstNumber(1);
        assertEquals(1,validateUserInput.getFirstNumber());
    }
    @Test
    void testThatUserInputSecondNumber(){
        validateUserInput.setSecondNumber(2);
        assertEquals(2,validateUserInput.getSecondNumber());
    }
}
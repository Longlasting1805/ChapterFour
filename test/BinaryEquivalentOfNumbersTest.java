import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryEquivalentOfNumbersTest {
    BinaryEquivalentOfNumbers binaryEquivalentOfNumbers;

    @BeforeEach
    void setUp() {
        binaryEquivalentOfNumbers= new BinaryEquivalentOfNumbers();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatNumbersCanBeEnteredByTheUser(){
        binaryEquivalentOfNumbers.setNumber(12);
        assertEquals(12,binaryEquivalentOfNumbers.getNumber());
    }
    @Test
    void testThatNumbersCanBeConvertedToItsBinaryEquivalent(){
        binaryEquivalentOfNumbers.setNumber(12);
        binaryEquivalentOfNumbers.convertToBinary();
    assertEquals( 1100 ,binaryEquivalentOfNumbers.getBinaryEquivalent());
    }
    @Test
    void testToConvertBinaryToDecimal(){
        binaryEquivalentOfNumbers.setNumber(1101);
        binaryEquivalentOfNumbers.convertToDecimal();
        assertEquals(13,binaryEquivalentOfNumbers.getBinaryEquivalent());

        binaryEquivalentOfNumbers.setNumber(1111);
        binaryEquivalentOfNumbers.convertToDecimal();
        assertEquals(15,binaryEquivalentOfNumbers.getBinaryEquivalent());

    }
}
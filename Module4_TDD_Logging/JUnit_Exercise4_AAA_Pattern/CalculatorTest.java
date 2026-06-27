package Module4_TDD_Logging.JUnit_Exercise4_AAA_Pattern;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {

        calculator = new Calculator();

        System.out.println("Setup Completed");

    }

    @After
    public void tearDown() {

        System.out.println("Cleanup Completed");

    }

    @Test
    public void testMultiply() {

        // Arrange
        int a = 5;
        int b = 4;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);

    }

    private void assertEquals(int i, int result) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

}
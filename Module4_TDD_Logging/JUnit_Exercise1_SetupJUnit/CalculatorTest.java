package Module4_TDD_Logging.JUnit_Exercise1_SetupJUnit;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();

        int result = calculator.add(10, 5);

        assertEquals(15, result);
    }

    private void assertEquals(int i, int result) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}
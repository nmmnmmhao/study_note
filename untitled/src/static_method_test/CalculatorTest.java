package static_method_test;

/**
 *
 * @author tangcz
 *
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = MathUtils::add;
        System.out.println(c.calculate(10, 20));
    }
}

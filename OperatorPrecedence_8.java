// Q8: Operator Precedence
public class OperatorPrecedence {
    public static void main(String[] args) {
        // * has higher precedence than +, so 5*2 is evaluated first
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1 + "  (multiplication first)");

        // parentheses override precedence
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2 + "  (addition first due to parentheses)");

        // mixed: /, *, then +, -
        int result3 = 100 / 5 + 3 * 4 - 2;
        System.out.println("100 / 5 + 3 * 4 - 2 = " + result3 + "  (division and multiplication first)");

        // modulus has same precedence as * and /
        int result4 = 10 % 3 + 4 * 2;
        System.out.println("10 % 3 + 4 * 2 = " + result4);
    }
}

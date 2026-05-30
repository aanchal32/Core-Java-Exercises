// Q7: Type Casting Example
public class TypeCastingExample {
    public static void main(String[] args) {
        // double to int (narrowing)
        double myDouble = 9.99;
        int fromDouble = (int) myDouble;
        System.out.println("double " + myDouble + " cast to int: " + fromDouble);

        // int to double (widening)
        int myInt = 7;
        double fromInt = (double) myInt;
        System.out.println("int " + myInt + " cast to double: " + fromInt);
    }
}

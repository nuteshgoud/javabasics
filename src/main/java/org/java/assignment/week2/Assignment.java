package org.java.assignment.week2;

public class Assignment {

    public static void main(String[] args) {

        Assignment assignment = new Assignment();
        System.out.println(assignment.findGreatestNumber(24, 23, 25));
        System.out.println("--------------------------");
        System.out.println("print the decremented value");
        printDecrementedValue();
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println("Addition of a and b value is:");
        System.out.println(add(4, 45));
        System.out.println("----------------------------");
        System.out.println("Factorial value is:");
        System.out.println(nFactorial(5));
        System.out.println("----------------------------");
        System.out.println("Array traversal reverse value is:");
        arrayTraversalReverse(new int[]{84, 47, 36, 58});

    }

    /*
    1.findGreatestNumber() works only for unique number is assigned to the values of a,b,c
    2.with using the instance of assignment value we got the greatest value.
    3.without using instance we need to use static method to invoke in the main method
        */
    public int findGreatestNumber(int a, int b, int c) {
        System.out.println("----------------------------");
        System.out.println("greatest of three numbers are:");
        if ((a > b) && (a > c)) {
            return a;
        } else if ((b > a) && (b > c)) {
            return b;
        } else {
            return c;
        }
    }

    public static void printDecrementedValue() {
        for (int i = 3; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static int nFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * nFactorial(n - 1);
        }
        //  return (n == 1 || n == 0) ? 1 : n * nFactorial(n - 1);
    }

    public static void arrayTraversalReverse(int[] number) {
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

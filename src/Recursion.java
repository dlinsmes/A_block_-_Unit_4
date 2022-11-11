public class Recursion {
    public static void main(String [] args) {
        System.out.println("2^3 is " + exponent(2, 3));
        System.out.println("2^0 is " + exponent(2, 0));

        System.out.println("2^3 is " + expRecursive(2, 3));
        System.out.println();
        countDownFrom(10);
        System.out.println();
        countUpTo(3);

        System.out.println();

        for(int i = 1; i < 30; i++) {
            System.out.println(fibR(i));
        }

    }

    public static int exponent(int base, int pow) {
        //keep multiplying by done
        int done = 1;
        for (int i = 0; i < pow; i++) {
            done = base * done;
        }
        return done;
    }

    //a recursive method is a method that contains a call to
    //itself within its method body
    //-recursive methods are used when a large problem can be
    //broken down into smaller steps

    // 2^4 = 2 * 2 * 2 * 2
    //     = 2 * 2^3
    //2^3 = 2 * 2^2
    //2^1 = 2 * 2^0
    //2^0 = 1
    //2^n = 2 * 2^(n-1)
    public static int expRecursive(int base, int pow) {

        //base case in recursion is the smallest version of a problem
        //that all larger cases will eventually reach
        //-the base case should not make a recursive call because
        //the solution to the base case should be known
        if (pow == 0)
            return 1;

        //recursive case
        //solve one small step of the problem and call the method
        //again, but with a modified argument to make the overall
        //problem slightly smaller
        else {
            return base * expRecursive(base, pow - 1);
        }
    }

    //if n is 5, the method should print 5 4 3 2 1 0
    public static void countDownFrom(int n) {
        //when writing recursive methods, think about what
        //the base case will be - the smallest version of the problem
        //-and what the recursive case will be

        //the last number printed is always zero
        if (n == 0)
            System.out.print(0 + " ");

        //recursive case - n is a positive number
        //-n itself is printed, then a recursive call is made
        //and n-1 is passed to that call
        else {
            System.out.print(n + " ");
            countDownFrom(n-1);
        }
    }

    public static void countUpTo(int n) {
        if (n == 0)
            System.out.print(0 + " ");

        else {
            //the recursive call needs to finish running
            //before n can print
            countUpTo(n-1);
            System.out.print(n + " ");
        }

    }

    //fibonacci numbers
    //1 1 2 3 5 8 13 21
    //f(1) = 1
    //f(2) = 1
    //f(3) = f(1) + f(2)
    //f(n) = f(n-2) + f(n-1)
    public static int fibR(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibR(n-2) + fibR(n-1);
    }

    //do the same thing but NOT using recursion
    //(iteratively - using loops)
    public static int fibI(int n) {
        int prev2 = 0;
        int prev1 = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            prev2 = prev1;
            prev1 = current;
            current = prev2 + prev1;
        }
        return current;
    }
    //sometimes solutions are easier and more straightforward
    // to write recursively than iteratively

}

public class Methods {
    public static void main(String [] args) {
        //write code that will calculate the sum of numbers
        //between 2 provided numbers:
        //4 and 8 --> 4 + 5 + 6 + 7 + 8

        int small = 4;
        int big = 8;
        int sum = 0;
        for (int i = small; i <= big; i++ ) {
            sum += i;
        }
        System.out.println("sum of numbers from 4 to 8 is " + sum);

        //to solve the sum between two more numbers, you need
        //rewrite this code with new small and big values

        //methods (aka functions) let us define reusable code

        System.out.println("sum 10 to 20: " + sumBetween(10, 20));
        int sum1_10 = sumBetween(1, 10);
        System.out.println("sum 1 to 10: " + sum1_10);

        //if you call a method that doesn't print and you don't
        //print or save the returned value, then nothing
        //visibly happens
        sumBetween(4, 8);

        //the numbers you pass to the function are called arguments
        //-the data type and quantity of arguments need to match
        //the parameters defined for the method

        //sumBetween(2.5, 10); data types don't match
        sumBetween((int)2.5, 10); //the first argument is cast as an int
        //sumBetween(2); quantity of arguments doesn't match


        System.out.println("5! is " + factorial(5 ));

        //method calls can be passed to other method calls
        int anotherSum = sumBetween(factorial(3), factorial(5));
        System.out.println("sum between 3! and 5! is " + anotherSum);

        print("alex");
        //print(4); won't work because the argument needs to be
        //a string
        //can concatenate other data types to an empty string to bypass
        print("" + 4);

        duckduckGoose();

        print("coin is heads: " + coinFlipIsHeads());

        //methods that have a boolean return type can be used
        //directly in if statements and while loops
        if (coinFlipIsHeads() == true) {
            print("heads");
        }
        else
            print("tails");
    }

    //-for now, all methods will start with public static
    //-int is the return type - the method needs to return
    //some kind of int value
    //-return types can be void, meaning no data is returned
    //from the method
    //-sumBetween is the method name
    //-small and big are parameters - like variables that
    //get used in the method that change the outcome of the method

    public static int sumBetween(int small, int big) {
        //treat small and big like variables that already
        //have values
        int sum = 0;
        for (int i = small; i <= big; i++) {
            sum += i;
        }
        //return instead of print sum
        return sum;

    }

    //calculate and return the factorial of n
    // factorial is n * (n-1) * (n-2) * ... * 1
    public static int factorial(int n) {
        int fact = n;
        for (int i = n-1; i > 0; i--) {
            fact *= i;
        }
        //return 2.0; the return data type needs to match
        return fact;
    }

    //methods with a void return type DON'T return any data
    public static void print(String s){
        System.out.println(s);
    }

    //methods can have no parameters
    public static void duckduckGoose() {
        //print some random number of "duck" and then print "goose"
        int rand = (int)(Math.random()* 10);
        for (int i = 0; i < rand; i++)
            //methods can be called from other methods
            print("duck");
        print("goose");

    }

    public static boolean coinFlipIsHeads() {
        double r = Math.random();
        //as soon as a method reaches a return statement,
        //nothing else in the method runs (it stops there)
        //-a method call can only return one value
        if (r < .5) {
            return true;
        }
        return false;
    }
}

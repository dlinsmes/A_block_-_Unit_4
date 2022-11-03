public class VariableScope {
    //warmup:

    //-write a method called rollDice()
    //the parameter is the number of dice to roll
    //the method returns an array filled with each
    //individual roll result

    //arrays can be returned
    public static int [] rollDice(int n) {
        int [] dice = new int[n];
        for (int i = 0; i < n; i++)
            dice[i] = (int)(Math.random() * 6 + 1);
        return dice;
    }

    //-write another method called printDice()
    //where the parameter is an int array
    //in which each value is a die roll.
    //The method doesn't return, but prints in format:
    //Die 1: 4
    //Die 2: 6
    //Die 3: 1
    public static void printDice(int [] rolls) {
        for (int i = 0; i < rolls.length; i++) {
            System.out.println("Die " + (i+1) +": " + rolls[i]);
        }
    }

    public static void main(String [] args) {

        //rollDice() needs an int argument
        int [] rolls1 = rollDice(5);
        for (int roll: rolls1)
            System.out.print(roll + " ");
        System.out.println();

        printDice(rolls1);
        System.out.println();

        //any int array can be passed as an argument to printRolls()
        int [] rolls2 = {5, 6, 1, 2};
        printDice(rolls2);

        System.out.println();
        //directly pass a call of rollDice() to printDice()
        printDice( rollDice(4) );

        int n = 1;
        //variable scope - the n variable in main is separate from
        //the n parameter for rollDice();

        System.out.println();

        int a = 4;
        double b = 6.7;
        boolean c = true;
        String d = "dinosaur";

        doSomething(a, b, c, d);

        //when you pass in primitive data types (int, double, or boolean)
        //OR Strings (not primitive but act like primitives)
        //-a copy of the values is passed so the originals don't get modified
        //by the method
        //-if the method changes any of the values, those changes don't get
        //made to the variables in main()
        System.out.println();

        System.out.println("In main():");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("d is " + d);

        //objects (as opposed to primitives), including arrays,
        // can be changed by methods
        int [] nums = {1, 2, 3};

        System.out.println("nums[0] before calling doSomethingElse() " + nums[0]);
        doSomethingElse(nums);
        System.out.println("nums[0] after calling doSomethingElse() " + nums[0]);

        //a is 4
        changeNum(a);
        System.out.println("a after calling changeNum() " + a);
        a = changeNum(a);
        System.out.println("now a is " + a);

        int [] numbers = {4, 1, 2, 5, 0, 8, 7};
        insertionSort(numbers);

    }

    public static void doSomething(int a, double b, boolean e, String f) {
        a = 0;
        b = 5.5;
        //c = false; c only exists in main - you can't access it outside of main
        e = false;
        f = "duck";
        System.out.println("In doSomething():");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("e is " + e);
        System.out.println("f is " + f);
    }

    public static void doSomethingElse(int [] n) {
        n[0] = 0;
    }

    public static int changeNum(int a) {
        a = a *2;
        return a;
    }

    //selection sort swaps the next smallest value into position

    //insertion sort - building the sorted section at the left of the
    //array
    //-loop through positions to find the next number to sort
    //-look behind the current position to determine if any already-sorted
    //values should be moved up by a position
    //-when there aren't any other larger numbers to move up, insert the
    //current number
    public static void insertionSort(int [] nums) {
        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            //check behind position i to see which values need to be
            //moved up
            int j = i - 1;

            //keep looking behind the current position as long as nums[j] is
            //bigger than current and there are still valid positions
            while(j >= 0 && current < nums[j]) {
                //move the value at position j up by one position
                nums[j+1] = nums[j];

                j--;
            }

            //once enough numbers have been moved up, current can be placed
            //at position j+1
            nums[j+1] = current;

            //see the progress as the insertion sort runs
            for(int n: nums)
                System.out.print(n + " ");
            System.out.println();


        }

    }

}

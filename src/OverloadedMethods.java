public class OverloadedMethods {

    public static void main(String [] args) {
        //string methods
        //length() - int - number of characters
        //equals(String s) - boolean - checks if two strings are the same
        //substring(int beginning) - String - returns the part of
        //the string starting with the index indicated by beginning
        //substring(int beginning, int end) - String - end is the
        //ending index, exclusive

        //indexOf(String s) - int - returns the first index of the
        //occurrence of the substring s in the String, or -1
        //if s isn't in the String

        System.out.println("index of n in banana");
        System.out.println("banana".indexOf("n"));

        System.out.println("index of an in banana");
        System.out.println("banana".indexOf("an"));

        //-1 because the substring isn't in the word
        System.out.println("index of c in banana");
        System.out.println("banana".indexOf("c"));

        //compareTo(String s) - returns int -
        //a.compareTo(b)
        //returns negative if a comes alphabetically before b
        //-positive if b comes before a
        //-zero if a and b are the same string

        System.out.println();
        //negative
        System.out.println("apple".compareTo("banana"));
        //positive
        System.out.println("banana".compareTo("apple"));
        //zero
        System.out.println("apple".compareTo("apple"));

        System.out.println();

        //the numerical value doesn't matter as much as the
        //pos/neg sign
        System.out.println("banana".compareTo("bat"));

        //all capital letters come sequentially before
        //all lowercase letters
        System.out.println("Z".compareTo("a"));

        //use case - sort a list of Strings

        //Overloaded Methods -
        //multiple methods can exist with the same name,
        //as long as the parameters are different

        //substring() is a string method that's overloaded
        //-one version takes one int parameter, the
        //other version takes two int parameters

        System.out.println();
        System.out.println("bigger(4, 8):");
        System.out.println(bigger(4, 8));

        System.out.println();
        System.out.println("bigger(4, 8, 6):");
        System.out.println(bigger(4, 8, 6));

        System.out.println();
        System.out.println("bigger(4, 10, 8, 6):");
        System.out.println(bigger(4, 10, 8, 6));

        print("" + 9);
        print(9);

    }

    public static int bigger(int a, int b) {
        int larger;
        if (a > b)
            larger = a;
        else
            larger = b;
        return larger;
    }


    //when you call a method, java doesn't care about the param names,
    //just the data types of the arguments passed

    //this doesn't work to overload because the quantity and data type
    //of the parameters are the same as the previous - java wouldn't know which
    //version to call
//    public static int bigger(int c, int d) {
//        return -1;
//    }

    //method signatures - name of the method and the quantity and type of
    //parameters
    //-to overload, the method signatures need to be different

    //this works because the type of the parameters changed
    public static int bigger(double c, int d) {
        return -1;
    }

    //overload by using the same method name, but define
    //a different quantity of parameters
    public static int bigger(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static int bigger(int a, int b, int c, int d) {
        //you can call different overloaded versions of the method in this one
        int bigOf3 = bigger(a, b, c); //call version with 3 params

        int biggest = bigger(d, bigOf3);   //call version with 2 params

        return biggest;
    }

    //overload print to accept multiple data types as parameters
    public static void print(String s){
        System.out.println(s);
    }
    public static void print(int s){
        System.out.println(s);
    }
    public static void print(double s){
        System.out.println(s);
    }
    public static void print(boolean s){
        System.out.println(s);
    }
}

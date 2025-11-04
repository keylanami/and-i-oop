public class Lingkaran {
    private static double pi = 3.14; //this is where i initiated the pi number, could use Math.pi or other way but yeah im only being a bit experimental here

    public static double luas(float r){ // same method name, different parameter
        return r * r * pi; //just rumus
    }

    public static double luas(double d){ // it's like treating 2 people with the same name, a different treatment.
        double r = d/2; // but in this case, i made a condition if the argument's data type is double, it will be considered not only as a double but a diameter.
        return r * r * pi;
    }

    public static double keliling(float r){ // same goes to this. 
        return r * 2 * pi;
    }

    public static double keliling(double d){
        return d * pi;
    }
}

// overloading can still work on static
// all i know is Java will choose either of the same method as it first compiles the code
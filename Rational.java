//Maria Vasilkin
//HW 27
//2013.11.18
public class Rational {
    //instance variables
    private static int numerator;
    private static int denominator;
    //default constructor
    public Rational () {
	numerator = 0;
	denominator = 1;
    }
    //constructor
    public Rational (int a, int b) {
	if (b==0) {
	    System.out.println("Denominator can't be 0");
	    numerator = 0;
	    denominator = 1;
	}
	else {
	    numerator = a;
	    denominator = b;
        }
    }

    public String toString() {
	String toString = "";
	toString += numerator / denominator;
	return toString;
    }

    public double floatValue () {
	return (double)(numerator/denominator);
    }
    public void multiply (){
    }
    public void divide () {
    }
}
    

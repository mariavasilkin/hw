//Maria Vasilkin
//HW 27
//2013.11.18
public class Rational {
    //instance variables
    private static int _numerator;
    private static int _denominator;
    //default constructor
    public Rational () {
	_numerator = 0;
	_denominator = 1;
    }
    //constructor
    public Rational (int a, int b) {
	if (b==0) {
	    System.out.println("Denominator can't be 0");
	    _numerator = 0;
	    _denominator = 1;
	}
	else {
	    _numerator = a;
	    _denominator = b;
        }
    }

    public String toString() {
	String ans = "";
	ans += _numerator + "/" +  _denominator;
	return ans; 
    }

    public double floatValue () {
	return (double)(_numerator/_denominator);
    }
    public void multiply (Rational fraction){
       _numerator = fraction._numerator * _numerator;
        _denominator = fraction._denominator * _denominator;
	
    }
    public void divide (Rational fraction) {
	 _numerator = _numerator / fraction._numerator;
	 _denominator = _denominator / fraction._denominator;
    }
    public void add (Rational fraction) {
	_numerator = (_numerator * fraction._denominator) + 
	    (_denominator * fraction._numerator);
	_denominator = _denominator * fraction._denominator;
    }
    public void subtract (Rational fraction) {
	_numerator = (_numerator * fraction._denominator) - 
	    (_denominator * fraction._numerator);
	_denominator = _denominator * fraction._denominator;
    }
    public int gcd () {
	if (_denominator > _numerator){
	    int c = _denominator;
	    _denominator = _numerator;
	    _numerator = c;
	}
	int gcd = 1;
	while (_numerator % _denominator != 0) {
		_denominator = _numerator % _denominator;
	    }
	gcd = _denominator;
	return gcd;
    }
    public void reduce() {
        _numerator =  (_numerator/(gcd()));
	_denominator = (_denominator/(gcd()));
    }
    public static int gcdStatic (int numerator, int denominator) {
	if (denominator > numerator){
	    int c = denominator;
	    denominator = numerator;
	    numerator = c;
	}
	int gcd = 1;
	while (numerator % denominator != 0) {
		denominator = numerator % denominator;
	    }
	gcd = denominator;
	return gcd;
    }
    public int compareTo(Rational fraction) {
	fraction.reduce();
	double a = fraction.floatValue();
	double b = _numerator/_denominator;
	if (a > b) {
	    return(int)  Math.random() *10;
	}
	else if ( a < b) {
	    return (int) Math.random() * -10;
	}
	else {
	    return 0;
	}
    }
    public static void main (String[] args) {
	Rational r = new Rational(2,3); //Stores the rational number 2/3
	System.out.println (r);
	Rational s = new Rational(1,2); //Stores the rational number 1/2
	System.out.println(s);
	Rational t = new Rational(4,18); //Stores the rational number 4/18
	r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2 
	t.reduce(); //Changes t to 2/9
	System.out.println(t);	
    }
}
    

    

public class Complex {
    int re;
    int im;

    public Complex(int re, int im){
        this.re = re;
        this.im = im;
    }
    public Complex(Complex c){
        this.re = c.re;
        this.im = c.im;
    }
    public String displayComplexNumber(){
        return ("The real number is "+ re + "\nThe imaginary number is:"+im);

    }
}

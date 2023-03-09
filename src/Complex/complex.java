package Complex;

// Create Complex class
class Complex {
    int real, image;
 
    public Complex(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
   // Method For print := 
    public void print()
    {
        System.out.println(this.real + " +i " + this.image);
    }
 
    // this function for addition and subtract :=
public static Complex add(Complex c1,
                                    Complex c2)
    {
 
        Complex res = new Complex(0, 0);
 
        res.real = c1.real + c2.real;
 
        res.image = c1.image + c2.image;
 
        return res;
    }

public static Complex subtract(Complex c1,
                                    Complex c2)
    {
 
        Complex res = new Complex(0, 0);
 
        res.real = c1.real - c2.real;
 
        res.image = c1.image - c2.image;
 
        return res;
    }



public static void main(String arg[])
    {
 
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(10, 5);
 
          System.out.print("first C: ");
        c1.print();
         
        System.out.print("\nSecond C: ");
        c2.print();
 
        Complex res = add(c1, c2);
 
        // displaying addition
        System.out.println("\nAddition is :");
        res.print();
    }
}

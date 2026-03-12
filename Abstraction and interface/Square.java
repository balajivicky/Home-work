import java.util.Scanner;

class Square extends Shape 
{
    Square(double side) 
	{
        super(side);
    }

    void calculateArea() 
	{
        double area = value * value;
        System.out.println("Area of Square: " + area);
    }
}
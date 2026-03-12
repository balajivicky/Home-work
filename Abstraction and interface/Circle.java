import java.util.Scanner;

class Circle extends Shape 
{
    Circle(double radius) 
	{
        super(radius);
    }

    void calculateArea() 
	{
        double area = 3.14 * value * value;
        System.out.println("Area of Circle: " + area);
    }
}
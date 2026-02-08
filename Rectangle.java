import java.util.Scanner;

public class Rectangle {

double width = 1,height = 1;
	static double getArea (double width, double height){
	return width * height;
}

        static double getPerimeter(double width, double height) {
        return 2 * (width + height);
    }
public static void main (String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter width:");
	int width = sc.nextInt();

	System.out.println("Enter height:");
	int height = sc.nextInt();

	double A = getArea(width, height);
	double B = getPerimeter(width, height);

	System.out.println("Area of Rectangle = "+ A);

	System.out.println("Perimeter of Rectangle = "+ B);

	sc.close();
}

}
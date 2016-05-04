import java.lang.*;
import java.util.*;

public class prob1 {
	public static void main(String[] argv) {
		System.out.println("Hello world!");
		System.out.print("Please input the magic number > ");
		Scanner scan = new Scanner(System.in);
		double magic_number = scan.nextDouble();
		System.out.println("The magic number you entered is: " + magic_number);
		System.out.println("creating shapes...");
		Shape[] shapes = new Shape[6];
		shapes[0] = new Circle(magic_number);
		shapes[1] = new Square(magic_number);
		shapes[2] = new Triangle(magic_number);
		shapes[3] = new Sphere(magic_number);
		shapes[4] = new Cube(magic_number);
		shapes[5] = new Tetrahedron(magic_number);
		for(int i=0; i<6; i++) {
			// print basic info of the shape
			System.out.println("");
			System.out.println("***** shape[" + i + "] *****");
			System.out.println(shapes[i]);
			if(shapes[i] instanceof TwoDimensionalShape) {
				System.out.println("It is a TwoDimensionalShape!");
				System.out.println("Its area = " + ((TwoDimensionalShape)shapes[i]).getArea());
			} else if(shapes[i] instanceof ThreeDimensionalShape) {
				System.out.println("It is a ThreeDimensionalShape!");
				System.out.println("Its surface area = " + ((ThreeDimensionalShape)shapes[i]).getArea());
				System.out.println("Its volume = " + ((ThreeDimensionalShape)shapes[i]).getVolume());
			}
		}
	}
}

abstract class Shape {
	;
}

abstract class TwoDimensionalShape extends Shape {
	public abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape {
	public abstract double getArea();
	public abstract double getVolume();
}

class Circle extends TwoDimensionalShape {
	// fields
	private double radius;
	
	// actions
	// constructors
	public Circle() {
		// if no parameter provided, set radius to 0
		this.radius = 0.0;
	}
	public Circle(double r) {
		this.radius = r;
	}
	// calculate the area of this 2d shape
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	// toString
	@Override
	public String toString() {
		return "This is a Circle with radius = " + this.radius;
	}
}

class Square extends TwoDimensionalShape {
	// fields
	private double edgelen;

	// actions
	// constructors
	public Square() {
		// if no parameter given, set edge length to 0
		this.edgelen = 0.0;
	}
	public Square(double e) {
		this.edgelen = e;
	}
	// calculate the area
	public double getArea() {
		return this.edgelen * this.edgelen;
	}
	// toString
	@Override
	public String toString() {
		return "This is a Square with edge = " + this.edgelen;
	}
}

class Triangle extends TwoDimensionalShape {
	// fields
	private double edgelen;

	// actions
	// constructors
	public Triangle() {
		this.edgelen = 0.0;
	}
	public Triangle(double e) {
		this.edgelen = e;
	}
	// calculate the area
	public double getArea() {
		return (Math.sqrt(3) / 4.0) * this.edgelen * this.edgelen;
	}
	// toString
	@Override
	public String toString() {
		return "This is a Triangle with edge = " + this.edgelen;
	}
}

class Sphere extends ThreeDimensionalShape {
	// fields
	private double radius;

	//actions
	// constructors
	public Sphere() {
		this.radius = 0.0;
	}
	public Sphere(double r) {
		this.radius = r;
	}
	// calculate the surface area
	public double getArea() {
		return 4.0 * Math.PI * this.radius * this.radius;
	}
	// calculate the volume
	public double getVolume() {
		return (4.0/3.0) * Math.PI * this.radius * this.radius * this.radius;
	}
	// toString
	@Override
	public String toString() {
		return "This is a Sphere with radius = " + this.radius;
	}
}

class Cube extends ThreeDimensionalShape {
	// fields
	private double edgelen;

	// actions
	// constructors
	public Cube() {
		this.edgelen = 0.0;
	}
	public Cube(double e) {
		this.edgelen = e;
	}
	// calculate the surface area
	public double getArea() {
		return 6.0 * this.edgelen * this.edgelen;
	}
	// calculate the volume
	public double getVolume() {
		return this.edgelen * this.edgelen * this.edgelen;
	}
	// toString
	@Override
	public String toString() {
		return "This is a Cube with edge = " + this.edgelen;
	}
}

class Tetrahedron extends ThreeDimensionalShape {
	// fields
	private double edgelen;

	// actions
	// constructors
	public Tetrahedron() {
		this.edgelen = 0.0;
	}
	public Tetrahedron(double e) {
		this.edgelen = e;
	}
	// calculate the surface area
	public double getArea() {
		return Math.sqrt(3) * this.edgelen * this.edgelen;
	}
	// calculate the volume
	public double getVolume() {
		return Math.sqrt(2) / 12.0 * this.edgelen * this.edgelen * this.edgelen;
	}
	// toString
	@Override
	public String toString() {
		return "This is a Tetrahedron with edge = " + this.edgelen;
	}
}



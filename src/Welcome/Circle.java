package Welcome;

public class Circle {
	
	double radius;
	
	public void setRadius(double r) {
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double perimeter() {
		return Math.PI*2*radius;
	}
	public double area() {
		return Math.PI*radius*radius; 
	}
	
	public static void main(String args[]) {
	}
	

}

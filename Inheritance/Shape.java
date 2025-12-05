package Inheritance;

public class Shape {
	int area;
	int noofvertices;
	int noofangles;
	int noofedges;
	static int count;
	 int getArea() {
		return area;
	}
	 void setArea(int area) {
		this.area = area;
	}
	 int getNoofvertices() {
		return noofvertices;
	}
	 void setNoofvertices(int noofvertices) {
		this.noofvertices = noofvertices;
	}
	 int getNoofangles() {
		return noofangles;
	}
	 void setNoofangles(int noofangles) {
		this.noofangles = noofangles;
	}
	 int getNoofedges() {
		return noofedges;
	}
	 void setNoofedges(int noofedges) {
		this.noofedges = noofedges;
	}
	 static int getCount() {
		return count;
	}
	 static void setCount(int count) {
		Shape.count = count;
	}
	Shape(){
		area=78;
		noofvertices=4;
		noofangles=6;
		noofedges=9;
		count++;
		
	}
	  Shape(int area, int noofvertices, int noofangles, int noofedges) {
		super();
		this.area = area;
		this.noofvertices = noofvertices;
		this.noofangles = noofangles;
		this.noofedges = noofedges;
	}
	void display() {
		System.out.println("area is:"+this.area);
		System.out.println("noofvertices is"+this.noofvertices);
		System.out.println("noofangles is"+this.noofangles);
		System.out.println("noofedges is"+this.noofedges);
		
	}
}
class Circle extends Shape{
	double radius;

	 double getRadius() {
		return radius;
	}

	 void setRadius(double radius) {
		this.radius = radius;
	}
	Circle(){
		radius=5.0;
	}

	 Circle(int area, int noofvertices, int noofangles, int noofedges,double radius ) {
		super(area, noofvertices, noofangles, noofedges);
		this.radius = radius;
	}
	void display() {
		super.display();
		System.out.println("radius is:"+this.radius);
	}
	
}
class Traingle extends Shape{
	double base;
	double height;
	 double getBase() {
		return base;
	}
	 void setBase(double base) {
		this.base = base;
	}
	 double getHeight() {
		return height;
	}
	 void setHeight(double height) {
		this.height = height;
	}
	Traingle(){
		base=6.0;
		height=4.0;	
	}
	 Traingle(int area, int noofvertices, int noofangles, int noofedges,double base,double height) {
		super(area, noofvertices, noofangles, noofedges);
		this.base = base;
		this.height = height;
	}
	void display() {
		 super.display();
		System.out.println("base is:"+this.base);
		System.out.println("height is"+this.height);
	}
}
class Rectangle extends Shape{
	double base;
	double height;
	String name;
	 double getBase() {
		return base;
	}
	 void setBase(double base) {
		this.base = base;
	}
	 double getHeight() {
		return height;
	}
	 void setHeight(double height) {
		this.height = height;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	Rectangle(){
		base=10;
	    height=6.0;
	    name="Rectangle";
	    
				
	}
	 Rectangle(int area, int noofvertices, int noofangles, int noofedges,double base,double height,String name ) {
		super(area, noofvertices, noofangles, noofedges);
		this.base = base;
		this.height = height;
		this.name = name;
	}
	void display() {
		 super.display();
		System.out.println("base is:"+this.base);
		System.out.println("height is:"+this.height);
		System.out.println("name is:"+this.name);
	}
	class Inheritance4 {
		public static void main(String[]args) {
			Shape s=new Shape();
			s.display();
			Circle c=new Circle();
			c.display();
			Traingle t=new Traingle();
			t.display();
			Rectangle r=new Rectangle();
			r.display();
			System.out.println("Shape total count is:"+Shape.getCount());
	
}
	}
}
	

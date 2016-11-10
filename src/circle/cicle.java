package circle;									// adress för min klass

class Circle {
		
	final double PI = 3.14;   						// konstant 
	private double radius;							// låsta men kan användas inom klassen
	private double diameter;			// låsta

	double getRadius (){							// metod som svarar på kall om radius utifrån
		return radius;
	}
	
	void setRadius (double radius) {					// möjliggör att ändra värdet på variabel radius från en annan klass
		this.radius=radius;							// this talar om att det är attributet i den här klassen som menas
		
	}
	
	double getDiameter() {
	return radius *2;
	
	
	
	
	
	
	
	}
	
	void setDiameter (double diameter) {
		this.diameter = diameter;
	}
	
	double area () {
		double area = radius * radius * PI;
		return area;
	}
	
	double circumference (){
		double circumfenrence = diameter * PI;
		return circumfenrence;
		
	}
}
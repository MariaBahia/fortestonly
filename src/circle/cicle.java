package circle;									// adress f�r min klass

class Circle {
		
	final double PI = 3.14;   						// konstant 
	private double radius;							// l�sta men kan anv�ndas inom klassen
	private double diameter;			// l�sta

	double getRadius (){							// metod som svarar p� kall om radius utifr�n
		return radius;
	}
	
	void setRadius (double radius) {					// m�jligg�r att �ndra v�rdet p� variabel radius fr�n en annan klass
		this.radius=radius;							// this talar om att det �r attributet i den h�r klassen som menas
		
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
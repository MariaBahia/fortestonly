
package circle;


 class main {
	public static void main (String [] args){
		Circle myCircle=new Circle ();				// instansering
		myCircle.setRadius (3);					// objektet sätter radiusattributet till  3
		System.out.println("The area of the circle with radius "+myCircle.getRadius ()+" is "+myCircle.area() +" km");  //metod där den förbestämda radiusen räknas ut till areal
	}
	}

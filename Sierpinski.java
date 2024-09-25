public class Sierpinski implements Fractal{

	public Curve getStep0() {
		return new Triangle(0.0, 0.0, 1, 0, 0.5, 1);
	}

	
	public Curve getNextStep(Curve curve) {
		Curve a1 = curve.copy();
		a1.scale(.5, .5);
		

		Curve a2 = curve.copy();
		a2.scale(.5, .5);
		a2.translate(.5, 0);

		
		Curve a3 = curve.copy();
		a3.scale(.5, .5);
		a3.translate(.25, .5);		
		
		CompositeCurve c = new CompositeCurve();
		c.add(a1);
		c.add(a2);
		c.add(a3);

		return c;
	}
	
	

}

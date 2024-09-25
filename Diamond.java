
public class Diamond implements Fractal{

	public Curve getStep0() {
		Curve a = new Triangle(0.0, 0.5, 1, .5, 0.5, 0);
		Curve b = new Triangle(0.0, 0.5, 1, .5, 0.5, 1);
		CompositeCurve c = new CompositeCurve();
		c.add(a);
		c.add(b);
		return c;

	}

	
	public Curve getNextStep(Curve curve) {
		curve.scale(.5, .5);
		Curve a = curve.copy();
		a.translate(0, .25);
		
		Curve b = curve.copy();
		b.translate(.5, .25);
		
		Curve c = curve.copy();
		c.translate(.25, 0);
		
		Curve d = curve.copy();
		d.translate(.25, .5);
		
		CompositeCurve e = new CompositeCurve();
		e.add(a);
		e.add(b);
		e.add(c);
		e.add(d);
		return e;
		
	}
	
	



}

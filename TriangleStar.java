
public class TriangleStar implements Fractal{
	public Curve getStep0() {
		return new Triangle(0.25, 0.25, .75, .25, 0.5, .75);
		}
	
	public Curve getNextStep(Curve curve) {
		
		curve.translate(0, -.25);
		Curve a1 = curve.copy();
		curve.scale(1/3.0, 1/3.0);
		
		Curve a2 = curve.copy();
		a2.rotate(63);
		a2.translate(.29, 1/12.0);
		
		Curve a3 = curve.copy();
        a3.rotate(297);
        a3.translate(.55, 1/2.5);
        
        Curve a4 = curve.copy();
        a4.rotate(180);
        a4.translate(.665, 0);

                
        CompositeCurve c = new CompositeCurve();
        c.add(a1);
        c.add(a2);
        c.add(a3);
        c.add(a4);
		c.translate(0, .25);


		return c;
	}
	
	





}

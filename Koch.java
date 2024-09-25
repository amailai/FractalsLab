
public class Koch implements Fractal{
	public Curve getStep0() {
		return new Line(0, .5, 1, .5);
	}
	
	public Curve getNextStep(Curve curve) {
        curve.translate(0, -0.5);
        curve.scale(1/3.0, 1/3.0);

        Curve a1 = curve.copy();

        Curve a2 = curve.copy();
        a2.translate(2/3.0, 0);

        Curve a3 = curve.copy();
        a3.rotate(60);
        a3.translate(1/3.0, 0);

        Curve a4 = curve.copy();
        a4.rotate(300);
        a4.translate(0.5, 0.2887);
        
        CompositeCurve c = new CompositeCurve();
        c.add(a1);
        c.add(a2);
        c.add(a3);
        c.add(a4);

        c.translate(0, 0.5);

        return c;
    }
	
	



}

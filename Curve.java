public interface Curve
{
	public abstract void draw(SketchPad pad);
	
	public abstract void translate(double tx, double ty);
	
	public abstract void scale(double sx, double sy);
	
	public abstract void rotate(double degrees);
	
	public abstract Curve copy();

}
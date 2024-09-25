public interface Fractal
{
	public abstract Curve getStep0();
	
	public abstract Curve getNextStep(Curve curve);

}

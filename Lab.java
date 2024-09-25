public class Lab
{
  public static Curve generateFractal(Fractal fractal, int step)
  {
	 if(step == 0) {
		 return fractal.getStep0();
	 } else {
		 return fractal.getNextStep(generateFractal(fractal, step-1));
	 }
  }
  public static void main(String[] args)
  {
	  SketchPad pad1 = new SketchPad();
	  Fractal a = new Sierpinski();
	  Curve b = generateFractal(a, 3);
	  b.draw(pad1);
	  
	  SketchPad pad2 = new SketchPad();
	  Fractal d = new Koch();
	  Curve c = generateFractal(d, 3);
	  c.draw(pad2);
	  
	  SketchPad pad3 = new SketchPad();
	  Fractal e = new Diamond();
	  Curve f = generateFractal(e, 3);
	  f.draw(pad3);
	  
	 
  }
}
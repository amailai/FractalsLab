import java.util.ArrayList;

public class Triangle implements Curve{
	 private double pointx1;
	 private double pointy1;
	 private double pointx2;
	 private double pointy2;
	 private double pointx3;
	 private double pointy3;

	 
	 public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		 pointx1 = x1;
		 pointy1 = y1;
		 pointx2 = x2;
		 pointy2 = y2;
		 pointx3 = x3;
		 pointy3 = y3;
	 }
	 
	 public void draw(SketchPad pad) {
		pad.drawLine(pointx1, pointy1, pointx2, pointy2);	
		pad.drawLine(pointx2, pointy2, pointx3, pointy3);		
		pad.drawLine(pointx3, pointy3, pointx1, pointy1);		

	}

	public void translate(double tx, double ty) {
		pointx1 += tx;
		pointy1 += ty;
		pointx2 += tx;
		pointy2 += ty;	
		pointx3 += tx;
		pointy3 += ty;
	}

	
	public void scale(double sx, double sy) {
		pointx1 *= sx;
		pointy1 *= sy;
		pointx2 *= sx;
		pointy2 *= sy;		
		pointx3 *= sx;
		pointy3 *= sy;		
	}

	
	public void rotate(double degrees) {
		degrees = Math.toRadians(degrees);
		double newx1 = (pointx1 * Math.cos(degrees)) - (pointy1 * Math.sin(degrees));
		double newy1 = (pointx1 * Math.sin(degrees)) + (pointy1 * Math.cos(degrees));
		double newx2 = (pointx2 * Math.cos(degrees)) - (pointy2 * Math.sin(degrees));
		double newy2 = (pointx2 * Math.sin(degrees)) + (pointy2 * Math.cos(degrees));
		double newx3 = (pointx3 * Math.cos(degrees)) - (pointy3 * Math.sin(degrees));
		double newy3 = (pointx3 * Math.sin(degrees)) + (pointy3 * Math.cos(degrees));
		pointx1 = newx1;
		pointy1 = newy1;
		pointx2 = newx2;
		pointy2 = newy2;	
		pointx3 = newx3;
		pointy3 = newy3;
			
	}

	public Curve copy() {
		Curve a = new Triangle(pointx1, pointy1, pointx2, pointy2, pointx3, pointy3);
		return a;
	}
	 
	
}

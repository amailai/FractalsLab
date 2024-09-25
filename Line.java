import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Line implements Curve {
	 private double pointx1;
	 private double pointy1;
	 private double pointx2;
	 private double pointy2;
	 
	 public Line(double x1, double y1, double x2, double y2) {
		 pointx1 = x1;
		 pointy1 = y1;
		 pointx2 = x2;
		 pointy2 = y2;
	 }

	public void draw(SketchPad pad) {
		pad.drawLine(pointx1, pointy1, pointx2, pointy2);		
	}

	public void translate(double tx, double ty) {
		pointx1 += tx;
		pointy1 += ty;
		pointx2 += tx;
		pointy2 += ty;
		
	}

	public void scale(double sx, double sy) {
		pointx1 *= sx;
		pointy1 *= sy;
		pointx2 *= sx;
		pointy2 *= sy;		
	}

	public void rotate(double degrees) {
		degrees = Math.toRadians(degrees);
		double newx1 = (pointx1 * Math.cos(degrees)) - (pointy1 * Math.sin(degrees));
		double newy1 = (pointx1 * Math.sin(degrees)) + (pointy1 * Math.cos(degrees));
		double newx2 = (pointx2 * Math.cos(degrees)) - (pointy2 * Math.sin(degrees));
		double newy2 = (pointx2 * Math.sin(degrees)) + (pointy2 * Math.cos(degrees));
		pointx1 = newx1;
		pointy1 = newy1;
		pointx2 = newx2;
		pointy2 = newy2;	
	}
	
	public Curve copy() {
		Curve a = new Line(pointx1, pointy1, pointx2, pointy2);
		return a;
	}

	
	
}

import java.util.ArrayList;

public class CompositeCurve implements Curve{
	private ArrayList<Curve> group;

	public CompositeCurve() {
		group = new ArrayList<Curve>();
	}
	
	public void add(Curve curve) {
		group.add(curve);
	}
	
	public void draw(SketchPad pad) {
		for(int i = 0; i < group.size(); i++) {
			group.get(i).draw(pad);
		}
	}

	public void translate(double tx, double ty) {
		for(int i = 0; i < group.size(); i++) {
			group.get(i).translate(tx, ty);
		}		
	}

	public void scale(double sx, double sy) {
		for(int i = 0; i < group.size(); i++) {
			group.get(i).scale(sx, sy);
		}		
			
	}

	public void rotate(double degrees) {
		for(int i = 0; i < group.size(); i++) {
			group.get(i).rotate(degrees);
		}			
	}

	public CompositeCurve copy() {
		CompositeCurve a = new CompositeCurve();
		for(int i = 0; i < group.size(); i++) {
			a.add(group.get(i).copy());
		}	
		return a;
	}

}

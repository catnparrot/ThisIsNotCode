package dpm05.d08.secShapeTri;

public abstract class Shape {
	public abstract String toString();
	
	public abstract void draw();
	
	public void print() {
		System.out.println(toString());
		draw();
	}
}
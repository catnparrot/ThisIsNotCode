package dpm05.d08.secShapeTri;

public class TriangleLU extends AbstTriangle {

	public TriangleLU(int length) {
		super(length);
	}
	
	public void draw() {
		for (int i = getLength(); i >= 1; i--) {
			for (int j = 1; j <= i; j++) 
				System.out.print('*');
			System.out.println();
		}
	}
}

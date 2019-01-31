
public class TriangularPrism extends Prism {
	private double height, width, length;
	public TriangularPrism(double height, double length, double width) {
		super(height, length, width);
		this.height = height;
		this.length = length;
		this.width = width;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		double temp = (length * height) + ((width * height) * 3);
		return Math.round(temp*1.0)/1.0;
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double temp = ((length * height)/ 2) * width;
		return Math.round(temp*1.0)/1.0;
	}

}

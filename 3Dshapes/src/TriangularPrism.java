
public class TriangularPrism extends Prism {
	public TriangularPrism(double height, double length, double width) {
		super(height, width, width);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		System.out.println(height);
		return (length * height) + ((width * height) * 3);
	}
	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return ((length * height)/ 2) * width;
	}

}

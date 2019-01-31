
public class RectangularPrism extends Prism{
	public RectangularPrism(double height, double width, double length) {
		super(height, length, length);
		
		// TODO Auto-generated constructor stub
	}
	public double getSurfaceArea() {
		return ((height * width) * 2) + ((length * height) * 4);
	}
	public double getVolume() {
	
		return (height * width * length);
	}
}


public class RectangularPrism extends Prism{
private double width;
private double length;
	public RectangularPrism(double height, double width, double length) {
		super(height);
		this.width = width;
		this.height = height;
		
		// TODO Auto-generated constructor stub
	}
	public double getSurfaceArea() {
		return ((height * width) * 2) + ((length * height) * 4);
	}
	public double getVolume() {
	
		return (height * width * length);
	}
}

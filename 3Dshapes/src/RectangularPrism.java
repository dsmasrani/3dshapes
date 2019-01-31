
public class RectangularPrism extends Prism{
	public RectangularPrism(double height) {
		this(height,height,height);
	}
	public RectangularPrism(double height, double width, double length) {
		super(height);
		this.width = width;
		this.length = length;
		// TODO Auto-generated constructor stub
	}
	public double getSurfaceArea() {
		double temp = ((height * width) * 2) + ((length * height) * 4);
		return Math.round(temp*1.0)/1.0;
	}
	public double getVolume() {
		double temp = (height * width * length);
		return Math.round(temp*1.0)/1.0;
	}
}

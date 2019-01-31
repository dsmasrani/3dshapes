
public class RectangularPrism extends Prism{
	private double height, length, width;
	public RectangularPrism(double height, double length, double width) {
		//this(height,height,height);
		super(height, length, width);
		this.height = height;
		this.length = length;
		this.width = width;
	}
	/*public RectangularPrism(double height, double width, double length) {
		super(height);
		this.width = width;
		this.length = length;
		// TODO Auto-generated constructor stub
	 }*/
	public double getSurfaceArea() {
		double temp = ((height * width) * 2) + ((length * height) * 4);
		return Math.round(temp*1.0)/1.0;
	}
	public double getVolume() {
		double temp = (height * width * length);
		return Math.round(temp*1.0)/1.0;
	}
}

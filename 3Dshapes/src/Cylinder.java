
public class Cylinder extends Circular{
	final double pi = Math.PI;
	private double radius;
	private double height;
	public Cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		double temp = (2*pi*radius*height) + (2*pi*radius*radius);
		return Math.round(temp*1.0)/1.0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double temp = pi *(radius*radius)*height;
		return Math.round(temp*1.0)/1.0;
	}

}

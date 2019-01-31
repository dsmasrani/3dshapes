
public class Sphere extends Circular {
	private double radius;
	final double pi = Math.PI;
	public Sphere(double radius) {
		this.radius = radius;
		
	}
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		return 4*pi*radius*radius;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return ((4/3)*pi) * (radius*radius*radius);
	}

}

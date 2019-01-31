
public class Sphere extends Circular {
	private double radius;
	final double pi = Math.PI;
	public Sphere(double radius) {
		this.radius = radius;
		
	}
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		double temp = 4*pi*radius*radius;
		return Math.round(temp*1.0)/1.0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double temp = ((4/3)*pi) * (radius*radius*radius);
		return Math.round(temp*1.0)/1.0;
	}

}

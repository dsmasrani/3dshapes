
public class Cone extends Circular {
	private double radius;
	private double height;
	final double pi = Math.PI;
	public Cone (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	@Override
	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		double temp = pi*radius*(radius + Math.sqrt((height*height) + (radius*radius)));
		return Math.round(temp*1.0)/1.0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		double temp = pi*(radius*radius)*(height/3);
		return Math.round(temp*1.0)/1.0;
	}

}

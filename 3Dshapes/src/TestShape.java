
public class TestShape {
	public static void main(String[] args) {
		ThreeDShape Prism1 = new RectangularPrism(4,6,10);
		System.out.println("Rectangular Prism: " + "\nResulting Surface area: " + Prism1.getSurfaceArea()
                + "\nResulting Volume: " + Prism1.getVolume() + "\n");
		
		ThreeDShape Prism2 = new Cube(4);
		System.out.println("Cube: " + "\nResulting Surface area: " + Prism2.getSurfaceArea()
                + "\nResulting Volume: " + Prism2.getVolume() + "\n");
		
		ThreeDShape Prism3 = new TriangularPrism(4,6,10);
		System.out.println("Triangular Prism: " + "\nResulting Surface area: " + Prism3.getSurfaceArea()
                + "\nResulting Volume: " + Prism3.getVolume() + "\n");
		
		ThreeDShape Prism4 = new Sphere(4);
		System.out.println("Sphere: " + "\nResulting Surface area: " + Prism4.getSurfaceArea()
                + "\nResulting Volume: " + Prism4.getVolume() + "\n");
		
		ThreeDShape Prism5 = new Cone(4, 10);
		System.out.println("Cone: " + "\nResulting Surface area: " + Prism5.getSurfaceArea()
                + "\nResulting Volume: " + Prism5.getVolume() + "\n");
		
		ThreeDShape Prism6 = new Cylinder(4, 10);
		System.out.println("Cyliner " + "\nResulting Surface area: " + Prism6.getSurfaceArea()
                + "\nResulting Volume: " + Prism6.getVolume() + "\n");
	}
}

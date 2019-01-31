
public class TestShape {
	public static void main(String[] args) {
		ThreeDShape Prism1 = new Cube(4,6,10);
		System.out.println("\nResulting Surface area: " + Prism1.getSurfaceArea()
                + "\nResulting Volume: " + Prism1.getVolume() + "\n");
	}
}

package Challenge4PoligonArea;

public class Triangle extends Poligon {

    private double length;
    private double width;

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    protected void printArea() {
        System.out.println("El área del triangulo es "+calculateArea());
    }
}

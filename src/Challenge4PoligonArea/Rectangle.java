package Challenge4PoligonArea;

public class Rectangle extends Poligon {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
        }

    @Override
    protected void printArea() {
        System.out.println("El área del rectángulo es "+calculateArea());
    }


}

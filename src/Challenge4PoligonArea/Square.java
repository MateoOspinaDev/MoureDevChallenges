package Challenge4PoligonArea;

public class Square extends Poligon {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    protected void printArea() {
        System.out.println("El área del cuadrádo es "+calculateArea());
    }
}

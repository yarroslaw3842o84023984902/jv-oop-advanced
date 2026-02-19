package core.basesyntax;

public class Circle extends AbstractFigure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14159 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + area() +
                        " sq. units, radius: " + radius +
                        " units, color: " + getColor().name().toLowerCase()
        );
    }
}

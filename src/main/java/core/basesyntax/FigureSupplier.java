package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT_FIGUR = 5;
    ColorSupplier colorSupplier = new ColorSupplier();
    Random randomIndex = new Random();
    public Figure getRandomFigure() {
        switch (randomIndex.nextInt(COUNT_FIGUR)) {
            case 0:
                return new Square(10, colorSupplier.getRandomColor());
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),10, 10);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(), 10, 10);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), 10, 10, 10);
            case 4:
                return new Circle(colorSupplier.getRandomColor(), 10);
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}

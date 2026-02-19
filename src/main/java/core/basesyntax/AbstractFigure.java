package core.basesyntax;

public abstract class AbstractFigure implements Figure, Drawable{
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

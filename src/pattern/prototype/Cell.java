package pattern.prototype;

public class Cell implements Cloneable{
    private Color color;

    public Cell(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Cell clone() {
        try {
            Cell clone = (Cell) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

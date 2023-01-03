package pattern.prototype;

public class Computer implements Cloneable{
    private String name;
    private String os;

    public Computer(String name, String os) {
        this.name = name;
        this.os = os;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public Computer clone() {
        try {
            Computer clone = (Computer) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}

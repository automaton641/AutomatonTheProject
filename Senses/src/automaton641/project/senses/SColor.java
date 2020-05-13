package automaton641.project.senses;

public class SColor {
    float red;
    float green;
    float blue;

    public SColor() {
    }

    public SColor(float red, float green, float blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void update(SColor color) {
        this.red = color.red;
        this.green = color.green;
        this.blue = color.blue;
    }
}

package automaton641.project.senses;

public class SSize {
    int width;
    int height;
    public  SSize() {}
    public  SSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public SSize(SSize size) {
        this.width = size.width;
        this.height = size.height;
    }
}

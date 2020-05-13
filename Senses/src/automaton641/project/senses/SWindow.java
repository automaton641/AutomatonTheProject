package automaton641.project.senses;

public class SWindow {
    String title;
    SSize size;
    SSwing swing;
    SPixelDrawer pixelDrawer;
    public SWindow(String title, int width, int height) {
        this.title = title;
        size = new SSize(width, height);
        pixelDrawer = new SPixelDrawer(size);
        swing = new SSwing(this, title, width, height);
    }
    public void show() {
        swing.show();
    }
    public void repaint() {
        swing.repaint();
    }
}

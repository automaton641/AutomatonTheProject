package automaton641.project.senses;

public class SPixelDrawer {
    SSize size;
    SColor[] pixels;

    public SPixelDrawer(SSize size) {
        this.size = new SSize(size);
        pixels = new SColor[size.width * size.height];
        for (int y = 0; y < size.height; y++) {
            for (int x = 0; x < size.width; x++) {
                pixels[y * size.width + x] = new SColor();
            }
        }
    }
    public void drawPixel(int x, int y, SColor color) {
        if (x < 0|| y < 0 || x >= size.width || y >= size.height)
        {
            return;
        }
        pixels[y * size.width + x].update(color);
    }
    public void drawRectangle(SPosition position, SSize size, SColor color) {
        int y0 = position.y;
        int y1 = y0 + size.height;
        int x0 = position.x;
        int x1 = x0 + size.width;
        for (int y = y0; y < y1; y++)
        {
            for (int x = x0; x < x1; x++)
            {
                drawPixel(x, y, color);
            }
        }
    }
}

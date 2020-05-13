package automaton641.project.senses;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SSwing {
    JFrame frame;
    SCanvas canvas;
    SWindow window;
    SPixelDrawer pixelDrawer;
    SColor[] pixels;
    public void show() {
        frame.setVisible(true);
    }

    class SCanvas extends JComponent {
        BufferedImage image;
        public SCanvas(int width, int height) {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        }
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            Color color;
            SColor sColor;
            for (int y = 0; y < pixelDrawer.size.height; y++) {
                for (int x = 0; x < pixelDrawer.size.width; x++) {
                    sColor = pixels[y*pixelDrawer.size.width + x];
                    color = new Color(sColor.red,sColor.green,sColor.blue);
                    image.setRGB(x, y, color.getRGB());
                }
            }
            graphics.drawImage(image, 0, 0, this);
        }
    }

    public SSwing(SWindow window, String title, int width, int height) {
        this.window = window;
        pixelDrawer = window.pixelDrawer;
        pixels = pixelDrawer.pixels;
        canvas = new SCanvas(width, height);
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.add(canvas);
    }

    public void repaint() {
        canvas.repaint();
    }
}

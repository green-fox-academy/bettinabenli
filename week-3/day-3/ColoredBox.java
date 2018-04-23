import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {

        int n = 2;

        graphics.setColor(Color.red);
        graphics.drawLine(WIDTH / 4, HEIGHT / 4, WIDTH / 4 * n, HEIGHT / 4);

        graphics.setColor(Color.green);
        graphics.drawLine(WIDTH / 4, HEIGHT / 4, WIDTH / 4, HEIGHT / 4 * n);

        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(WIDTH / 4, HEIGHT / 4 * n, WIDTH / 4 * n, HEIGHT / 4 * n);

        graphics.setColor(Color.cyan);
        graphics.drawLine(WIDTH / 4 * n, HEIGHT / 4 * n, WIDTH / 4 * n, HEIGHT / 4);
        // Draw a box that has different colored lines on each edge.

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
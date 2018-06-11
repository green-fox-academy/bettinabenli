import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Board extends JComponent implements KeyListener{

    int tileSizeW = 72;
    int tileSizeH = 72;
    int canvasSizeW = tileSizeW * 10;
    int canvasSizeH = tileSizeH * 10;
    String fileName;
    public AllObjects[][] gameMap = new AllObjects[10][10];
    public Hero hero;

    public Board() {
        readFileCreateArray();
        // set the size of your draw board
        setPreferredSize(new Dimension(canvasSizeW, canvasSizeH));
        this.fileName = "map2.txt";
        setVisible(true);
    }

    public void readFileCreateArray() {
        Path filePath = Paths.get("map2.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j++) {
                    if (lines.get(i).charAt(j) == 'f') {
                        gameMap[i][j] = new Floor("floor.png");
                    } else {
                        gameMap[i][j] = new Wall("wall.png");
                    }
                }
            }

        } catch (IOException e1) {
            System.out.println("no such file");
        }
    }

    public void drawMap(Graphics graphics) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage image = new PositionedImage(gameMap[i][j].getImages(), tileSizeW * j, tileSizeH * i);
                image.draw(graphics);
            }
        }
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        drawMap(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage heroImage = new PositionedImage(hero.getImages(), hero.heroPositionX, hero.getHeroPositionY());
        heroImage.draw(graphics);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
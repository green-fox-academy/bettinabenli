import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Board extends JComponent implements KeyListener {

    private final int SQUARES_WIDTH = 72;
    private final int SQUARES_HEIGHT = 72;
    private final int CANVAS_WIDTH = 10 * SQUARES_WIDTH;
    private final int CANVAS_HEIGHT = 10 * SQUARES_HEIGHT + 12;
    private static Color fontColor = Color.BLACK;
    private static int fontSize = 12;

    String fileName;
    public static Objects[][] gameMap = new Objects[10][10];
    private Hero hero = new Hero();

    public Board(String fileName) {

        this.fileName = fileName;
        readCharactersFromFileIntoATwoDimensionsArray();
        Monster.addMonster(gameMap);

        // set the size of your draw board
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        setVisible(true);
    }

    public void readCharactersFromFileIntoATwoDimensionsArray() {
        Path filePath = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length(); j++) {
                    if (lines.get(i).charAt(j) == 'f') {
                        gameMap[i][j] = new Floor("floor2.png");
                    } else {
                        gameMap[i][j] = new Wall("wall2.png");
                    }
                }
            }

        } catch (IOException e1) {
            System.out.println("Cannot open the file");
        }
    }

    public void drawTheMapWithTiles(Graphics graphics) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                PositionedImage image = new PositionedImage(gameMap[i][j].getImages(), SQUARES_WIDTH * j, SQUARES_HEIGHT * i);
                image.draw(graphics);
            }
        }
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        drawTheMapWithTiles(graphics);
//        int level = 1;
//        int cHP = hero.getCurrentHealthPoint();
//        int mHP = hero.getMaxHealthPoint();
//        int dP = hero.getDefendPoint();
//        int sP = hero.getMaxHealthPoint();
        String statusString = "Hero (Level 1) HP: " + hero.getCurrentHealthPoint() + "/" + hero.getMaxHealthPoint() + " | DP: " +
                hero.getDefendPoint() + " |  SP: " + hero.getStrikePoint();
        // String stat = "Hero : (Level %d) HP: %d/%d | DP: %d | SP: %d", level, cHP, mHP, dP, sP);
        graphics.setColor(fontColor);
        graphics.setFont(new Font("Arial", Font.BOLD, fontSize));
        graphics.drawString(statusString, CANVAS_WIDTH/3,CANVAS_HEIGHT+fontSize/16 );

        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        PositionedImage heroImage = new PositionedImage(hero.getImages(), hero.getHeroPostionX(), hero.getHeroPostionY());
        heroImage.draw(graphics);
        for (Monster monster : Monster.listOfMonsters) {
            PositionedImage monstersImage = new PositionedImage(monster.getImages(), monster.getMonsterPositonX(), monster.getMonsterPositonY());
            monstersImage.draw(graphics);
        }
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        hero.moveHero(e, gameMap);
        for (Monster monster : Monster.listOfMonsters) {
            monster.moveMonster(gameMap);
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
import java.awt.event.KeyEvent;

public class Hero extends Character {
    private int heroPositionX;
    private int heroPositionY;

    public Hero() {
        int d6 = (int) Math.random() * 5 + 1;
        this.heroPositionX = 0;
        this.heroPositionY = 0;
        this.maxHealthPoint = 20 + 3 * d6;
        this.currentHealthPoint = this.maxHealthPoint;
        this.defendPoint = 2 * d6;
        this.strikePoint = 5 + d6;
        this.isAlive = true;
        this.setImages("cat2.png");
    }

    public int getHeroPostionX() {
        return heroPositionX;
    }

    public void setHeroPostionX(int heroPostionX) {
        this.heroPositionX = heroPostionX;
    }

    public int getHeroPostionY() {
        return heroPositionY;
    }

    public void setHeroPostionY(int heroPostionY) {
        this.heroPositionY = heroPostionY;
    }

    public void moveHero(KeyEvent e, Objects[][] gameMap) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (heroPositionY > 0 && gameMap[heroPositionY / 72 - 1][heroPositionX / 72] instanceof Floor) {
                heroPositionY -= 72;
                this.setImages("cat2.png");
                stepCounter++;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (heroPositionY < 648 && gameMap[heroPositionY / 72 + 1][heroPositionX / 72] instanceof Floor) {
                heroPositionY += 72;
                this.setImages("cat2.png");
                stepCounter++;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (heroPositionX < 648 && gameMap[heroPositionY / 72][heroPositionX / 72 + 1] instanceof Floor) {
                heroPositionX += 72;
                this.setImages("cat2.png");
                stepCounter++;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (heroPositionX > 0 && gameMap[heroPositionY / 72][heroPositionX / 72 - 1] instanceof Floor) {
                heroPositionX -= 72;
                this.setImages("cat2.png");
                stepCounter++;
            }
        }
    }
}
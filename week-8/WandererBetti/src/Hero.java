import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Hero extends Character implements KeyListener {

    int heroPositionX;
    int heroPositionY;

    public int getHeroPositionX() {
        return heroPositionX;
    }

    public int getHeroPositionY() {
        return heroPositionY;
    }

    public void setHeroPositionX(int heroPositionX) {
        this.heroPositionX = heroPositionX;
    }

    public void setHeroPositionY(int heroPositionY) {
        this.heroPositionY = heroPositionY;
    }

    public Hero(int heroPositionX, int heroPositionY) {
        this.heroPositionX = 0;
        this.heroPositionY = 0;
        this.setImages("hero-down.png");
    }



    public void moveHero(KeyEvent e, AllObjects[][] gameMap) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (heroPositionY > 0 && gameMap[heroPositionY / 72 - 1][heroPositionX / 72] instanceof Floor) {
                heroPositionY -= 72;
                this.setImages("hero-up.png");
                stepCounter++;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (heroPositionY < 648 && gameMap[heroPositionY / 72 + 1][heroPositionX / 72] instanceof Floor) {
                heroPositionY += 72;
                this.setImages("hero-down.png");
                stepCounter++;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (heroPositionX < 648 && gameMap[heroPositionY / 72][heroPositionX / 72 + 1] instanceof Floor) {
                heroPositionX += 72;
                this.setImages("hero-right.png");
                stepCounter++;
            }

        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (heroPositionX > 0 && gameMap[heroPositionY / 72][heroPositionX / 72 - 1] instanceof Floor) {
                heroPositionX -= 72;
                this.setImages("hero-left.png");
                stepCounter++;
            }
        }
    }
}

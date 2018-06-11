import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Monster extends Character {
    private int monsterPositonX;
    private int monsterPositonY;
    private int levelNumber;
    private boolean isBoss;
    private boolean hasAKey;
    public static List<Monster> listOfMonsters = new ArrayList<>();
    public static Random random = new Random();

    public Monster(int monsterPosX, int monsterPosY) {
        this.monsterPositonX = monsterPosX;
        this.monsterPositonY = monsterPosY;
        int d6 = (int) (Math.random() * 5 + 1);
        this.maxHealthPoint = 2 * levelNumber * d6;
        this.currentHealthPoint = this.maxHealthPoint;
        this.defendPoint = levelNumber / 2 * d6;
        this.strikePoint = levelNumber * d6;
        this.isAlive = true;
        this.isBoss = false;
        this.hasAKey = false;
        this.setImages("mouse.png");
    }

    public int getMonsterPositonX() {
        return monsterPositonX;
    }

    public void setMonsterPositonX(int monsterPositonX) {
        this.monsterPositonX = monsterPositonX;
    }

    public int getMonsterPositonY() {
        return monsterPositonY;
    }

    public void setMonsterPositonY(int monsterPositonY) {
        this.monsterPositonY = monsterPositonY;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public boolean isHasAKey() {
        return hasAKey;
    }

    public void setHasAKey(boolean hasAKey) {
        this.hasAKey = hasAKey;
    }

    public static void addMonster(Objects[][] gameMap) {
        int rndMonsterPositionX = 0;
        int rndMonsterPositionY = 0;
        boolean valid = false;
        int rnd = (int) (Math.random() * 3 + 3);
        for (int i = 0; i < rnd; i++) {
            while (!valid) {
                rndMonsterPositionX = random.nextInt(10);
                rndMonsterPositionY = random.nextInt(10);
                if (gameMap[rndMonsterPositionX][rndMonsterPositionY] instanceof Floor) {
                    if (!wasItAlready(rndMonsterPositionY * 72, rndMonsterPositionX * 72)) {
                        if (rndMonsterPositionY != 0 || rndMonsterPositionX != 0) {
                            valid = true;
                        }
                    }
                }
            }
            valid = false;
            if (i == 0) {
                listOfMonsters.add(new Monster(rndMonsterPositionY * 72, rndMonsterPositionX * 72));
                listOfMonsters.get(i).setBoss(true);
                listOfMonsters.get(i).setImages("dog.png");
            } else if (i == 1) {
                listOfMonsters.add(new Monster(rndMonsterPositionY * 72, rndMonsterPositionX * 72));
                listOfMonsters.get(i).setHasAKey(true);
            } else {
                listOfMonsters.add(new Monster(rndMonsterPositionY * 72, rndMonsterPositionX * 72));
            }
        }
    }

    public static boolean wasItAlready(int rndPositionX, int rndPositionY) {
        if (listOfMonsters != null) {
            for (Monster monster : listOfMonsters) {
                if (monster.getMonsterPositonX() == rndPositionX && monster.getMonsterPositonY() == rndPositionY) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void moveMonster(Objects[][] gameMap) {
        boolean stepHappend = false;
        if (stepCounter != 0 && ((stepCounter & 1) == 0)) {
            do {
                switch ((int) (Math.random() * 3 + 1)) {
                    case 1:
                        if (monsterPositonY > 0 && gameMap[monsterPositonY / 72 - 1][monsterPositonX / 72] instanceof Floor) {
                            monsterPositonY -= 72;
                            stepHappend = true;
                        }
                        break;
                    case 2:
                        if (monsterPositonY < 648 && gameMap[monsterPositonY / 72 + 1][monsterPositonX / 72] instanceof Floor) {
                            monsterPositonY += 72;
                            stepHappend = true;
                        }
                        break;
                    case 3:
                        if (monsterPositonX < 648 && Board.gameMap[monsterPositonY / 72][monsterPositonX / 72 + 1] instanceof Floor) {
                            monsterPositonX += 72;
                            stepHappend = true;
                        }
                        break;
                    case 4:
                        if (monsterPositonX > 0 && Board.gameMap[monsterPositonY / 72][monsterPositonX / 72 - 1] instanceof Floor) {
                            monsterPositonX -= 72;
                            stepHappend = true;
                        }
                        break;
                }
            } while (!stepHappend);
        }
    }
}
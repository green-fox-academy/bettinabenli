public class Character extends Objects {

    protected int maxHealthPoint;
    protected int currentHealthPoint;
    protected int defendPoint;
    protected int strikePoint;
    protected boolean isAlive;
    public static int stepCounter;

    public Character() {
    }

    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public int getCurrentHealthPoint() {
        return currentHealthPoint;
    }

    public int getDefendPoint() {
        return defendPoint;
    }

    public int getStrikePoint() {
        return strikePoint;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public static int getStepCounter() {
        return stepCounter;
    }
}
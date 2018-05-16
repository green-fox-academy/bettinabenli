public class Animal {
    int hunger = 50;
    int thirst = 50;
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        this.hunger ++;
    }

    public void drink() {
        this.thirst ++;
    }

    public void play() {
        this.hunger ++;
        this.thirst ++;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("dog");
        Animal animal2 = new Animal("cat");
    }
}

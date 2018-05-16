public class Tree {

    String type;
    String leafColor;
    int age;
    String sex;

    public Tree(String type, String leafColor, int age, String sex) {
        this.type = type;
        this.leafColor = leafColor;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

        Tree tree1 = new Tree("Candy Tree", "pink", 7, "female");
        Tree tree2 = new Tree("Apple Tree", "medium green", 3, "male");
        Tree tree3 = new Tree("Orange Tree", "dark green", 15, "female");
        Tree tree4 = new Tree("Pine Tree", "silver", 300, "bisex");
        Tree tree5 = new Tree("Peach Tree", "light green", 8, "female");
    }
}

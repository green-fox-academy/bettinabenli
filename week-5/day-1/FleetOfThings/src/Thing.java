public class Thing {

    static int idCounter = 0;

    String text;
    int id;
    String ready;

    public Thing(String text, String ready) {
        this.text = text;
        this.ready = ready;
        this.id = ++idCounter;
    }

    @Override
    public String toString() {
        return "\n" + this.id + ". [" + this.ready + "] " + this.text;
    }

}

public class TodoPrint {

    public static void main(String... args) {
        String todoText = " - Buy milk\n";

        StringBuilder todoList = new StringBuilder(todoText);
        todoList.insert(0, "My todo:\n");
        todoList.append(" - Download games\n\t- Diablo");

        todoText = todoList.toString();
        System.out.println(todoText);
    }
}

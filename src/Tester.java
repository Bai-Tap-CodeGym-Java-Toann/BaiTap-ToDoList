import entry.Entry;
import entry.TodoList;

public class Tester {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        Entry en1 =new Entry(2,"Làm bài tập");
        Entry en2 =new Entry(6,"đi ăn");
        Entry en3 =new Entry(1,"ngủ");
        Entry en4 =new Entry(9,"đi chơi");
        todo.addEntry(en1);
        todo.addEntry(en2);
        todo.addEntry(en3);
        todo.addEntry(en4);
        todo.showToDoList();
    }
}

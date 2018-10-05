package entry;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Entry> list = new ArrayList<Entry>();
    int lenght;

    public void showToDoList() {
        int i = 0;
        for (Entry x : list) {
            System.out.println("("+x.id+")| "+(i+1)+": "+x.note);
            i++;
        }
    }

    public void sortList() {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).priotity < list.get(i + 1).priotity) {
                Entry bak = list.get(i);
                list.set(i,list.get(i + 1));
                list.set(i + 1,bak);
                sortList();
            }
        }
    }
    public void addEntry(Entry entry){
        list.add(entry);
        entry.idGenerator();
        sortList();
    }

    public void removeEntry(int id) {
        list.remove(id);
        sortList();
    }


}

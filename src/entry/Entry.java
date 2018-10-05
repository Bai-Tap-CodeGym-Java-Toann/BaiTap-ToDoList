package entry;

public class Entry {
    int priotity;
    long id;
    String note;

    public Entry(int priotity, String note) {
        this.priotity = priotity;
        this.note = note;
    }

    public void idGenerator() {
        this.id = Math.round(Math.random()*100000+10000);
    }

    public Entry(String note, int priotity) {
        this.priotity = priotity;
        this.note = note;
    }
}

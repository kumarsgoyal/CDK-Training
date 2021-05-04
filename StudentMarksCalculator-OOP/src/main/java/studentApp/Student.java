package studentApp;

public class Student {
    private String name;
    private int id;
    private Marks mark;

    public Student(String name, int id, Marks mark) {
        this.name = name;
        this.id = id;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Marks getMarks() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(Marks mark) {
        this.mark = mark;
    }
}

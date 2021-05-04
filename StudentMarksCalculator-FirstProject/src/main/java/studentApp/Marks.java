package studentApp;

public class Marks {

    double english, science, maths;

    public Marks(double english, double science, double maths) {
        this.english = english;
        this.science = science;
        this.maths = maths;
    }

    void displayMarks() {
        System.out.println("English Marks: " + english);
        System.out.println("Science Marks: " + science);
        System.out.println("Maths Marks: " + maths);
    }
}

package studentApp;

public class Marks {

    private int english, science, maths;

    public Marks(int english, int science, int maths) {
        this.english = english;
        this.science = science;
        this.maths = maths;
    }

    public int getScienceMarks() {
        return science;
    }

    public int getEnglishMarks() {
        return english;
    }

    public int getMathsMarks() {
        return maths;
    }
}

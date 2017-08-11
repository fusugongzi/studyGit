/**
 * Created by 15600 on 2017/6/5.
 */
public class student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

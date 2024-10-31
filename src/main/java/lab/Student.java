package lab;

public class Student extends Person implements ILearner{
    private double totalStudyTime;



    public Student(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}

package lab;

public class Instructor extends Person implements  ITeacher{


    public Instructor(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(ILearner learner, double numberOfHours) {
            learner.learn(numberOfHours);
    }

    @Override
    public void lecture(ILearner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;


        for(ILearner single : learners){
            single.learn(numberOfHoursPerLearner);
        }


    }
}

package lab;

public interface ITeacher {
    void teach(ILearner learner, double numberOfHours);

    void lecture(ILearner[] learners, double numberOfHours);

}

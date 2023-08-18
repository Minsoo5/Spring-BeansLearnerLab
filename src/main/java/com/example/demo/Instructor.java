package java.com.example.demo;
import java.util.Collection;

public class Instructor extends Person implements Teacher{
    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
//       ArrayList<Learner> learnerArrayList = new ArrayList<>((Collection) learners);
//        learners.forEach(learner -> learner.learn(numberOfHours/learnerArrayList.size()));
        learners.forEach(l -> l.learn(numberOfHours / ((Collection) learners).size()));

        }
    }



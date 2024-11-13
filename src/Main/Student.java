package Main;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private List<Course> registeredCourses;
    private List<ExerciseGroup> registeredExerciseGroups;

    public Student(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.registeredCourses = new ArrayList<>();
        this.registeredExerciseGroups = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        course.registerStudent(this);
    }

    public void registerExerciseGroup(ExerciseGroup group) {
        if (group.registerStudent(this)) {
            registeredExerciseGroups.add(group);
        }
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public List<ExerciseGroup> getRegisteredExerciseGroups() {
        return registeredExerciseGroups;
    }
}

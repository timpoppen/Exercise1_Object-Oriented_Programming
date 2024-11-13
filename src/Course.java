import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String name;
    private List<Student> students;
    private Lecturer lecturer;
    private List<ExerciseGroup> exerciseGroups;

    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
        this.students = new ArrayList<>();
        this.exerciseGroups = new ArrayList<>();
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public void addExerciseGroup(ExerciseGroup group) {
        exerciseGroups.add(group);
    }

    public String getCourseId() { return courseId; }
    public String getName() { return name; }

    public List<Student> getStudents() { return students; }
    public Lecturer getLecturer() { return lecturer; }
    public void setLecturer(Lecturer lecturer) { this.lecturer = lecturer; }

    public List<ExerciseGroup> getExerciseGroups() { return exerciseGroups; }
}


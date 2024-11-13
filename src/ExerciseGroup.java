import java.util.ArrayList;
import java.util.List;

public class ExerciseGroup {
    private String groupId;
    private int maxCapacity;
    private String timeSlot;
    private Course course;
    private List<Student> registeredStudents;

    public ExerciseGroup(String groupId, int maxCapacity, String timeSlot, Course course) {
        this.groupId = groupId;
        this.maxCapacity = maxCapacity;
        this.timeSlot = timeSlot;
        this.course = course;
        this.registeredStudents = new ArrayList<>();
    }

    public boolean registerStudent(Student student) {
        if (registeredStudents.size() < maxCapacity) {
            registeredStudents.add(student);
            return true;
        } else {
            return false; // Cannot register, group is full
        }
    }

    public String getGroupId() { return groupId; }
    public int getMaxCapacity() { return maxCapacity; }
    public String getTimeSlot() { return timeSlot; }
    public Course getCourse() { return course; }
    public List<Student> getRegisteredStudents() { return registeredStudents; }
}

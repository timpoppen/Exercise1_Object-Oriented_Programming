import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExerciseGroupManagerTest {

    @Test
    void testCapacitySufficient() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int result = manager.checkGroupCapacities(50, 10, 5);
        assertEquals(0, result, "All students should be accommodated when capacity is sufficient.");
    }

    @Test
    void testCapacityInsufficient() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int result = manager.checkGroupCapacities(55, 10, 5);
        assertEquals(5, result, "Should return the number of students that cannot be accommodated.");
    }

    @Test
    void testTotalStudentsZero() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        int result = manager.checkGroupCapacities(0, 10, 5);
        assertEquals(0, result, "Should return 0 when total students is zero.");
    }

    @Test
    void testGroupSizeZero() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        assertThrows(IllegalArgumentException.class, () -> {
            manager.checkGroupCapacities(50, 0, 5);
        }, "Should throw IllegalArgumentException when groupSize is zero.");
    }

    @Test
    void testAvailableGroupsNegative() {
        ExerciseGroupManager manager = new ExerciseGroupManager();
        assertThrows(IllegalArgumentException.class, () -> {
            manager.checkGroupCapacities(50, 10, -5);
        }, "Should throw IllegalArgumentException when availableGroups is negative.");
    }
}

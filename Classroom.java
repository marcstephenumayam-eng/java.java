public class Classroom {

    public int studentsPresent;
    public int classTime;
    public int roomNumber;
    private int capacity;

    public Classroom(int studentsPresent, int classTime, int capacity) {
        this.studentsPresent = studentsPresent;
        this.classTime = classTime;
        this.capacity = capacity;
        this.roomNumber = classTime;
    }

    public String identify() {
        return "Room Number: " + roomNumber + ", Students Present: " + studentsPresent;
    }

    public int getCapacity() {
        return capacity;
    }
}

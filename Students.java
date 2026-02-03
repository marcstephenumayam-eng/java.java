public class Students {

    public String studentName;
    public String studentId;
    public static int totalStud = 0;

    public Students(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        totalStud++;
    }

    public String identify() {
        return "Student Name: " + studentName + ", ID: " + studentId;
    }

    public int totalStud() {
        return totalStud;
    }
}

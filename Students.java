public class Subjects {

    public String subjectName;
    public int units;

    public Subjects(String subjectName, int units) {
        this.subjectName = subjectName;
        this.units = units;
    }

    public String identify() {
        return "Subject: " + subjectName + ", Units: " + units;
    }
}

public class Teacher {

    public static void main(String[] args) {

    Students student1 = new Students("Umayam, Marc Stephen", "25-3168");
    Students student2 = new Students("Espiritu, Gavrie", "25-3122");
    Students student3 = new Students("Cuaton, Lance ", "25-3133");
        Subjects subject = new Subjects("Intermediate Programming", 3);
        Classroom room = new Classroom(2, 101, 40);

        System.out.println(student1.identify());
        System.out.println(student2.identify());
        System.out.println(student3.identify());
        System.out.println("Total Students: " + Students.totalStud);


        System.out.println(subject.identify());
        System.out.println(room.identify());
        System.out.println("Classroom Capacity: " + room.getCapacity());
    }
}

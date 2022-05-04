package day6;
public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Татьяна Николаевна", "биология");
        Student student = new Student("Кирилл");
        teacher.evaluate(student);
    }
}
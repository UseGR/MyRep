package day6;
public class Teacher {
    private String name;
    private String subject;
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void evaluate (Student student) {
        int evaluation = (int) (2 + Math.random()*5);
        String e = "";
        if (evaluation == 2) {
            e = "неудовлетворительно";
        }else if(evaluation == 3){
            e = "удовлетворительно";
        } else if (evaluation == 4) {
            e = "хорошо";
        } else {
            e = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил(a) студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + e + ".");
    }
}


public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    int verbalGrade;


    public Course() {

    }

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

        int note = 0;
    }


    public void printTeacher() {


        this.teacher.print();


    }

    public void addTeacher(Teacher teacher) {

        if (teacher.brach.equals(this.prefix)) {

            this.teacher = teacher;
            printTeacher();
        } else System.out.println("can t added ");


    }
}

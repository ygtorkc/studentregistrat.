public class Student {
    String name;
    String stuNO;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    public Student() {
    }

    public Student(String name, String stuNO, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNO = stuNO;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int course1note, int course2note, int course3note) {
        if (course1note >= 0 && course1note <= 100) {
            this.course1.note = course1note;
        }
        if (course2note >= 0 && course2note <= 100) {
            this.course2.note = course2note;
        }
        if (course3note >= 0 && course3note <= 100) {
            this.course3.note = course3note;
        }

    }

    public void addBulkVerbalGrade(int course1verbal, int course2verbal, int course3Verbal) {
        if (course1verbal >= 0 && course1verbal <= 100) {
            this.course1.verbalGrade = course1verbal;
        }
        if (course2verbal >= 0 && course2verbal <= 100) {
            this.course2.verbalGrade = course2verbal;
        }
        if (course3Verbal >= 0 && course3Verbal <= 100) {
            this.course3.verbalGrade = course3Verbal;
        }

    }

    public void isPass() {
        calcAvarage();

        if (50 < avarage) {
            this.isPass = true;
            System.out.println("you pass");
        } else {
            this.isPass = false;
            System.out.println("you failed");
        }
        printNote();
        System.out.println("average:" + this.avarage);
    }

    public void calcAvarage() {

        this.avarage = (((this.course1.note * (100 - verbalGradeEffect(course1)) / 100.0) + (this.course1.verbalGrade * (verbalGradeEffect(course1)) / 100.0)) +
                ((this.course2.note * (100 - verbalGradeEffect(course2)) / 100.0) + (this.course2.verbalGrade * (verbalGradeEffect(course2)) / 100.0)) +
                ((this.course3.note * (100 - verbalGradeEffect(course3)) / 100.0) + (this.course3.verbalGrade * (verbalGradeEffect(course3)) / 100.0))) / 3.00;


    }

    public void printNote() {


        System.out.println(this.course1.name + "     grade\t:" + ((this.course1.note * (100 - verbalGradeEffect(course1)) / 100.0) + (this.course1.verbalGrade * (verbalGradeEffect(course1)) / 100.0)));
        System.out.println(this.course2.name + "     grade\t:" + ((this.course2.note * (100 - verbalGradeEffect(course2)) / 100.0) + (this.course2.verbalGrade * (verbalGradeEffect(course2)) / 100.0)));
        System.out.println(this.course3.name + "     grade\t:" +((this.course3.note * (100 - verbalGradeEffect(course3)) / 100.0) + (this.course3.verbalGrade * (verbalGradeEffect(course3)) / 100.0)));

    }

    public int verbalGradeEffect(Course course) {
        int percent = 1;

        if (course.prefix.equals("FZK")) {
            percent = 20;
        }
        if (course.prefix.equals("BIO")) {
            percent = 30;
        }
        if (course.prefix.equals("TRH")) {
            percent = 10;
        }
        if (course.prefix.equals("RSM")) {
            percent = 40;
        }

        return percent;
    }

}



public class Teacher {

    String name;
    String mpno;
    String brach;

    public Teacher() {
    }

    public Teacher(String name, String mpno, String brach) {
        this.name = name;
        this.mpno = mpno;
        this.brach = brach;
    }


    public void print() {

        System.out.println("name:" + this.name + " number :" + this.mpno + " branch :" + this.brach);
    }
}

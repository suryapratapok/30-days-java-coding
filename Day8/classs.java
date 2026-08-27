package Day8;

public class classs {
    public static void main(String[] args) {
      Student s1 = new Student();
      Student s2 = new Student();

      s1.name = "Ashu";
      s1.age = 20;
      s1.rollnumber = 69;
      s1.college = "GNIOT";

      s2.name = "Anant";
      s2.age = 20;
      s2.rollnumber = 96;
      s2.college = "GL Bajaj";

      s1.markAttendence();
      s2.markAttendence();

      s1.details();
      s2.details();



    }
}
class Student{
    String name;
    int age;
    int rollnumber;
    String college;

    void markAttendence(){
        System.out.println("Attendence is marrked " + name);
    }
    void details(){
        System.out.println(name + " , " + age + " , " + rollnumber + " , " +college+ " . ");
    }
}


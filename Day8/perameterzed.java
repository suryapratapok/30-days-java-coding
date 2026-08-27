package Day8;

public class perameterzed {
    public static void main(String[] args) {
        student s1 = new student("Aditya",20,69,"NIET");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollnumber);
        System.out.println(s1.College);

    }
}

class student{
    String name;
    int age;
    int rollnumber;
    String College;

    student(String a, int b, int c,String d){
        name = a;
        age = b;
        rollnumber = c;
        College = d;

    }
}
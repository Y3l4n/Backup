

/**
 * studentInfo
 */
//Tao object student + cac thuoc tinh
public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getstudentName(){
        return name;
    }
    public void setstudentName(String name){
        this.name = name;
    }

    public int getstudentAge(){
        return age;
    }

    public void setstudentAge(int age){
        this.age = age;
    }


    //compare 2 student objects
    //doi thanh static de access static method
    public static boolean compare(Student s1, Student s2){
        if (s1.getstudentName() != s2.getstudentName()) {
            return false;
        }else if (s1.getstudentAge() != s2.getstudentAge()){
            return false;
        }else {
            return true;
        }
    }

    //Ham main de ap cac method trong Student
    public static void main(String[] args) {
        Student s1 = new Student("Hung", 12);
        Student s2 = new Student("Hung", 12);
        boolean compareRes = Student.compare(s1, s2);
        System.out.println(compareRes);
    }

}


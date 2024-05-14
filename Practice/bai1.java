
class Student {
    private String id;
    private String name;

    

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student otherStudent = (Student) obj;

        return id.equals(otherStudent.id) && name.equals(otherStudent.name);
    }
}


public class bai1 {

    public static void main(String[] args) {

        Student s1 = new Student();

    }
}
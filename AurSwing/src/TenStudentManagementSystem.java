//Question No.10

interface Role{
    void displayRole();
}
class Person implements Role{
    private String name;
    private int age;
    private  String address;
    private Role role;

    Person(String name,int age,String address,Role role){
        this.name = name;
        this.age = age;
        this.address = address;
        this.role = role;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public void displayRole(){
        role.displayRole();
    }

}
class Student extends Person{
    int studentID;
    double grade;
    double[] courseScores;

    Student(String name,int age,String address,Role role,int studentID,double grade,double[] courseScores){
        super(name,age,address,role);
        this.studentID = studentID;
        this.grade = grade;
        this.courseScores = courseScores;
    }
    public void displayRole(){

        System.out.println("Role: Student");
    }
    public double calculateAverageScore(){
        double totalscore = 0;
        for (int i=0;i<courseScores.length;i++){
            totalscore = totalscore+courseScores[i];
        }
        double avgScore = totalscore/courseScores.length;
        return avgScore;
    }
}
class Teacher extends Person{
    int teacherID;
    String[] coursesTaught;
    Teacher(String name,int age,String address,Role role,int teacherID,String[] coursesTaught){
        super(name,age,address,role);
        this.teacherID = teacherID;
        this.coursesTaught = coursesTaught;
    }
    public void displayRole(){
        System.out.println("Role: Teacher");
    }
    public void displayCoursesTaught(){
        System.out.println("Courses taught by "+getName()+":");

        for (int i=0;i<coursesTaught.length;i++){
            System.out.println(coursesTaught[i]);
        }
    }
}

public class TenStudentManagementSystem {
    public static void main(String[] args) {
        Role studentRole = new Role() {      //Anonymous Class
            @Override
            public void displayRole() {

                System.out.println("Role: Student");
            }
        };

        Role teacherRole = new Role() {              //Anonymous Class
            @Override
            public void displayRole() {

                System.out.println("Role: Teacher");
            }
        };

        double[] studentScores = {95.5,78.50,68,79.00,91.5};
        Student student = new Student("Mahfuz",23,"Mirer Moydan,Sylhet",studentRole,2122020050,3.63,studentScores);

        String[] teacherCourses = {"Java","EEE","MAT","OOP"};
        Teacher teacher = new Teacher("Mr.Razzak",29,"Subidbazar,Sylhet",teacherRole,7564782,teacherCourses);

        System.out.println("Student Information");
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Address: "+student.getAddress());
        student.displayRole();
        System.out.println("Average Score: "+student.calculateAverageScore());

        System.out.println();

        System.out.println("Teacher Information");
        System.out.println("Name: "+teacher.getName());
        System.out.println("Age: "+teacher.getAge());
        System.out.println("Address: "+teacher.getAddress());
        teacher.displayRole();
        teacher.displayCoursesTaught();
    }
}

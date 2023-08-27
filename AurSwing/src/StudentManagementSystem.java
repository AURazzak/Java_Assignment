//Question N0:9

class Person1{
    private  String name;
    private  int age ;
    private String address;

    Person1(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return  name;
    }
    public int getAge(){
        return  age;
    }
    public String getAddress(){
        return address;
    }
}
class Student1 extends Person1{
    int studentID;
    double grade;
    double[] courseScores;

    Student1(String name,int age,String address,int studentID,double grade,double[]courseScores){
        super(name,age,address);
        this.studentID = studentID;
        this.grade = grade;
        this.courseScores = courseScores;
    }
    public double calculateAverageScore(){
        double totalscore = 0;
        for(int i=0;i<courseScores.length;i++){
            totalscore = totalscore+ courseScores[i];
        }
        double avgTotalScore = totalscore/courseScores.length;
        return avgTotalScore;
    }
}
class Teacher1 extends Person1{
    int teacherID;
    String[] courseTaught;

    Teacher1(String name,int age,String address,int teacherID,String[] courseTaught){
        super(name,age,address);
        this.teacherID = teacherID;
        this.courseTaught = courseTaught;
    }
    public void displayCoursesTaught(){
        System.out.println("Course taught by "+getName()+": ");
        for (int i=0;i<courseTaught.length;i++){
            System.out.println(courseTaught[i]);
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        double[] studentScores = {95.5,87.0,92.5,78.8,93.6};
        Student1 student = new Student1("Razzak",24,"Mirer Moydan,Sylhet",2122020050,3.63,studentScores);

        String[] teacherCourses = {"Java Programing","Numerical Method","Operating Systems","Digital Electronics"};
        Teacher1 teacher = new Teacher1("Jalal Uddin",26,"Munshipara,Sylhet",194758432,teacherCourses);

        System.out.println("Student Information:");
        System.out.println("Name: "+student.getName());
        System.out.println("Age: "+student.getAge());
        System.out.println("Address: "+student.getAddress());
        System.out.println("Student ID: "+student.studentID);
        System.out.println("Grade: "+student.grade);
        System.out.println("Average Score: "+String.format("%.2f",student.calculateAverageScore())); //String.format("%.2f",value) use for 2 digit after decimal

        System.out.println();

        System.out.println("Teacher Information:");
        System.out.println("Name: "+teacher.getName());
        System.out.println("Age: "+teacher.getAge());
        System.out.println("Address: "+teacher.getAddress());
        System.out.println("Teacher ID: "+teacher.teacherID);
        teacher.displayCoursesTaught();
    }
}

public class Student{
    // Object attributes
    String name;
    int age;
    String studentID;
    boolean validStudentID;
    int semesterNR;
    double avgGrade;
    
    // Object behaviours(methods)
    public void sayHello(){
        System.out.println("Hello friends");
    }
    
    public void displayInfo(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Semester NR:" + semesterNR);
        System.out.println("Average Grade:"+ avgGrade);
    }
    
    public void changeValid(boolean status){
        if (validStudentID && !status){
            validStudentID = true;
            System.out.println("Student ID is active");
        } else {
            validStudentID = false;
            System.out.println("Student ID is not active");
        }
    }
    public void displayBaseInfo(){
        System.out.println("Information about student");
        System.out.println("Name:"+ name);
        System.out.println("ID card number:" + studentID);
        System.out.println("Status of studentID:" );
        if (validStudentID){System.out.println("Valid.");}
        else {System.out.println("Not Valid.");}
        System.out.println("-----------------");
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Vlad";
        s1.age = 18;
        s1.studentID = "222563";
        s1.validStudentID = true;
        s1.semesterNR = 3;
        s1.avgGrade = 3.5;
        s1.displayInfo();
        s1.changeValid(false);
        s1.displayBaseInfo();
    }
}
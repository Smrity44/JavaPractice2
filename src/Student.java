public class Student {

    String name;
    String email;
    String course;

    public Student(){
        System.out.println("I am creating an object for you!");
    }

    public void accessLms(){
        System.out.println("Now you can access lms");
    }
    public void accessSlack(){
        System.out.println("Now i can send a message to your class member");
    }
    public Student(String name, String email){
        this.name = name;
        this.email = email;
        course = "QA";
    }

    public void testMethod(){
        System.out.println("This is the test Method");
    }

    public static void main(String[] args){
        Student student1= new Student();
        Student student2= new Student();
        student1.name="Safaet";
        student1.email="safaet123@gmail.com";
        student1.course="Qa";
        student2.name="fatema";
        student2.email="fatema223@gmail.com";
        student2.course="DevOps";
        student1.accessSlack();
        student1.accessLms();
        student2.accessSlack();
        student2.accessLms();
        Student student3 = new Student("Student","email");
    }

}

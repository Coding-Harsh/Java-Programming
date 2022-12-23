package object_oriented_programming;

public class Student_classUse {

    public static void main(String[] args) throws Exception{
        
        // Creating object of the Class Student;

        // ✨ while creating the object an default constructor is created by its own

        // ✨ for a particular object constructor is called only one's
        
        Student s1 = new Student("Harsh",30);

        System.out.println(s1);

        s1.print();

       
        
        // System.out.println(s1.name);
        // System.out.println(s1.get_rollNumber());

        /*✨ While default constructor is called intially 
        all the datamember is initialized to NuLL or ZERO*/

        Student s2 = new Student("Anup",4);
        s2.print();

        /*System.out.println(s1.num_students);
        System.out.println(s2.num_students);*/

        System.out.println(Student.getNumStudents());

        // The best way and recommended way to access Static datamember is by using class

       
    }
    
}

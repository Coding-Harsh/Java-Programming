package object_oriented_programming;

public class Student{

    String name;   // ✨ The access modifier called by default is called default modifier or friendly modifier
    
   private final int rollNumber; // ✨ Final data_member can be initialized as soon as they are declared 

   static int num_students;

   // ✨ The static variable will be shared among all the objects of the class (which is not unique for each object),

    


    // CREATING THE OWN CONSTRUCTOR 
    
    // ✨ Another way we can initialize final data_member is by using constructor

    public static int getNumStudents(){

        return num_students;
    }

    public Student(String name, int rollNumber){

        System.out.println(this);
        this.name = name;          // ✨ this is the reference variable that refers to the current object of the class
        this.rollNumber = rollNumber;
         // ✨ This access datamember which has same name as a local variable  
         
         num_students++;
    }

    /*  ✨ using getter and setter we can in-directly access
        the private data member of the particular class  */
        

   /*
       public void set_rollNumber(int rn){
     
       if(rn<=0) {
     
       return;
       }
     
       rollNumber = rn;
       }
    */

    public int get_rollNumber(){

        return rollNumber;
    }

    public void print(){
    
        System.out.println(name+" : " + rollNumber);
    }
    
}

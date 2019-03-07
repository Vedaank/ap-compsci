/**
 * L.A.11.1
 *
 * A student, is a Person with an id number and
 * a grade point average
 */

public class Student extends Person
{
  private String id;    	// Student Id Number
  private double gpa;      	// grade point average

   //******************* constructor ***********************/
  public Student(String name, int age, char gender,
                 String id, double gpa)
  {
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    this.id = id;
    this.gpa = gpa;
  }

   //******************* get methods ***********************/
  public String getId()
  {
    return id;
  }

  public double getGPA()
  {
    return gpa;
  }
    
  public String toString()
  {
    return super.toString() + ", student id: " + id + ", gpa: " + gpa;
  }

 //******************* set methods ***********************/
  public void setIdNum(String id)
  {
    this.id = id;
  }

  public void setGPA(double gpa)
  {
    this.gpa = gpa;
  }
}

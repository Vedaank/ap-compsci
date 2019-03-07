/**
 * A Person class used to define a very basic person.
 *
 * Modified by Jason Quesenberry and Nancy Quesenberry January 20, 2006
 *
 */

public class Person
{
  private String name;    	// name of the person
  private int age;        	// person's age
  private char gender;    	// 'M' for male, 'F' for female

  //******************* constructor ***********************/
  public Person(String name, int age, char gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  //******************* get methods ***********************/
  public String getName()
  {
    return name;
  }

  public int getAge()
  {
    return age;
  }

  public char getGender()
  {
    return gender;
  }
  
  public String toString()
  {
    return name + ", age: " + age + ", gender: " + gender;
  }

  //******************* set methods ***********************/
  public void setName(String name)
  {
    this.name = name;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }
}
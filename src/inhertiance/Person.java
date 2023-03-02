package inhertiance;

public class Person {

    // anything marked as private does not get inherited
    private String name;
    private int age;
    private String gender;

    public Person(){
        System.out.println("Person Default Constructor");
    }

    public Person(String name){
        System.out.println("Person 2nd Constructor. Name is set");
    }

    public String getName(){return name;}
    public void setName(String name){ this.name = name; }
    public int getAge(){ return age;}
    public void setAge(int age){ this.age = age;}
    public String getGender(){return gender;}
    public void setGender(String gender){ this.gender = gender; }




}

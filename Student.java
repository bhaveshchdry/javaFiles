//this is the example of secured code i.e, how we make data private and then how can we access them through a validation process.

public class Student {
    private int age;
    private char gender;

    public int getAge() {         //for getting the age
        //we can implement a validation process here i.e, if the person is valid then only it'll return the value
        return age;
    }

    public void setAge(int age) {      //for setting the age
        this.age = age;
    }

    public char getGender() {            //for getting the gender
        //we can implement a validation process here i.e, if the person is valid then only it'll return the value
        return gender;
    }

    public void setGender(char gender) {       //for setting the gender
        this.gender = gender;
    }
}
class StudentMain{
    public static void main(String[] args) {
        Student bhavesh= new Student();
        bhavesh.setAge(19);      //setting age
        bhavesh.setGender('M');  //setting gender
        System.out.println(bhavesh.getAge()+ "        "+ bhavesh.getGender());    //now calling getters for getting data and print them
    }
}

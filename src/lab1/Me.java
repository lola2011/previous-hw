package lab1;

import java.io.FileWriter;
import java.io.IOException;

public class Me {
    private String education;
    private Integer age;

    public void eat(Eatable eatable) {
        if (eatable instanceof Honey)
            System.out.println("I am eating " + eatable.getName());
    }
    // public void eat(Eatable eatable) throws Exception{
    //   if(eatable instanceof Honey) throw new Exception("");}
//System.out.println("I am eating " + eatable.getName());
    //FileWriter fileWriter=new FileWriter("food.txt");
  //  fileWriter.write(eatable.getName());

    public void go(String place) {
        if (place==null)try{throw new Exception();}
        catch (Exception e){
            System.out.println("I cant go nowhere");//+e.getMessage
        }
        System.out.println("I go to " + place);
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

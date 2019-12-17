package home;

public class Program {

    private String name;
    private Integer age;


    public Program(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void print(){

        if (age <= 16) {
            System.out.println("Hello, " + name + "!You are so small.");
        }else if (age < 18){
            System.out.println("Hello, " + name + "!You are a teenager.");
        }else if (age > 18){
            System.out.println("Hello, " + name + "!You are adult");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

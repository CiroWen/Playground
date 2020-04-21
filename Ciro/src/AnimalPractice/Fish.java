package AnimalPractice;

public class Fish extends Animal implements Pet{
    private String name;
    Fish(){
        super(0);
        name = "fish";
    }
    public void walk() {
        System.out.println("Fish's walking");
    }
    public void eat() {
        System.out.println("fish's eating");
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println("fish's playing");
    }
}

package AnimalPractice;

public class Cat extends Animal implements Pet{
    String name ;
    
    Cat(String name){
        super(4);
        this.name = name;
    }
    
    Cat(){
        this("cat");
        
    }

    void eat() {
        System.out.println("Cat's eating");
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void play() {
        System.out.println("cat's playing");
    }
}

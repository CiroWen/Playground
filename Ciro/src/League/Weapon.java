package League;

public class Weapon extends Item{
    int dmg;
    public static void main(String[] args) {
        Weapon w1 = new Weapon();
        w1.dmg = 99;
        w1.price=999;
        w1.name="hhh";
        Item i1 = new Weapon();
        //i1.dmg = 99; // this command wont compile since there is no dmg instance in Item class.
        System.out.println(w1.dmg);
    }
}

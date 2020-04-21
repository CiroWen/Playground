package League;

public class Item {
    String name;
    int price;
    
    Item(){
        System.out.println("1");
    }
    
    public static Item item;
    public static Item getInstance() {
        if (item == null);
        item = new Item();
        return item;
    }
    public static void main(String[] args) {
        Item hpPotion = new Item();
        Item shoes = new Item();
        Item sword = new Item();
        hpPotion.name = "Health Potion";
        hpPotion.price = 50;
        shoes.name = "Shoes of Speed";
        shoes.price = 300;
        sword.name = "Long Sword";
        sword.price = 350;
        
        System.out.println(new Item());
        jumpto:///???? what's the diff between : and only using break
            for(int i =0; i<99;i++) {
                System.out.println(i);
                if (i ==5)
                    break jumpto;
            }
        System.out.println("www");
        System.out.println(!(shoes instanceof Item));
    }
}

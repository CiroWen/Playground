package League;

public class Hero {
    public String name;
    public int hp;
    public int sp;
    public int armor;
    public int dmg;
    
    public Hero(){
        
    }
    public Hero(String name, int hp, int dmg) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }
    
     public static Hero hero1 = new Hero();
     
     public Hero getHero () {
         return hero1;
     }
     
     public void recover() {
         this.hp++;
     }
     
     public void hurt() {
         this.hp--;
     }
     public void attack(Hero...heros) {
         try {
             
             Thread.sleep(50);
         }
         catch(Exception e) {
             e.printStackTrace();
         }
         
         heros[0].hp -= this.dmg;
         System.out.println(""+heros[0].name +"is being attacked by"+ this.name+heros[0].name+"'s hp is decreased to"+heros[0].hp);
         if(heros[0].isDead()) {
             System.out.println(heros[0].name+"is dead");
         }
     }
     
     public boolean isDead() {
         return this.hp<=0?true:false;
     }
    
    public static void main(String[] args) {
        Hero teemo = new Hero();
        teemo.hp = 999;
        teemo.name = "Teemo";
        teemo.armor=999;
        teemo.sp = 520;
        System.out.println(teemo);
    }
    
    
    @Override
    public String toString() {
        return "hp is " + hp + " move speed is " + sp +" " +name;
    }
}


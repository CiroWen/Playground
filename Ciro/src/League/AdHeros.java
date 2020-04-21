package League;

public class AdHeros extends Hero implements ADskills{
    
    public void attack(Hero...heros) { //Parameter Hero...heros will be passed in as an Array.
        if(heros.length>1) {
        System.out.println(this.name+""+heros[0].name+heros[1].hp);
        }else 
            System.out.println("An hero just attacked himself" + heros.getClass());
            System.out.println(heros[0] instanceof AdHeros);
            System.out.println(heros[0] instanceof Hero);  //????
            System.out.println(heros[0] instanceof ADskills);
//            System.out.println(this.name+""+heros[0].name+heros[0].hp);
    }
    
    public void physicalDMG() {
        System.out.println("DMG");
    }
    
    public void physicalPEN() {
        System.out.println("PEN");
    }
    
    
    public static void main(String[]args) {
        
        Hero vn = new AdHeros();
        System.out.println(a);
        vn.name="Vayne";
        vn.hp=999;
        vn.attack(vn,vn);//Vn hits herself twice.
        System.out.println(vn.toString());
        
        ADskills a = new AdHeros();
        Hero h = new Hero();
        // won't workAdHeros ad = (AdHeros)new Hero();
        AdHeros ad = new AdHeros();
        Item ii = new Item();
//        ad.attack(ad);
//        h = ad;
//        h.attack(ad);
//        ad=(AdHeros)h;
//        ad.attack(ad);
        // this line won't work cus theres no relation between ADskills and Hero -->a= (ADskills)h;
        
        a.physicalDMG();
        System.out.println(a.a);
        System.out.println(ad instanceof Hero);
        System.out.println(ad instanceof AdHeros);
        System.out.println(ad instanceof ADskills);
        System.out.println(a instanceof Hero); //???
        System.out.println(a instanceof AdHeros);
        System.out.println(a instanceof ADskills);
        System.out.println(ii instanceof ADskills);
        // compile error System.out.println(ii instanceof Hero); 
        // System.out.println(ii instanceof AdHeros);
    }
}

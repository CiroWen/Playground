package ArrayList;

import java.util.LinkedList;
import League.Hero;

public class MyStack implements Stack{
     LinkedList<Hero> heros= new LinkedList<Hero>();
    public static void main(String[]agrs) {
        
        Hero hh = new Hero();
        MyStack my = new MyStack();
        my.push(hh);
        System.out.println(my.pull());
        
    }

    @Override
    public void push(Hero h) {
        // TODO Auto-generated method stub
        heros.addLast(h);
    }

    @Override
    public Hero pull() {
        // TODO Auto-generated method stub
        
        return heros.removeLast();
    }

    @Override
    public Hero peek() {
        // TODO Auto-generated method stub
        return heros.peekLast();
    }
}

package ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


    class Node{
        Node leftNode;
        Node rightNode;
        Object value;
        
        public void run(Object vertex) {
            System.out.println("1");
            if(this.value == null)
                // if the root node is empty
                value = vertex;
                // directly add the parameter object into the root node.
            else {
                // if the root node is not empty.
                if((Integer)this.value >= (Integer)vertex) {
                    // compare the vertex value with the value in previous node.
                    // and if the vertex value is smaller than the prevous node value, put it into leftNode.
                    if(leftNode == null)
                        //if leftNode has't been initialized.
                       leftNode = new Node();
                        //initialize it.
                       leftNode.run(vertex);
                       // since leftNode's value's not initialized, which means it's null.
                       // simply run run() again to insert it.
                }
            else {
                if(rightNode ==null)
                    rightNode = new Node();
                    rightNode.run(vertex);
            }
        }
        }
        
        //the LVR order Left Visit Right
        public List<Object> print(){
            List<Object> aa = new ArrayList<>();
            
            if(leftNode!=null) 
            aa.addAll(leftNode.print());
            aa.add(value);
            if(rightNode!=null)
            aa.addAll(rightNode.print());
            
            return aa;
        }
        
    }
    
    public class BinaryTree {
        public static void main(String[]args) {
            int[] ii = {5,6,7,0,4,5};
            Node n1 = new Node();
            for(int num: ii) {
            n1.run(num);
            }
            System.out.println(n1.print());
        }
    }
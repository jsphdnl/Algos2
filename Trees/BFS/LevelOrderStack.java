//Imports
import util.Node;
import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderStack {
  public static void main(String [] args){
    
   
   Queue<Node> queue1 = new LinkedList();
   Queue<Node> queue2= new LinkedList();

     Node node1 = new Node();
     node1.setData(3);
     Node node2 = new Node();
     node2.setData(4);
     Node node3 = new Node();
     node3.setData(5);

     node1.setRight(node2);
     node1.setLeft(node3);

     Node node4 = new Node();
     node4.setData(7);
     Node node5 = new Node();
     node5.setData(7);

     node2.setRight(node4);
     node2.setLeft(node5);
  
   queue1.add(node1);   
   printLevelOrder(queue1, queue2);
  }
  
  public static void printLevelOrder(Queue<Node>queue1, Queue <Node>queue2) {
      Node temp = queue1.poll();
      if(null == temp){
        return;
      }
     while(null != temp){
       System.out.print(temp.getData()+" ");
       if(null != temp.getLeft())  queue2.add(temp.getLeft());
       if(null != temp.getRight()) queue2.add(temp.getRight());
       temp = queue1.poll();
     }
  
     System.out.println(""); 
     printLevelOrder(queue2, queue1);
  }
}

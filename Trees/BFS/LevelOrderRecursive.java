
/* Imports*/
import util.Node;
import java.lang.Math;
public class LevelOrderRecursive {
   
  public static void main(String[] args) {
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

     printLevelOrder(node1);
     System.out.println("hello");
   }
   //level order traversal using recurssion
   //get height of the tree h;
   // for 1 to h print the current level
  
   /**
    print the height of the tree
   **/
   public static void  printLevelOrder(Node node){
    int height = getHeightOfTree(node);
    
    if(height == 0){
      System.out.println("Invalid tree height");
      return;
    }    

    System.out.println("height is " + height);
    for (int i =1; i<=height ; i++){
       printLevel(node, i);
       System.out.println("");
    }
   }

   /**
    Get the height of the tree
   **/
   public static int  getHeightOfTree(Node root){
      // base condition
      if(null == root)
        return 0;

      return 1+Math.max(getHeightOfTree(root.getRight()), getHeightOfTree(root.getLeft()));
   }
 
  /**
    Print nodes at level  
  **/
  public static void printLevel(Node node, int level){
    
    //if node is null
    if(null == node){
     return;
    }

    //if  level is one print
    if(level == 1){
      System.out.print(node.getData()+" ");
      return;
    }

    printLevel(node.getLeft(), level-1);
    printLevel(node.getRight(), level-1);
  }
  
}

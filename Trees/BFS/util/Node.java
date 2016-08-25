package util;
public class Node {
  
  private int data;
  private Node left;
  private Node right;
  
  public Node(){}
 
  public int getData(){
    return data;
  }
  
  public void setData(int data){
    this.data = data;
  }
  
  public Node getLeft(){
    return left;
  }

  public void setLeft(Node node){
    this.left = node;
  }

  public Node getRight(){
    return right;
  }

  public void setRight(Node node){
    this.right = node;
  }
}

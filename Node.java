public class Node{
 public Node(String value){
   data = value;
 }
 private String data;
 private Node next,prev;

 public String getData(){
   return data;
 }
 

 public String getNext(){
   return next.getData();
 }


 public String getPrev(){
   return prev.getData();
 }
 //write get/set methods for all three instance variables.
}

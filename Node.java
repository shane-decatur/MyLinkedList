public class Node{
 public Node(String value){
   data = value;
 }
 private String data;
 private Node next,prev;

 public String getData(){
   return data;
 }
 public void set(String value){
   data = value;
 }

 public Node getNext(){
   return next;
 }
 public void setNext(Node n){
   next = n;
 }

 public Node getPrev(){
   return prev;
 }
 public void setPrev(Node n){
   prev = n;
 }
}

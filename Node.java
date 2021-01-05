public class Node{
 public Node(String value){
   data = value;
 }
 private String data;
 private Node next,prev;

 public String get(){
   return data;
 }
 public void set(String value){
   data = value;
 }

 public String getNext(){
   return next.get();
 }
 public void setNext(String value){
   next.set(value);
 }

 public String getPrev(){
   return prev.get();
 }
 public void setPrev(String value){
   prev.set(value);
 }
}

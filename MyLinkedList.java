public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size = 0;
 }
 public int size(){
   return size;
 }
 public boolean add(String value){
   if (size == 0){
     start = new Node(value);
     end = start;
     size++;
   }
   else{
     Node temp = end;
     end.setNext(new Node(value));
     end = end.getNext();
     end.setPrev(temp);
     size++;
   }
   return true;
 }
 public void add(int index, String value){

 }
 public String get(int index){
   return null;
 }
 public String set(int index, String value){
   return null;
 }
 public String toString(){
   String list = "[";
   if (size > 0) list = list+start.getValue();
   Node current = start;
   while (current != null && current.getNext() != null){
     current = current.getNext();
     list = list+", "+current.getValue();
   }
   list = list+"]";
   return list;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}

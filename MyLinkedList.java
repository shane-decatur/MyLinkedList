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
   Node n = new Node(value);
   Node in = findIndex(index);
   if (size < 1){
     start = n;
     end = n;
     size++;
   }
   else if (in == start){
     n.setNext(start);
     start.setPrev(n);
     start = n;
     size++;
   }
   else if (in == null){
     end.setNext(n);
     n.setPrev(end);
     end = n;
     size++;
   }
   else{
     n.setNext(in);
     n.setPrev(in.getPrev());
     in.getPrev().setNext(n);
     in.setPrev(n);
     size++;
   }
 }

 public String get(int index){
   if (index < 0 || index >= size){
     throw new IndexOutOfBoundsException();
   }
   Node n = findIndex(index);
   return n.getData();
 }

 public String set(int index, String value){
   if (index < 0 || index > size){
     throw new IndexOutOfBoundsException();
   }
   Node n = findIndex(index);
   String temp = n.getData();
   n.setData(value);
   return temp;
 }

 public String remove(int index){
   if (index < 0 || index >= size){
     throw new IndexOutOfBoundsException();
   }
   Node n = findIndex(index);
   if (size == 1){
     start = null;
     end = null;
     size = 0;
   }
   else if (n == start){
     start = n.getNext();
     start.setPrev(null);
     n.setNext(null);
     size--;
   }
   else if (n == end){
     end = n.getPrev();
     end.setNext(null);
     n.setPrev(null);
     size--;
   }
   else{
     n.getPrev().setNext(n.getNext());
     n.getNext().setPrev(n.getPrev());
     n.setNext(null);
     n.setPrev(null);
     size--;
   }
   return n.getData();
 }

 public void extend(MyLinkedList other){
   end.setNext(other.start);
   end.getNext().setPrev(end);
   end = other.end;
   size += other.size();
   other.start = null;
   other.end = null;
   other.size = 0;
 }

 public String toString(){
   String list = "[";
   if (size > 0) list = list+start.getData();
   Node current = start;
   while (current != null && current.getNext() != null){
     current = current.getNext();
     list = list+", "+current.getData();
   }
   list = list+"]";
   return list;
 }

 public String toStringReversed(){
   String list = "[";
   if (size > 0) list = list+end.getData();
   Node current = end;
   while (current != null && current.getPrev() != null){
     current = current.getPrev();
     list = list+", "+current.getData();
   }
   list = list+"]";
   return list;
 }

 private Node findIndex(int index){
   if (index < 0 || index > size){
     throw new IndexOutOfBoundsException();
   }
   Node current = start;
   int i = 0;
   while (i < index){
     current = current.getNext();
     i++;
   }
   return current;
 }
 //Any helper method that returns a Node object MUST BE PRIVATE!
}

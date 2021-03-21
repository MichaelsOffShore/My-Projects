import java.util.*;

public class linkedList {
    Random random = new Random();

Node head = null;
int size;

public void insert(String data){

    Node node = new Node();
    node.data = data;
    node.next = null;
if(head == null){
    head = node;

} else{

Node n = head;
while(n.next != null){

n = n.next;

}
n.next = node;
}

}

public void remove(String r){

    Node n = head;

    boolean removal = false;

    if(head.data == r){

        head = head.next;
    } else{

        while(!removal){

            if(n.next.data == r){

                n.next = n.next.next;
                removal = true;
            }


            n = n.next;

        }

    }

    // To remove all instances of a String end the loop at the end of the linkedList

}
    
    
    
    
    
    
    public boolean isEmpty( ){
        return (head == null);
    }

public int listSize() {

     size = 1;

    Node node = head;
    while(node.next != null){


    size += 1;
    node = node.next;
    }

return size;
}

    
    
    
    
public void printList(){

    Node node = head;




    while(node != null){

        System.out.println(node.data + "-->");
        node = node.next;
    }

}

}



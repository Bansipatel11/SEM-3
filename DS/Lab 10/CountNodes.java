//Count Number of Nodes in Circularly Linked List
public class CountNodes {    
           
        public class Node{    
            int data;    
            Node link;    
            public Node(int data) {    
                this.data = data;    
            }    
        }    
            
        public int count;        
        public Node first = null;    
        public Node last = null;    
            
        //This function will add the new node at the end of the list.    
        public void Insert(int data){    
              
            Node newNode = new Node(data);    
            
            if(first == null) {    
                
                first = newNode;    
                last = newNode;    
                newNode.link = first;    
            }    
            else {    
                    
                last.link = newNode;    
                    
                last = newNode;    
                
                last.link = first;    
            }    
        }    
            
        //This function will count the nodes of circular linked list    
        public void countNodes() {    
            Node temp = first;    
            do{       
                count++;    
                temp = temp.link;    
            }while(temp != first);    
            System.out.println("Count of nodes in circular linked list: "+count);    
        }    
            
        public static void main(String[] args) {    
            CountNodes c = new CountNodes();    
            c.Insert(1);    
            c.Insert(2);    
            c.Insert(4);    
            c.Insert(1);    
            c.Insert(2);    
            c.Insert(3);    
           
            c.countNodes();    
        }    
}   
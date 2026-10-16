class MyHashSet {

    Node[] array;

    public MyHashSet() {
        array = new Node[10000];
    }
    
    public void add(int key) {
        
        var index = key%10000;
        if(array[index] == null){
            array[index] = new Node(key,null);
        }else{
            var node = array[index];
            while(true){
                if(node.key == key){
                    return;
                }

                if(node.next == null){
                    node.next = new Node(key,null);
                    return;
                }else{
                    node = node.next;
                }
            }
        }
    }
    
    public void remove(int key) {
        
         var index = key%10000;
        var node = array[index];

        if(node == null){
            return;
        }
        Node parentNode=null;

        while(true){
            if(node.key == key){
                if(parentNode==null){
                    array[index] = node.next;
                }else{
                    parentNode.next = node.next;
                }
                return;
            }else if(node.next==null){
                return;
            }else{
                node = node.next;
                parentNode = node;
            }
        }
        
    }
    
    public boolean contains(int key) {
        var index = key%10000;
        var node = array[index];

        if(node==null){
            return false;
        }

        while(true){
            if(node.key==key){
                return true;
            }else if(node.next==null){
                return false;
            }else{
                node = node.next;
            }
        }
    }
}

class Node{

    public int key;
    public Node next;

    Node(int key,Node next){
        this.key = key;
        this.next = next;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
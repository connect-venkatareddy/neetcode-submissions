class MyHashMap {

    Node[] array;
    public MyHashMap() {
        array = new Node[10000];
    }
    
    public void put(int key, int value) {
        var index = key%10000;
        var node = array[index];

        if(node==null){
            array[index] = new Node(key,value,null);
            return;
        }

        while(true){

            if(node.key==key){
                node.value=value; // updated value
                return;
            }else if(node.next==null){
                node.next = new Node(key,value,null); // put value
                return;
            }else{
                node = node.next;
            }
        }
    }
    
    public int get(int key) {
        var index = key%10000;
        var node = array[index];

        if(node == null){
            return -1;
        }

        while(true){
            if(node.key==key){
                return node.value;
            }else if(node.next==null){
                return -1;
            }else{
                node = node.next;
            }
        }
    }
    
    public void remove(int key) {
        var index = key%10000;
        var node = array[index];

        if(node==null){
            return;
        }

        Node pNode=null;

        while(true){

            if(node.key==key){
                if(pNode==null){
                    array[index]= node.next;
                }else{
                    pNode.next = node.next;
                }
                return;
            }else if(node.next==null){
                return;
            }else{
                pNode=node;
                node = node.next;
            }
        }
    }
}

class Node{
    public int key;
    public int value;
    public Node next;

    public Node(int key,int value,Node next){
        this.key= key;
        this.value=value;
        this.next= next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
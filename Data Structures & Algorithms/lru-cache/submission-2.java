class Node {
    int key, val;
    Node prev, next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class LRUCache {
    int count, capacity;
    Node head, tail;
    Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.cache = new HashMap<>();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void insert(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    public int get(int key) {
        Node node = cache.get(key);
        if(node == null) return -1;
        else {
            remove(node);
            insert(node);
            return node.val;
        }
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);
        
        if(node == null) {
            node = new Node(key, value);
            cache.put(key, node);
            insert(node);
            count++;
        } else {
            node.val = value;
            remove(node);
            insert(node);
        }

        if(count > capacity) {
            Node toDel = tail.prev;
            remove(toDel);
            cache.remove(toDel.key);
            count--;
        }
    }   
}

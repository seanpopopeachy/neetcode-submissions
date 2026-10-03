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
    private int count, capacity;
    private Map<Integer, Node> cache;
    private Node left, right;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        this.cache = new HashMap<>();
        this.left = new Node(0 ,0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        node.prev = left;
        node.next = left.next;
        left.next.prev = node;
        left.next = node;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if(node == null) return -1;
        remove(node);
        insert(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        Node node = cache.get(key);

        if(node == null) {
            node = new Node(key, value);
            insert(node);
            cache.put(key, node);
            count++;
        } else {
            node.val = value;
            remove(node);
            insert(node);
        }

        if(count > capacity) {
            Node toDel = right.prev;
            remove(toDel);
            cache.remove(toDel.key);
            count--;
        }
    }
}

package org.example.problems.linked_list;

import java.util.HashMap;

/*
    Implement the Least Recently Used (LRU) cache class LRUCache. The class should support the following operations

    LRUCache(int capacity) Initialize the LRU cache of size capacity.
    int get(int key) Return the value corresponding to the key if the key exists, otherwise return -1.
    void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache.
    If the introduction of the new pair causes the cache to exceed its capacity, remove the least recently used key.

    A key is considered used if a get or a put operation is called on it.

    Ensure that get and put each run in O(1)O(1) average time complexity.
 */
public class LRUCache {

    public class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    private int cap;
    private HashMap<Integer, Node> cache;
    private Node left; // Least Recently Used
    private Node right; // Most Recently Used

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    private void remove(Node node) {
        Node previousNode = node.prev;
        Node nextNode = node.next;
        previousNode.next = nextNode;
        nextNode.prev = previousNode;
    }

    private void insertToMRU(Node node) {
        Node previousNode = this.right.prev;
        this.right.prev = node;
        previousNode.next = node;
        node.next = this.right;
        node.prev = previousNode;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insertToMRU(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node oldNode = cache.get(key);
            remove(oldNode);
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insertToMRU(newNode);

        if (cache.size() > cap) {
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

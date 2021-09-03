package com.example.model;

public class MyMap<K, V> {

    private int size;

    public int getSize() {
        return size;
    }

    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node<K, V>[] nodes = new Node[10];

    public void put(K key, V value) {
        nodes[size++] = new Node<K, V>(key, value);
    }

    public V get(K key) {
        for (Node<K, V> node : nodes) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

}

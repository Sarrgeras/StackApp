package util;

import java.util.LinkedList;

public class SpecialStack<T> {
    private LinkedList<T> specialStack = new LinkedList<T>();
    private static class Node<T> {

        // данные
        public T data;
        // указатель на следующий элемент
        public Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> first = null;

    public void push(T v){
        specialStack.addFirst(v);
        Node<T> addFirst = new Node<T>(v);
        addFirst.next = first;
        first = addFirst;
    }


    public T peek(){
        return specialStack.getFirst();
    }
    public T pop(){
        Node<T> oldFirst = first;
        first = first.next;
        return specialStack.removeFirst();
    }

    public Node<T> nextTo(){
        Node<T> nextNode = first;
        return first;
    }
    public String size(){
        return String.valueOf(specialStack.size());
    }
    public void removeAll(){
        specialStack.clear();
    }
    public T getIndex(int index) {
        return specialStack.get(index);
    }
    public boolean empty(){
        return specialStack.isEmpty();
    }
    public String toString(){
        return specialStack.toString();
    }
}


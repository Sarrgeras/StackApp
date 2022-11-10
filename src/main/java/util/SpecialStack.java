package util;

import java.util.LinkedList;

public class SpecialStack<T> {
    private LinkedList<T> specialStack = new LinkedList<T>();

    public void push(T v){
        specialStack.addFirst(v);
    }
    public T peek(){
        return specialStack.getFirst();
    }
    public T pop(){
        return specialStack.removeFirst();
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
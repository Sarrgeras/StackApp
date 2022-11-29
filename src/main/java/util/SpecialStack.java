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
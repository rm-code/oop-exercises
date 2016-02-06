public class Stack {
    private Object[] stack;
    private int pointer;

    public Stack(int size) {
        stack = new Object[size];
        pointer = 0;
    }

    public Object pop() {
        return stack[--pointer];
    }

    public void push(Object nobj) {
        stack[pointer++] = nobj;
    }

    public int getSize() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public boolean isFull() {
        return pointer == stack.length;
    }
}

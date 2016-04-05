package de.stack;

public class Stack {
    private Object[] stack;
    private int pointer;

    public Stack( int size ) {
        stack = new Object[size];
        pointer = 0;
    }

    public Object pop() throws EmptyStackException {
        try {
            return stack[--pointer];
        } catch( ArrayIndexOutOfBoundsException e ) {
            pointer++;
            throw new EmptyStackException( "Can't pop from an empty stack." );
        }
    }

    public void push( Object nobj ) throws FullStackException {
        try {
            stack[pointer++] = nobj;
        } catch( ArrayIndexOutOfBoundsException e ) {
            pointer--;
            throw new FullStackException( "Can't push to a full stack." );
        }
    }
}

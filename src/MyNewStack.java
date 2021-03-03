public class MyNewStack {
    private int[] element;
    private int lastLocationWritten = -1;

    public MyNewStack(int numberOfElements){
        element = new int[numberOfElements];
    }


    public void push(int elementToPush) {
        element[++lastLocationWritten] = elementToPush;

    }

    public int peek() {
        return element[lastLocationWritten];
    }

    public int pop() {
        int lastElement = element[lastLocationWritten];
        element[lastLocationWritten--] = 0;
        return lastElement;
    }

    public boolean isEmpty() {
        return (lastLocationWritten == -1);

    }

    public boolean isFull() {
        return (lastLocationWritten == (element.length-1));
    }
    public static class StackOverflowException extends RuntimeException  {


    }

}

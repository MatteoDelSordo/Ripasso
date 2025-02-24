package stack;

public class Stack {
    static final int MAX = 1000;

    int top;
    int[] a = new int[MAX];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;


    }


    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("stack overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + "Pushed into stack");
            return true;
        }
    }
}

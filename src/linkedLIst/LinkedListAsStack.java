package linkedLIst;

import java.util.LinkedList;

public class LinkedListAsStack {

    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);
        System.out.println(stack);
    }


}

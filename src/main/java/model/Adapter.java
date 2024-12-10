package model;
import java.util.ArrayList;
import java.util.Stack;

public class Adapter {
    private Stack<Integer> stack;

    public Adapter() {
        stack = new Stack<>();
    }

    public void insert(Integer value) {
        stack.push(value);
    }

    public void delete() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public boolean find(Integer value) {
        return stack.contains(value);
    }

    public ArrayList<String> display() {
        ArrayList<String> result = new ArrayList<>();
        for (Integer value : stack) {
            result.add(value.toString());
        }
        return result;
    }
}

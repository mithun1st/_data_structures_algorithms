package Stack;

import java.util.ArrayList;

class MinStack {

    private ArrayList<Integer> stack;
    private ArrayList<Integer> minStore;

    public MinStack() {
        minStore = new ArrayList<>();
        stack = new ArrayList<>();
    }

    private int minValue;
    private int point = 0;

    public void push(int val) {
        if (stack.isEmpty() || val < minValue) {
            minValue = val;
        }
        minStore.add(point, minValue);
        stack.add(point, val);
        point++;
    }

    public void pop() {
        point--;
        stack.remove(point);
        minStore.remove(point);

        if (point > 0) {
            minValue = getMin();
        }
    }

    public int top() {
        return stack.get(point - 1);
    }

    public int getMin() {
        return minStore.get(point - 1);
    }
}

public class P155 {
    public static void main(String[] args) {

        MinStack s = new MinStack();
        s.push(2);
        s.push(0);
        s.push(3);
        s.push(0);
        System.out.println(s.getMin());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.getMin());

    }

    ///
    /// ["MinStack","push","push","push","getMin","pop","top","getMin"]
    /// [ [], [-2], [0], [-3], [], [], [], []]
    /// [ null, null, null, null, -3, null, 0, -2]
    ///

    ///
    /// ["MinStack","push","push","getMin","getMin","push","getMin","getMin","top","getMin","pop","push","push","getMin","push","pop","top","getMin","pop"]
    /// [[],[-10],[14],[],[],[-20],[],[],[],[],[],[10],[-7],[],[-7],[],[],[],[]]
    /// Output
    /// [null,null,null,-10,-10,null,-20,-20,-20,-20,null,null,null,-20,null,null,-7,-20,null]
    /// Expected
    /// [null,null,null,-10,-10,null,-20,-20,-20,-20,null,null,null,-10,null,null,-7,-10,null]
    ///
}

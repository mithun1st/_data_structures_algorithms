package Stack;

import java.util.HashMap;

class StackC {
    private char[] arr;

    StackC(int size) {
        this.arr = new char[size];
    }

    private int point = 0;

    Boolean isEmpty() {
        return point == 0;
    }

    void push(char chh) {
        // if (point >= arr.length) {
        // throw new Exception("Stack overflow");
        // }
        arr[point] = chh;
        point++;
    }

    char pop() {
        // if (point <= 0) {
        // throw new Exception("Stack is Empty");
        // }
        point--;
        return arr[point];
    }

}

public class P20 {

    static public boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        StackC stack = new StackC(s.length());

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(map.get(c));
            } else {

                if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // System.out.println(isValid("{[][()](})"));
        System.out.println(isValid("["));

    }
}
package Stack;

class Stac {
    private final int[] stack;

    Stac(int len) {
        stack = new int[len];
    }

    private int position = 0;

    void push(int value) {
        stack[position] = value;
        position++;
    }

    int pop() {
        position--;
        final int tem = stack[position];
        stack[position] = 0;
        return tem;
    }
}

public class P150 {
    public static int calculate(int x, int y, String o) {
        if (o.equals("+")) {
            return (x + y);
        } else if (o.equals("-")) {
            return (x - y);
        } else if (o.equals("*")) {
            return (x * y);
        } else if (o.equals("/")) {
            return (x / y);
        }
        return 0;
    }

    public static int evalRPN(String[] tokens) {
        Stac stack = new Stac(tokens.length);

        for (int i = 0; i < tokens.length; i++) {
            final String element = tokens[i];

            if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")) {
                final int y = stack.pop();
                final int x = stack.pop();
                final int result = calculate(x, y, element);

                stack.push(result);
            } else {
                stack.push(Integer.parseInt(element));
            }
        }
        final int result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] { "2", "1", "+", "3", "*" }));
    }
}
